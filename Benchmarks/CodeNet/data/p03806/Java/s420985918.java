import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int Ma = scanner.nextInt();
    int Mb = scanner.nextInt();
    int[] a = new int[N + 1];
    int[] b = new int[N + 1];
    int[] c = new int[N + 1];

    for (int i = 1; i <= N; i++) {
      a[i] = scanner.nextInt();
      b[i] = scanner.nextInt();
      c[i] = scanner.nextInt();
    }

    int INF = 10_000;
    int[][][] dp = new int[N + 1][11][11];
    for (int i = 0; i <= N; i++)
      for (int j = 0; j < 11; j++)
        for (int k = 0; k < 11; k++) dp[i][j][k] = INF;
    dp[0][0][0] = 0;

    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= 10; j++) {
        for (int k = 1; k <= 10; k++) {
          dp[i][j][k] = dp[i - 1][j][k];
          if(j >= a[i] && k >= b[i] && dp[i - 1][j - a[i]][k - b[i]] >= 0) {
            dp[i][j][k] = Math.min(dp[i][j][k], dp[i - 1][j - a[i]][k - b[i]] + c[i]);
          }
        }
      }
    }

    int min = INF;
    for (int i = 1; i <= 10; i++)
      for (int j = 1; j <= 10; j++)
        if (dp[N][i][j] < INF && Ma * j == Mb * i) min = Math.min(min, dp[N][i][j]);

    if (min >= INF) {
      System.out.println(-1);
    } else {
      System.out.println(min);
    }
  }
}
