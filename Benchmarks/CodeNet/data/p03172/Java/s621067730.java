import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++)
      a[i] = sc.nextInt();
    sc.close();

    int mod = 1000000007;

    int[][] dp = new int[N + 1][K + 1];
    dp[0][0] = 1;
    int[] cusum = new int[dp[0].length + 1];

    for (int i = 1; i < N + 1; i++) {
      for (int j = 1; j < cusum.length; j++)
        cusum[j] = (cusum[j - 1] + dp[i - 1][j - 1]) % mod;
      for (int j = 0; j < K + 1; j++)
        dp[i][j] = cusum[j + 1] - cusum[Math.max(0,  j - a[i - 1])];
    }

    int ans = dp[N][K];
    System.out.println(ans);
  }
}