package exp.jedis;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisExp
{
  public static void main(String[] args)
  {
    //Connecting to Redis server on localhost
    Jedis jedis = new Jedis("localhost");
    System.out.println("Connected to server");

    jedis.set("tutorial-name", "Redis tutorial");
    // Get the stored data and print it
    System.out.println("Stored string in redis: " + jedis.get("tutorial-name"));

    Set<String> keys = jedis.keys("*");
    for (String key : keys) {
      System.out.println("Key: " + key);
    }
  }
}
