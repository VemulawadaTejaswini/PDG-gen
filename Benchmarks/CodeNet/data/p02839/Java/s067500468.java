import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int[][] A = new int[H + 1][W + 1];
    int[][] B = new int[H + 1][W + 1];
    for (int i = 1; i <= H; i++) for (int j = 1; j <= W; j++) A[i][j] = scanner.nextInt();
    for (int i = 1; i <= H; i++) for (int j = 1; j <= W; j++) B[i][j] = scanner.nextInt();

    int M = 512000;
    boolean[][][] dp = new boolean[H + 1][W + 1][M + 1];
    dp[1][0][0] = true;
    dp[0][1][0] = true;
    for (int i = 1; i <= H; i++) {
      for (int j = 1; j <= W; j++) {
        int d = Math.abs(A[i][j] - B[i][j]);
        for (int k = 0; k <= M; k++) {
          int e = Math.abs(k - d);
          dp[i][j][e] |= dp[i - 1][j][k];
          dp[i][j][e] |= dp[i][j - 1][k];
          if (k + d <= M) {
            dp[i][j][k + d] |= dp[i - 1][j][k];
            dp[i][j][k + d] |= dp[i][j - 1][k];
          }
        }
      }
    }
    for (int i = 0; i <= M; i++) {
      if (dp[H][W][i]) {
        System.out.println(i);
        return;
      }
    }
  }
}
