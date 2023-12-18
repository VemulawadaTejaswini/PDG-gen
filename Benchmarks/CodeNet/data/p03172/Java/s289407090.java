
import java.util.Scanner;

public class Main {

  static long[][] dp;
  static boolean[][] dpPresent;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] arr = new int[N];
    dp = new long[N + 1][K + 1];
    dpPresent = new boolean[N + 1][K + 1];
    for (int i = 0; i < N; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.println(solve(arr, N - 1, K));
  }

  private static long solve(int[] arr, int n, int k) {

    if (n == 0) {
      if (arr[n] >= k) {
        dp[0][k] = 1;
        dpPresent[0][k] = true;
        return dp[0][k];
      } else {
        dp[0][k] = 0;
        dpPresent[0][k]=true;
        return dp[0][k];
      }
    } else {
      long ans = 0;
      int MOD = 1000000007;
      if (!dpPresent[n][k]) {
        for (int i = 0; i <= arr[n] && k >= i; i++) {
          long tempAns = solve(arr, n - 1, k - i);
          tempAns %= MOD;
          ans += tempAns;
          ans %= MOD;
        }
        dp[n][k] = ans;
        dpPresent[n][k] = true;
      }
      return dp[n][k];
    }
  }
}
