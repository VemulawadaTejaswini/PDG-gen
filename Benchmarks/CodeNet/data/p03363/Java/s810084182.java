import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String, Long> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      map.put(i + "_" + 1, sc.nextLong());
    }
    long count = 0L;
    for (int len = 0; len < n; len++) {
      for (int idx = 0; idx < n - len; idx++) {
        long aa;
        int ll = len + 1;
        if (ll == 1) {
          aa = map.get(idx + "_" + ll);
        } else {
          int half = ll / 2;
          int rest = ll - half;
          aa = map.get(idx + "_" + half) + map.get((idx + half) + "_" + rest);
          map.put(idx + "_" + ll, aa);
        }
        if (aa == 0) {
          count += 1;
        }
      }
    }

    System.out.println(count);
  }
}
