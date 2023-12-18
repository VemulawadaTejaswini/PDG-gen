import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    int[] w = new int[N];
    int[] v = new int[N];
    for (int i = 0; i < N; i++) {
      w[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }
    sc.close();

    Map<Integer, Long> dp = new HashMap<>();
    Long ZERO = Long.valueOf(0L);
    dp.put(0, ZERO);
    for (int i = 0; i < N; i++) {
      for (int j = W; w[i] <= j; j--) {
        Integer jwi = Integer.valueOf(j - w[i]);
        if (!dp.containsKey(jwi)) continue;
        dp.put(j, Math.max(dp.getOrDefault(j, ZERO), dp.get(jwi) + v[i]));
      }
    }

    long ans = 0;
    for (long val : dp.values()) ans = Math.max(ans, val);
    System.out.println(ans);
  }
}
