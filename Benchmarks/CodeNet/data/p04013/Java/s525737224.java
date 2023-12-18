import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    int n = ni();
    int a = ni();
    int[] x = new int[n];
    for (int i = 0; i < n; ++i) {
      x[i] = ni();
    }
    long[][] dp = new long[n + 1][2501];
    dp[0][0] = 1;
    for (int i = 0; i < n; ++i) {
      for (int j = 2500; 0 <= j; --j) {
        for (int k = n; 0 <= k; --k) {
          if (dp[k][j] == 0) {
            continue;
          }
          int nk = k + 1;
          int nv = j + x[i];
          dp[nk][nv] += dp[k][j];
        }
      }
    }

    long cnt = 0;
    for (int i = 1; i <= n; ++i) {
      for (int j = 1; j <= 2500; ++j) {
        if (j / i == a && j % i == 0) {
          cnt += dp[i][j];
        }
      }
    }
    System.out.println(cnt);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}