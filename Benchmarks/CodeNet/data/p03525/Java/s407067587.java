import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] D = new int[N + 1];
    for (int i = 1; i <= N; i++) D[i] = scanner.nextInt();
    Arrays.sort(D);
    for (int i = 0; i <= N; i++) {
      if (i + 2 <= N && D[i] == D[i + 1] && D[i] == D[i + 2]) {
        System.out.println(0);
        return;
      }
    }

    int[][] dp = new int[N + 1][N + 1];
    final int INF = 100;
    for (int i = 0; i <= N; i++) dp[i][i] = INF;

    for (int i = 1; i <= N; i++) {
      for (int j = 0; j < i; j++) {
        dp[i][j] = Math.max(dp[i][j], min(dp[i - 1][j], D[i] - D[i - 1], 24 - D[i] - D[j]));
        dp[i][j] = Math.max(dp[i][j], min(dp[i - 1][j], D[i] - D[j], 24 - D[i] - D[i - 1]));
      }
    }

    int max = 0;
    for (int i = 0; i < N; i++) max = Math.max(max, dp[N][i]);
    System.out.println(max);
  }

  private static int min(int a, int b, int c) {
    return Math.min(a, Math.min(b, c));
  }
}
