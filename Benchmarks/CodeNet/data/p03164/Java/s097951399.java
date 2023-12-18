import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int MAX_V = 100 * 1000;
    int N = scanner.nextInt();
    int W = scanner.nextInt();
    int[] w = new int[N + 1];
    int[] v = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      w[i] = scanner.nextInt();
      v[i] = scanner.nextInt();
    }

    long INF = 1_000_000_000_000L;
    long[][] dp = new long[N + 1][MAX_V + 1];
    for (int i = 1; i <= MAX_V; i++) dp[0][i] = INF;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= MAX_V; j++) {
        dp[i][j] = dp[i - 1][j];
        if (j >= v[i]) dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - v[i]] + w[i]);
      }
    }
    for (int i = MAX_V; i >= 0; i--) {
      if (dp[N][i] <= W) {
        System.out.println(i);
        return;
      }
    }
  }
}
