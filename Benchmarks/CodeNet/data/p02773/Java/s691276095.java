import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<String, Integer> map = new TreeMap<>();
    int max = 0;
    for (int i = 0; i < N; i++) {
      String s = sc.next();
      if (map.containsKey(s)) map.put(s, map.get(s) + 1);
      else map.put(s, 1);
      max = Math.max(max, map.get(s));
    }
    sc.close();
    for (String key : map.keySet()) {
      if (map.get(key) == max) System.out.println(key);
    }
  }
}