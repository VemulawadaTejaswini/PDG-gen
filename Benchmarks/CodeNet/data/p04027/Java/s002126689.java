
public class Main {

  private static void solve() {
    int n = ni();
    int c = ni();
    int[] a = na(n);
    int[] b = na(n);
    memo = new long[n + 1][c + 1];

    long[][] pow = new long[501][501];
    for (int i = 1; i <= 500; i++) {
      pow[i][0] = 1;
      for (int j = 1; j <= 500; j++) {
        pow[i][j] = pow[i][j - 1] * i % mod;
      }
    }
    long[][] table = new long[n + 1][c + 1];
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= c; j++) {
        for (int k = a[i - 1]; k <= b[i - 1]; k++) {
          table[i][j] += pow[k][j];
          table[i][j] %= mod;
        }
      }
    }

    long ret = f(n, c, table);
    System.out.println(ret);
  }


  private static int mod = (int) 1e9 + 7;
  private static long[][] memo;

  private static long f(int n, int c, long[][] table) {
    if (n == 0) {
      return c == 0 ? 1 : 0;
    }

    if (memo[n][c] > 0) {
      return memo[n][c];
    }


    long ret = 0;
    for (int i = 0; i <= c; i++) {
      ret += f(n - 1, c - i, table) * table[n][i] % mod;
      ret %= mod;
    }
    memo[n][c] = ret;
    return ret;
  }

  public static long pow(long a, long n, long mod) {
    // a %= mod;
    long ret = 1;
    int x = 63 - Long.numberOfLeadingZeros(n);
    for (; x >= 0; x--) {
      ret = ret * ret % mod;
      if (n << 63 - x < 0)
        ret = ret * a % mod;
    }
    return ret;
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

