
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    int k = ni();

    int[][] p = ntable(n, 3);

    double min = 0;
    double max = 100 * 1500;

    for (int i = 0; i < 60; i++) {
      double v = (min + max) / 2;

      if (ok(v, p, k)) {
        max = v;
      } else {
        min = v;
      }
    }
    System.out.println(max);
  }

  private static final double EPS = 1e-8;

  private static boolean ok(double v, int[][] p, int s) {
    int n = p.length;
    double[][] q = new double[n][3];
    for (int i = 0; i < n; i++) {
      q[i][0] = p[i][0];
      q[i][1] = p[i][1];
      q[i][2] = v / p[i][2];
    }

    Arrays.sort(q, (o1, o2) -> Double.compare(o1[2], o2[2]));

    boolean flg = false;
    int[][][] cnt = new int[n][n][2];
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        double[][] c = cross(q[i][0], q[i][1], q[i][2], q[j][0], q[j][1], q[j][2]);
        if (c == null) {
          continue;
        } else {

          for (int t = 0; t < 2; t++) {

            for (int k = 0; k < n; k++) {

              double dx = q[k][0] - c[t][0];
              double dy = q[k][1] - c[t][1];

              if (dx * dx + dy * dy <= q[k][2] * q[k][2] + EPS) {
                cnt[i][j][t] = cnt[j][i][t] = cnt[i][j][t] + 1;
                if (cnt[i][j][t] >= s) {
                  flg = true;
                }
              }
            }
          }
        }
      }
    }

    return flg;
  }

  public static double[][] cross(double x1, double y1, double r1, double x2, double y2, double r2) {

    x2 -= x1;
    y2 -= y1;

    double d2 = x2 * x2 + y2 * y2;
    double a = (d2 + r1 * r1 - r2 * r2) / 2;

    if (d2 * r1 * r1 - a * a < 0) {
      return null;
    }
    double rx1 = (a * x2 + y2 * Math.sqrt(d2 * r1 * r1 - a * a)) / d2;
    double rx2 = (a * x2 - y2 * Math.sqrt(d2 * r1 * r1 - a * a)) / d2;
    double ry1 = (a * y2 - x2 * Math.sqrt(d2 * r1 * r1 - a * a)) / d2;
    double ry2 = (a * y2 + x2 * Math.sqrt(d2 * r1 * r1 - a * a)) / d2;

    rx1 += x1;
    rx2 += x1;
    ry1 += y1;
    ry2 += y1;

    return new double[][] {{rx1, ry1}, {rx2, ry2}};
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

