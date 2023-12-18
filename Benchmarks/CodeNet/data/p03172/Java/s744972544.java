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
    int k = scanner.nextInt();
    int[] candies = new int[n];
    for (int i = 0; i < n; i++) {
      candies[i] = scanner.nextInt();
    }
    long mod = (long)1e9 + 7;
    long[] dp = new long[k + 1];
    dp[0] = 1L;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= k; j++) {
        dp[j] += dp[j - 1];
        if (dp[j] >= mod) {
          dp[j] -= mod;
        }
      }
      for (int j = k; j >= 0; j--) {
        if (j > candies[i]) {
          dp[j] -= dp[j - candies[i] - 1];
          if (dp[j] < 0) {
            dp[j] += mod;
          }
        }
      }
      // for (int j = k; j >= 0; j--) {
      //   for (int c = 1; c <= candies[i]; c++) {
      //     dp[j] += j - c >= 0 ? dp[j - c] : 0L;
      //   }
      // }
    }
    printer.println(dp[k]);
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
