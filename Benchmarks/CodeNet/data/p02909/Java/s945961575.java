import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Map map = new HashMap();
    map.put("Sunny", "Cloudy");
    map.put("Cloudy", "Rainy");
    map.put("Rainy", "Sunny");
    
 	String s = sc.next();

    String result = (String) map.get(s);

    System.out.println(result);
  }
}

