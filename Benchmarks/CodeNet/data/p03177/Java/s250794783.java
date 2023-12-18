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

  private static long MOD = (long)1e9 + 7;

  private static long addModulo(long a, long b, long mod) {
    long sum = a + b;
    if (sum >= mod) {
      sum -= mod;
    }
    return sum;
  }

  private static long multModulo(long a, long b, long mod) {
    return (a * b) % mod;
  }

  private static long[][] matrixMultiply(long[][] a, long[][] b) {
    int n = a.length;
    long[][] c = new long[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          c[i][j] = addModulo(c[i][j], multModulo(a[i][k], b[k][j], MOD), MOD);
        }
      }
    }
    return c;
  }

  private static long[][] matrixExponention(long[][] matrix, long power) {
    int n = matrix.length;
    long[][] result = new long[n][n];
    for (int i = 0; i < n; i++) {
      result[i][i] = 1;
    }
    while (power > 0) {
      if ((power % 2) == 1) {
        result = matrixMultiply(result, matrix);
      }
      matrix = matrixMultiply(matrix, matrix);
      power >>>= 1;
    }
    return result;
  }

  public static void solve() {
    int n = scanner.nextInt();
    long steps = scanner.nextLong();
    long[][] matrix = new long[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }
    matrix = matrixExponention(matrix, steps);
    long result = 0L;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        result = addModulo(result, matrix[i][j], MOD);
      }
    }
    printer.println(result);
  }

  public static void slowSolve() {
    int n = scanner.nextInt();
    long steps = scanner.nextLong();
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }
    int[] dp = new int[n];
    Arrays.fill(dp, 1);
    while (steps-- > 0) {
      int[] next = new int[n];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (matrix[i][j] == 1) {
            next[j] += dp[i];
          }
        }
      }
      dp = next;
    }
    long result = 0L;
    for (int i = 0; i < n; i++) {
      result += dp[i];
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
