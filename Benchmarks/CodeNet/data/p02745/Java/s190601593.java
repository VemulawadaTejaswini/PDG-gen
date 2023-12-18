
public class Main {

  private static void solve() {
    int q = ni();

    long[] f3 = new long[31];
    f3[0] = 1;
    for (int i = 0; i < 30; i++) {
      f3[i + 1] = f3[i] * 3;
    }


    for (int i = 0; i < q; i++) {
      long a = nl() - 1;
      long b = nl() - 1;
      long c = nl() - 1;
      long d = nl() - 1;

      long y = f(a) & f(c);
      long x = f(b) & f(d);

      long ret = 0;// Math.abs(a - c) + Math.abs(b - d);

      boolean flgY = false, flgX = false;
      for (int j = 29; j >= 0; j--) {
        if (((y >> j) & 1) == 1 && Math.abs(b - d) > f3[j]) {
          ret += Math.min(Math.abs(f3[j] - 1 - a) + Math.abs(f3[j] - 1 - c),
              Math.abs(f3[j] * 2 - a) + Math.abs(f3[j] * 2 - c));
          flgY = true;
          break;
        }
      }
      if (!flgY) {
        ret += Math.abs(a - c);
      }

      for (int j = 29; j >= 0; j--) {
        if (((x >> j) & 1) == 1 && Math.abs(a - c) > f3[j]) {
          // ret += Math.min(Math.abs(f3[j] - 1 - b), Math.abs(f3[j] * 2 - b)) * 2;
          ret += Math.min(Math.abs(f3[j] - 1 - b) + Math.abs(f3[j] - 1 - d),
              Math.abs(f3[j] * 2 - b) + Math.abs(f3[j] * 2 - d));
          flgX = true;
          break;
        }
      }
      if (!flgX) {
        ret += Math.abs(b - d);
      }
      System.out.println(ret);
    }


  }


  private static int f(long x) {
    int ret = 0;
    for (int i = 0; i <= 29; i++) {
      if (x % 3 == 1) {
        ret |= 1 << i;
      }
      x /= 3;
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

