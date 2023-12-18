import java.util.Scanner;

/** dp[n][v]: n番目の荷物までで価値がv以上の時の重さの最小値 */
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    int w = Integer.parseInt(scanner.next());
    int[][] wv = new int[n][2];
    int wi, vi;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 2; j++) {
        wv[i][j] = Integer.parseInt(scanner.next());
      }
    }
    int v = 10000;
    long[][] dp = new long[n + 1][v + 1];
    for (int i = 0; i < n + 1; i++) {
      for (int j = 0; j < v + 1; j++) {
        dp[i][j] = 100000000000L;
      }
    }
    for (int i = 0; i < n + 1; i++) {
      dp[i][0] = 0L;
    }
    for (int i = 1; i < n + 1; i++) {
      wi = wv[i - 1][0];
      vi = wv[i - 1][1];
      for (int j = 1; j < v + 1; j++) {
        if (j - vi >= 0) {
          dp[i][j] = Math.min(dp[i - 1][j - vi] + wi, dp[i - 1][j]);
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }
    for (int j = v; j >= 0; j--) {
      if (dp[n][j] > w) {
        continue;
      }
      System.out.println(j);
      break;
    }
  }
}
