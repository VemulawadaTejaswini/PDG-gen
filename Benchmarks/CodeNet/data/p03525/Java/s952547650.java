import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] D = new int[N + 1];
    for (int i = 1; i <= N; i++) D[i] = scanner.nextInt();
    Arrays.sort(D);
    int[][] dp = new int[N + 1][N + 1];
    final int INF = 100;
    for (int i = 0; i <= N; i++) dp[i][i] = INF;

    for (int i = 1; i <= N; i++) {
      for (int j = 0; j < i; j++) {
        dp[i][j] = Math.min(Math.min(dp[i - 1][j], D[i] - D[i - 1]), 24 - D[j] - D[i]);
        if (j == i - 1) {
          for (int k = 0; k < i; k++) {
            dp[i][j] =
                Math.max(dp[i][j], Math.min(Math.min(dp[j][k], D[i] - D[k]), 24 - D[j] - D[i]));
          }
        }
        dp[j][i] = dp[i][j];
      }
    }

    int max = 0;
    for (int i = 0; i < N; i++) max = Math.max(max, dp[N][i]);
    System.out.println(max);
  }
}
