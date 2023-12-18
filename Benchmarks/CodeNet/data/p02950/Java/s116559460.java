
public class Main {

  private static void solve() {
    int p = ni();
    long[] y = new long[p];
    for (int i = 0; i < p; i++) {
      y[i] = ni();
    }

    long[] f = guess(p, y);

    for (long v : f) {
      out.print(v + " ");
    }
    out.println();
  }


  public static long invl(long a, long mod) {
    long b = mod;
    long p = 1, q = 0;
    while (b > 0) {
      long c = a / b;
      long d;
      d = a;
      a = b;
      b = d % b;
      d = p;
      p = q;
      q = d - c * q;
    }
    return p < 0 ? p + mod : p;
  }


  // y[0],y[1],.. -> y=f(x)
  public static long[] guess(long mod, long... y) {
    int n = y.length;
    long[] dp = new long[n + 1];
    dp[0] = 1;
    // (x-x0)(x-x1)...(x-x{n-1})
    for (int i = 0; i < n; i++) {
      for (int j = i; j >= 0; j--) {
        dp[j + 1] += dp[j];
        if (dp[j + 1] >= mod)
          dp[j + 1] -= mod;
        dp[j] = dp[j] * -i % mod;
        if (dp[j] < 0)
          dp[j] += mod;
      }
    }

    long[] f = new long[n + 1];
    f[0] = 1;
    for (int i = 1; i <= n; i++)
      f[i] = f[i - 1] * i % mod;

    long[] ret = new long[n];
    for (int i = 0; i < n; i++) {
      long den = f[i] * f[n - 1 - i] % mod; // (-1)^(n-1-i)*i!*(n-1-i)!
      if (((i ^ n - 1) & 1) == 1) {
        den = mod - den;
      }
      long iden = invl(den, mod) * y[i] % mod;

      long minus = 0;
      for (int j = n - 1; j >= 0; j--) {
        minus = (dp[j + 1] + minus * i) % mod;
        ret[j] = (ret[j] + minus * iden) % mod;
      }
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

