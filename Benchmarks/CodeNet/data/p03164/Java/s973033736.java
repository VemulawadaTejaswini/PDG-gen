import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    int[][] wv = new int[N][2];
    for (int i = 0; i < N; i++) {
      wv[i][0] = sc.nextInt();
      wv[i][1] = sc.nextInt();
    }
    sc.close();

    int[] vsum = new int[N];
    for (int i = N - 1; 0 < i; i--)
      vsum[i - 1] = vsum[i] + wv[i][1];

    Map<Integer, Long> dp = new HashMap<>();
    Long ZERO = Long.valueOf(0L);
    dp.put(0, ZERO);
    long max_value = 0;
    for (int i = 0; i < N; i++) {
      Set<Integer> keys = new HashSet<>(dp.keySet());
      for (Integer j : keys) {
        Integer jwi = Integer.valueOf(j + wv[i][0]);
        if (W < jwi) continue;
        long selected_value = Math.max(dp.getOrDefault(jwi, ZERO), dp.get(j) + wv[i][1]);
        if (selected_value < dp.getOrDefault(jwi, ZERO) || selected_value + vsum[i] < max_value) {
          dp.remove(j);
        } else {
          dp.put(jwi, selected_value);
          max_value = Math.max(max_value, selected_value);
        }
      }
    }

    long ans = 0;
    for (long val : dp.values()) ans = Math.max(ans, val);
    System.out.println(ans);
  }
}