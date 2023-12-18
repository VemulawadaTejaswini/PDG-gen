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
    int[] slimes = new int[n];
    for (int i = 0; i < n; i++) {
      slimes[i] = scanner.nextInt();
    }
    long result = recur(slimes, 0, n - 1, new Long[n][n]);
    printer.println(result);
  }

  private static long recur(int[] slimes, int low, int high, Long[][] cache) {
    if (low >= high) {
      return 0L;
    }
    if (cache[low][high] != null) {
      return cache[low][high];
    }
    long sum = 0;
    for (int i = low; i <= high; i++) {
      sum += slimes[i];
    }
    long result = Long.MAX_VALUE;
    for (int i = low; i <= high - 1; i++) {
      long next = recur(slimes, low, i, cache) + recur(slimes, i + 1, high, cache) + sum;
      result = Math.min(result, next);
    }
    cache[low][high] = result;
    return cache[low][high];
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
