
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    double[][] p = new double[n][3];
    for (int i = 0; i < n; i++) {
      p[i][0] = ni();
      p[i][1] = ni();

      double atan = Math.atan2(p[i][1], p[i][0]);
      if (atan < 0) {
        atan += Math.PI * 2;
      }
      p[i][2] = atan;
    }

    Arrays.sort(p, (o1, o2) -> Double.compare(o1[2], o2[2]));

    double[][] q = new double[n * 2][3];
    int pt = 0;
    for (int i = 0; i < n * 2; i++) {
      double x = p[i % n][0];
      double y = p[i % n][1];
      if (x == 0 && y == 0)
        continue;
      q[pt][0] = y;
      q[pt][1] = x;
      q[pt][2] = p[i % n][2];

      if (i >= n) {
        q[pt][2] += Math.PI * 2;
      }
      pt++;
    }
    q = Arrays.copyOf(q, pt);


    double sx = 0;
    double sy = 0;
    int sp = 0;
    int ep = 0;
    double ret = 0;
    // System.out.println(Arrays.deepToString(q));
    for (int i = 0; i < pt; i++) {
      while (ep < pt && q[ep][2] - q[i][2] < Math.PI / 2) {
        sx += q[ep][0];
        sy += q[ep][1];
        ep++;
      }

      while (q[i][2] - q[sp][2] > Math.PI / 2) {
        sx -= q[sp][0];
        sy -= q[sp][1];
        sp++;
      }
      double now = Math.sqrt(sx * sx + sy * sy);
      // System.out.println(i + ": " + sp + " " + ep + " " + now + " (" + sy + "," + sx + ")");
      ret = Math.max(ret, now);
    }
    System.out.println(ret);
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

