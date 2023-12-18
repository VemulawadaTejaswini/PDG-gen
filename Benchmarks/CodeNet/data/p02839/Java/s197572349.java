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

    boolean[][][] dp = new boolean[H + 1][W + 1][1024001];
    for (int i = 0; i < H; i++) dp[i][0][512000] = true;
    for (int i = 0; i < W; i++) dp[0][i][512000] = true;
    for (int i = 1; i <= H; i++) {
      for (int j = 1; j <= W; j++) {
        int d = Math.abs(A[i][j] - B[i][j]);
        for (int k = 0; k <= 1024000; k++) {
          if (k >= d) dp[i][j][k] |= dp[i - 1][j][k - d];
          if (k + d <= 1024000) dp[i][j][k] |= dp[i - 1][j][k + d];
          if (k >= d) dp[i][j][k] |= dp[i][j - 1][k - d];
          if (k + d <= 1024000) dp[i][j][k] |= dp[i][j - 1][k + d];
        }
      }
    }
    int min = 1024000;
    for (int i = 0; i <= 1024000; i++) if (dp[H][W][i]) min = Math.min(min, Math.abs(i - 512000));
    System.out.println(min);
  }
}
