import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static final long MOD = 1_000_000_007;

  public static void main(String[] args) {
    int N = sc.nextInt();
    int M = sc.nextInt();
    long[][][] dp = new long[2][N][N]; // dp[][can return to 1][on current path]
    dp[0][0][0] = 1;
    int t = 1;
    for (int i = 0; i < M; i++) {
      for (long[] a : dp[t]) {
        Arrays.fill(a, 0L);
      }
      for (int j = 0; j < N; j++) {
        for (int k = 0; j + k < N; k++) {
          dp[t][j + k][0] += dp[1 - t][j][k]; // go to city 1
          dp[t][j + k][0] %= MOD;

          dp[t][j][k] += dp[1 - t][j][k] * (j + k); // go to a city on current path
          dp[t][j][k] %= MOD;

          if (k < N - 1) {
            dp[t][j][k + 1] += dp[1 - t][j][k] * (N - 1 - j - k); // go to a city does not have a path to city 1
            dp[t][j][k + 1] %= MOD;
          }
        }
      }
      t = 1 - t;
    }
//      for (int j = 0; j < N; j++) {
//        System.out.println(Arrays.toString(dp[1-t][j]));
//      }
//      System.out.println();
    System.out.println(dp[1 - t][N - 1][0]);
  }
}
