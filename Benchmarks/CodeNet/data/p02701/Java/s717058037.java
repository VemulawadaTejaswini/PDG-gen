import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Map<String, Integer> map = new HashMap<>();

    while (n-- >0) {
      String s = sc.nextLine();

      map.put(s, map.getOrDefault(s, 0) + 1);
    }
    sc.close();

    System.out.println(map.keySet().stream().distinct().count());
  }
}