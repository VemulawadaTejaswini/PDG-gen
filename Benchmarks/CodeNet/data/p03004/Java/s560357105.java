
public class Main {
  private static double inf = 1e18;

  private static void solve() {
    int n = ni();
    double[][] p = new double[n][];
    double umax = -inf, dmax = -inf, lmax = -inf, rmax = -inf;
    double umin = inf, dmin = inf, lmin = inf, rmin = inf;
    double xmax = -inf, ymax = -inf;
    double xmin = inf, ymin = inf;

    for (int i = 0; i < n; i++) {
      double x = nd();
      double y = nd();
      char c = ns()[0];

      if (c == 'U') {
        p[i] = new double[] {x, y, 0, 1};
        umin = Math.min(umin, y);
        umax = Math.max(umax, y);
        xmax = Math.max(xmax, x);
        xmin = Math.min(xmin, x);
      } else if (c == 'D') {
        p[i] = new double[] {x, y, 0, -1};
        dmin = Math.min(dmin, y);
        dmax = Math.max(dmax, y);
        xmax = Math.max(xmax, x);
        xmin = Math.min(xmin, x);
      } else if (c == 'R') {
        p[i] = new double[] {x, y, 1, 0};
        rmin = Math.min(rmin, x);
        rmax = Math.max(rmax, x);
        ymax = Math.max(ymax, y);
        ymin = Math.min(ymin, y);
      } else if (c == 'L') {
        p[i] = new double[] {x, y, -1, 0};
        lmin = Math.min(lmin, x);
        lmax = Math.max(lmax, x);
        ymax = Math.max(ymax, y);
        ymin = Math.min(ymin, y);
      }
    }

    double ret = inf;
    for (double t = 0; t <= 100000001; t += 0.5) {
      double u = ymax;
      double d = ymin;
      double r = xmax;
      double l = xmin;
      
      u = Math.max(u, umax + t);
      u = Math.max(u, dmax - t);
      d = Math.min(d, umin + t);
      d = Math.min(d, dmin - t);
      r = Math.max(r, rmax + t);
      r = Math.max(r, lmax - t);
      l = Math.min(l, rmin + t);
      l = Math.min(l, lmin - t);
      double now = (u - d) * (r - l);
      ret = Math.min(ret, now);
    }
    
    System.out.printf("%.12f\n", ret);
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
