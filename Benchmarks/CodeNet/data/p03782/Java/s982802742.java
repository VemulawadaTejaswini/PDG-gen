
import java.math.BigInteger;

public class Main {
  private static void solve() {
    int n = ni();
    int k = ni();
    int[] a = na(n);

    BigInteger[] l = new BigInteger[n + 2];
    BigInteger[] r = new BigInteger[n + 2];

    BigInteger mask = BigInteger.ONE.shiftLeft(k + 2).subtract(BigInteger.ONE);
    l[0] = BigInteger.ONE;
    r[n + 1] = BigInteger.ONE;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= k; j++) {
        l[i + 1] = a[i] > k ? l[i] : l[i].or(l[i].shiftLeft(a[i])).and(mask);
      }
    }

    for (int i = n + 1; i >= 2; i--) {
      for (int j = 0; j <= k; j++) {
        r[i - 1] = a[i - 2] > k ? r[i] : r[i].or(r[i].shiftLeft(a[i - 2])).and(mask);
      }
    }

    int[][] rsum = new int[n + 2][k + 2];
    for (int i = 1; i <= n + 1; i++) {
      for (int j = 0; j <= k; j++) {
        rsum[i][j + 1] = (r[i].testBit(j) ? 1 : 0) + rsum[i][j];
      }
    }

    int ret = 0;
    for (int i = 1; i <= n; i++) {
      int v = a[i - 1];

      for (int s = 0; s <= k; s++) {
        if (l[i - 1].testBit(s)) {
          if (rsum[i + 1][Math.max(k - v - s, 0)] != rsum[i + 1][k - s]) {
            ret ++;
            break;
          }
        }
      }
    }
    System.out.println(n - ret);
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = args.length > 0 ? args[0] : null;
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
        tr((System.currentTimeMillis() - start) + "ms");
      }
    }, "", 64000000).start();
  }

  private static java.io.InputStream is = System.in;
  private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
  private static java.util.StringTokenizer tokenizer = null;
  private static java.io.BufferedReader reader;

  public static String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }

  private static double nd() {
    return Double.parseDouble(next());
  }

  private static long nl() {
    return Long.parseLong(next());
  }

  private static int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = ni();
    return a;
  }

  private static char[] ns() {
    return next().toCharArray();
  }

  private static long[] nal(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++)
      a[i] = nl();
    return a;
  }

  private static int[][] ntable(int n, int m) {
    int[][] table = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i][j] = ni();
      }
    }
    return table;
  }

  private static int[][] nlist(int n, int m) {
    int[][] table = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[j][i] = ni();
      }
    }
    return table;
  }

  private static int ni() {
    return Integer.parseInt(next());
  }

  private static void tr(Object... o) {
    if (is != System.in)
      System.out.println(java.util.Arrays.deepToString(o));
  }
}
