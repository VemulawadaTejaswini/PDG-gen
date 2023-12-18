import java.util.*;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    Map<String, Integer> map = new HashMap<>();

    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      String key = sc.next();
      map.computeIfPresent(key, (k, v) -> (v + 1));
      map.putIfAbsent(key, 1);
    }

    int M = sc.nextInt();
    for (int i = 0; i < M; i++) {
      String key = sc.next();
      map.computeIfPresent(key, (k, v) -> (v - 1));
      map.putIfAbsent(key, -1);
    }

    int ans = 0;
    for (Entry<String, Integer> e : map.entrySet()) {
      ans = Math.max(ans, e.getValue());
    }
    System.out.println(ans);
  }
}
