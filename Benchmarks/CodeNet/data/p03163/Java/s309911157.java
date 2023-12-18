import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n = in.nextInt();
    int W = in.nextInt();
    int[] w = new int[n];
    int[] v = new int[n];
    for (int i = 0; i < n; i++) {
      w[i] = in.nextInt();
      v[i] = in.nextInt();
    }
    final Solver solve = new Solver();
    System.out.println(solve.solve(W, w, v));
  }
}

class Solver {
  public long solve(int W, int[] w, int[] v) {
    int n = w.length;
    long[][] dp = new long[n+1][W+1];

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= W; j++) {
        long val = 0;
        if (j - w[i-1] >= 0) {
          val = dp[i-1][j - w[i-1]] + v[i-1];
        }
        dp[i][j] = Math.max(dp[i-1][j], val);
      }
    }

    return dp[n][W];
  }
}
