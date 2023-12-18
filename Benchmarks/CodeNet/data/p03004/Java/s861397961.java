
import java.util.ArrayList;
import java.util.List;

public class Main {
  static double inf = 1e18;
  private static void solve() {
    int n = ni();
    double xmin = inf, ymin = inf;
    double xmax = -inf, ymax = -inf;
    double dmin = inf, umin = inf, lmin = inf, rmin = inf;
    double dmax = -inf, umax = -inf, lmax = -inf, rmax = -inf;
    
    double[][] p = new double[n][];

    for (int i = 0; i < n; i++) {
      int x = ni();
      int y = ni();
      char c = ns()[0];
      xmin = Math.min(xmin, x);
      xmax = Math.max(xmax, x);
      ymin = Math.min(ymin, y);
      ymax = Math.max(ymax, y);
      
      p[i] = new double[] {x, y, c};
      switch(c) {
        case 'U':
          umax = Math.max(umax, y);
          umin = Math.min(umin, y);
          break;
        case 'D':
          dmax = Math.max(dmax, y);
          dmin = Math.min(dmin, y);
          break;
        case 'R':
          rmax = Math.max(rmax, x);
          rmin = Math.min(rmin, x);
          break;
        case 'L':
          lmax = Math.max(lmax, x);
          lmin = Math.min(lmin, x);
          break;
      }
    }
    
    List<Double> change = new ArrayList<>();
    change.add(0.0);
    change.add(umax - ymax); //umax + t == ymax
    change.add(rmax - xmax); //rmax + t == xmax
    change.add(dmin - ymin); //dmin - t == ymin
    change.add(lmin - xmin); //lmin - t == xmin
    change.add((dmax - umax) / 2); // umax + t == dmax - t
    change.add((dmin - umin) / 2); // umin + t == dmin - t
    change.add((lmax - rmax) / 2); // rmax + t == lmax - t
    change.add((lmin - rmin) / 2); // rmin + t == lmin - t
    
    double ret = inf;
    for (double t : change) {
      ret = Math.min(ret, f(p, t));
    }
    System.out.println(ret);
    
  }

  private static double f(double[][] p, double t) {
    if (t < 0) {
      return inf;
    }
    double xmin = inf, ymin = inf;
    double xmax = -inf, ymax = -inf;
    for (double[] v: p) {
      double dx = 0, dy = 0;
      switch((char)(v[2])) {
        case 'U':
          dy = t;
          break;
        case 'D':
          dy = -t;
          break;
        case 'R':
          dx = t;
          break;
        case 'L':
          dx = -t;
          break;
      }
      xmin = Math.min(xmin, v[0] + dx);
      xmax = Math.max(xmax, v[0] + dx);
      ymin = Math.min(ymin, v[1] + dy);
      ymax = Math.max(ymax, v[1] + dy);
    }      
    return (xmax - xmin) * (ymax - ymin);
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
