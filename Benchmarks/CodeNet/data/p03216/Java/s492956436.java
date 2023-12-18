
import java.util.Arrays;

class SegmentTree {
  private final long[][] unit;
  private final long[][][] tree;
  private final int size;
  private final int d;

  public SegmentTree(int size, int d) {
    size = 1 << (32 - Integer.numberOfLeadingZeros(size));

    this.tree = new long[size * 2][d][d];
    for (int i = 0; i < size * 2; i++) {
      for (int j = 0; j < d; j++) {
        this.tree[i][j][j] = 1;
      }
    }

    this.unit = new long[d][d];
    for (int i = 0; i < d; i++) {
      unit[i][i] = 1;
    }
    this.size = size;
    this.d = d;
  }

  public void update(int i, long[][] n) {
    int k = i + size - 1;

    for (int s = 0; s < d; s++) {
      for (int t = 0; t < d; t++) {
        tree[k][s][t] = n[s][t];
      }
    }

    while (k > 0) {
      k = (k - 1) / 2;
      long[][] a = tree[2 * k + 1];
      long[][] b = tree[2 * k + 2];
      calc(a, b, tree[k]);
    }
  }

  public void calc(long[][] a, long[][] b, long[][] c) {
    for (long[] v : c)
      Arrays.fill(v, 0);

    for (int i = 0; i < d; i++) {
      for (int k = 0; k < d; k++) {
        for (int j = 0; j < d; j++) {
          c[i][j] += b[i][k] * a[k][j];
        }
      }
    }
  }

  private long[][] query(int a, int b, int k, int l, int r) {
    if (b <= l || r <= a) {
      return unit;
    }
    if (a <= l && r <= b) {
      return tree[k];
    } else {
      long[][] ql = query(a, b, 2 * k + 1, l, (l + r) / 2);
      long[][] qr = query(a, b, 2 * k + 2, (l + r) / 2, r);

      long[][] ret = new long[d][d];
      calc(ql, qr, ret);
      return ret;
    }
  }

  public long[][] query(int a, int b) {
    return query(a, b, 0, 0, size);
  }
}



public class Main {


  private static void solve() {
    int n = ni();
    char[] s = ns();
    int q = ni();
    SegmentTree st = new SegmentTree(n, 3);

    long[][] mm = {{1, 0, 0}, {0, 1, 1}, {0, 0, 1}};
    long[][] mc = {{1, 1, 0}, {0, 1, 0}, {0, 0, 1}};

    for (int i = 0; i < n; i++) {
      if (s[i] == 'M') {
        st.update(i, mm);
      } else if (s[i] == 'C') {
        st.update(i, mc);
      }
    }

    for (int t = 0; t < q; t++) {
      int k = ni();

      long ret = 0;
      for (int i = 0; i < n; i++) {
        if (s[i] == 'D') {
          ret += st.query(i, Math.min(i + k, n))[0][2];
        }
      }
      System.out.println(ret);
    }
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

