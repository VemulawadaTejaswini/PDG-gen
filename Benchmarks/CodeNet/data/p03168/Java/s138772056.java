import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Reader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * The Java template file for AtCoder online judge.
 */
public class Main {

  private static FastScanner scanner;
  private static PrintWriter printer;

  public static void solve() {
    int n = scanner.nextInt();
    double[] probHeads = new double[n];
    for (int i = 0; i < n; i++) {
      probHeads[i] = scanner.nextDouble();
    }
    // dp[i][j] - probability of using i coins with j heads
    double[][] dp = new double[n + 1][n + 1];
    dp[0][0] = 1.0;
    for (int i = 1; i <= n; i++) {
      double probH = probHeads[i - 1];
      double probT = 1 - probH;

      for (int j = i; j >= 0; j--) {
        dp[i][j] += (j == 0 ? 0 : dp[i - 1][j - 1] * probH);
        dp[i][j] += dp[i - 1][j] * probT;
      }
    }
    double result = 0.0;
    for (int heads = 0; heads <= n; heads++) {
      int tails = n - heads;
      if (heads > tails) {
        result += dp[n][heads];
      }
    }
    printer.println(result);
  }

  public static void main(String[] args) {
    scanner = new FastScanner();
    printer = new PrintWriter(System.out);
    solve();
    printer.flush();
  }

  private static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    public FastScanner(Reader in) {
      br = new BufferedReader(in);
    }

    public FastScanner() {
      this(new InputStreamReader(System.in));
    }

    public String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }

    public int[] readIntArray(int size) {
      int[] ret = new int[size];
      for (int i = 0; i < size; i++) {
        ret[i] = nextInt();
      }
      return ret;
    }
  }
}
