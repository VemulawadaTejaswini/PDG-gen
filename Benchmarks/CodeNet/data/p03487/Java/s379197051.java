import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      map.put(a, map.getOrDefault(a, 0)+1);
    }
    int ans = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int a = entry.getKey();
      int count = entry.getValue();
      if (count < a) {
        ans += count;
      } else if (count > a) {
        ans += count - a;
      }
    }
    System.out.println(ans);
  }
}