import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<Map<Character, Integer>, Integer> mm = new HashMap<>();
    for (int i = 0; i < N; i++) {
      String a = sc.next();
      Map<Character, Integer> m = new HashMap<>();
      for (char c : a.toCharArray()) {
        m.put(c, m.getOrDefault(c, 0) + 1);
      }
      mm.put(m, mm.getOrDefault(m, 0) + 1);
    }
    
    long ans = 0;
    for (int v : mm.values()) {
      for (int i = 1; i < v; i++) {
        ans += i;
      }
    }
    
    System.out.println(ans);
  }
}