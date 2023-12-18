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

    int v_sum = 0;
    for (int vi : v) v_sum += vi;

    long[] dp = new long[v_sum + 1];
    Arrays.fill(dp, -1);
    dp[0] = 0;

    long ans = 0;
    for (int i = 0; i < N; i++) {
      for (int j = v_sum; v[i] <= j; j--) {
        if (dp[j - v[i]] < 0) continue;
        long dpj = dp[j - v[i]] + w[i];
        if (W < dpj) continue;
        if (dp[j] < 0 || dpj < dp[j]) {
          dp[j] = dpj;
          ans = Math.max(ans, j);
        }
      }
    }
    System.out.println(ans);
  }
}