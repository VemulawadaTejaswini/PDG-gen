
import java.util.Arrays;

public class Main {

  private static void solve() {
    int[] s = na(2);
    int[] g = na(2);

    if (s[0] > g[0]) {
      int[] tmp = s;
      s = g;
      g = tmp;
    }

    int n = ni();
    int[][] p = ntable(n, 2);

    Arrays.sort(p, (o1, o2) -> o1[0] - o2[0]);

    int[] a = new int[n];
    int ptr = 0;
    for (int[] v : p) {
      if (Math.min(s[0], g[0]) <= v[0] && v[0] <= Math.max(s[0], g[0])
          && Math.min(s[1], g[1]) <= v[1] && v[1] <= Math.max(s[1], g[1])) {
        a[ptr++] = v[1];
      }
    }
    a = Arrays.copyOf(a, ptr);

    double ret = (Math.abs(s[0] - g[0]) + Math.abs(s[1] - g[1])) * 100.0;

    if (s[1] == g[1] || s[0] == g[0]) {
      ret += a.length * (20 * Math.PI / 2 - 10.0 * 2);
    } else {
      if (s[1] > g[1]) {
        for (int i = 0; i < ptr; i++) {
          a[i] = -a[i];
        }
      }
      int d = Math.min(Math.abs(s[0] - g[0]), Math.abs(s[1] - g[1]));
      int lis = lis(a);

      if (d == lis - 1) {
        ret += (lis - 1) * (20.0 * Math.PI / 4.0 - 10.0 * 2) + (20.0 * Math.PI / 2 - 10.0 * 2);
      } else {
        ret += lis * (20.0 * Math.PI / 4.0 - 10.0 * 2);
      }
    }
    System.out.printf("%.12f\n", ret);
  }

  public static int lis(int[] in) {
    int n = in.length;
    int ret = 0;
    int[] h = new int[n + 1];
    Arrays.fill(h, Integer.MIN_VALUE / 2);
    for (int i = 0; i < n; i++) {
      int ind = Arrays.binarySearch(h, 0, ret + 1, in[i]);
      if (ind < 0) {
        ind = -ind - 2;
        h[ind + 1] = in[i];
        if (ind >= ret)
          ret++;
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

