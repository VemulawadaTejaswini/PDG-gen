import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long MOD = 1_000_000_007;
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] s = new int[N];
    int[] t = new int[M];
    for (int i = 0; i < N; i++) s[i] = scanner.nextInt();
    for (int i = 0; i < M; i++) t[i] = scanner.nextInt();

    long[][] dp = new long[N + 1][M + 1];
    for (int i = 0; i < N + 1; i++) dp[i][0] = 1;
    for (int i = 0; i < M + 1; i++) dp[0][i] = 1;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= M; j++) {
        dp[i][j] = dp[i - 1][j];
        dp[i][j] += dp[i][j - 1];
        if (dp[i][j] >= MOD) dp[i][j] -= MOD;
        if (s[i - 1] != t[j - 1]) {
          dp[i][j] -= dp[i - 1][j - 1];
          if (dp[i][j] < 0) dp[i][j] += MOD;
        }
      }
    }
    System.out.println(dp[N][M]);
  }
}
