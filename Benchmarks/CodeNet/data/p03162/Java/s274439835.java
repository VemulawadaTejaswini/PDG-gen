import java.util.Arrays;
import java.util.Scanner;

class Main {

  private static long INF = -Long.MAX_VALUE / 4;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    int[][] p = new int[N][3];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < 3; j++) {
        p[i][j] = Integer.parseInt(scanner.next());
      }
    }
    long[][] dp = new long[N + 1][3];
    for (long[] ls : dp) {
      Arrays.fill(ls, INF);
    }
    Arrays.fill(dp[0], 0);
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          if (j != k) {
            dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + p[i - 1][j]);
          }
        }
      }
    }
    long ans = INF;
    for (long i : dp[N]) {
      ans = Math.max(ans, i);
    }
    System.out.println(ans);
  }

}
