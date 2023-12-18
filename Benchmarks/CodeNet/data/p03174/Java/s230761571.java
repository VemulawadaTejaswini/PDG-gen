import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int[][] a = new int[N + 1][N];
    for (int i = 1; i <= N; i++) for (int j = 0; j < N; j++) a[i][j] = scanner.nextInt();

    long[][] dp = new long[N + 1][1 << N];
    dp[0][0] = 1;

    for (int j = 1; j < 1 << N; j++) {
      int cnt = 0;
      int n = j;
      while (n > 0) {
        if (n % 2 == 1) cnt++;
        n >>= 1;
      }
      for (int i = 0; i < N; i++) {
        if ((j & (1 << i)) != 0) {
          dp[cnt][j] += dp[cnt - 1][j ^ (1 << i)] * a[cnt][i];
          if (dp[cnt][j] > M) dp[cnt][j] -= M;
        }
      }
    }
    System.out.println(dp[N][(1 << N) - 1]);
  }
}
