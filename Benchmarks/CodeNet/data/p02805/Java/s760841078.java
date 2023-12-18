
import java.awt.geom.Point2D;

public class Main {
  private static void solve() {
    int n = ni();
    double[][] p = new double[n][2];
    for (int i = 0; i < n; i++) {
      p[i][0] = ni();
      p[i][1] = ni();
    }

    double max1 = -1;
    double max2 = -1;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          double[] r = circumcircleOld(p[i][0], p[i][1], p[j][0], p[j][1], p[k][0], p[k][1]);
          if (r == null)
            continue;
          max1 = Math.max(r[2], max1);
        }
        double dx = p[i][0] - p[j][0];
        double dy = p[i][1] - p[j][1];
        double r = Math.sqrt(dx * dx + dy * dy) / 2;
        max2 = Math.max(r, max2);
      }
    }

    System.out.printf("%.12f\n", max1 < 0 ? max2 : Math.min(max1, max2));
  }

  public static double[] interLines(double ax, double ay, double bx, double by, double cx,
      double cy, double dx, double dy) {
    double eps = 1E-9;
    double aa = bx - ax;
    double cc = by - ay;
    double bb = cx - dx;
    double dd = cy - dy;
    double xx = cx - ax;
    double yy = cy - ay;
    double det = aa * dd - bb * cc;
    if (Math.abs(det) < eps)
      return null;
    double t = (dd * xx - bb * yy) / det;
    double u = (-cc * xx + aa * yy) / det;
    return new double[] {ax + (bx - ax) * t, ay + (by - ay) * t, t, u};
  }



  public static double[] circumcircleOld(double ax, double ay, double bx, double by, double cx,
      double cy) {
    double abx = (ax + bx) / 2;
    double aby = (ay + by) / 2;
    double pabx = abx + (by - ay);
    double paby = aby - (bx - ax);

    double bcx = (bx + cx) / 2;
    double bcy = (by + cy) / 2;
    double pbcx = bcx + (cy - by);
    double pbcy = bcy - (cx - bx);

    double[] res = interLines(abx, aby, pabx, paby, bcx, bcy, pbcx, pbcy);
    if (res == null)
      return null;
    return new double[] {res[0], res[1], Point2D.distance(res[0], res[1], ax, ay)};
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
