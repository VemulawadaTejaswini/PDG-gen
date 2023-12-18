
import java.util.Arrays;


class SegmentTreeOverwrite {
  public int M, H, N;
  public int[] cover;
  public int I = Integer.MAX_VALUE;

  public SegmentTreeOverwrite(int[] a) {
    N = a.length;
    M = Integer.highestOneBit(Math.max(N - 1, 1)) << 2;
    H = M >>> 1;
    cover = new int[M];
    Arrays.fill(cover, I);
    for (int i = 0; i < N; i++) {
      cover[H + i] = a[i];
    }
    for (int i = H - 1; i >= 1; i--) {
      propagate(i);
    }
  }

  private void propagate(int i) {}

  public void update(int l, int r, int v) {
    update(l, r, v, 0, H, 1);
  }

  private void update(int l, int r, int v, int cl, int cr, int cur) {
    if (l <= cl && cr <= r) {
      cover[cur] = v;
      propagate(cur);
    } else {
      int mid = cl + cr >>> 1;
      if (cover[cur] != I) { // back-propagate
        cover[2 * cur] = cover[2 * cur + 1] = cover[cur];
        cover[cur] = I;
        propagate(2 * cur);
        propagate(2 * cur + 1);
      }
      if (cl < r && l < mid) {
        update(l, r, v, cl, mid, 2 * cur);
      }
      if (mid < r && l < cr) {
        update(l, r, v, mid, cr, 2 * cur + 1);
      }
      propagate(cur);
    }
  }

  public int get(int x) {
    int val = I;
    for (int i = H + x; i >= 1; i >>>= 1) {
      if (cover[i] != I)
        val = cover[i];
    }
    return val;
  }
}


public class Main {


  private static void solve() {
    int n = ni();
    int[] a = na(n);
    System.out.println(solve(a));


  }


  private static int solve(int[] a) {
    int[] b = shrink(a);
    int max = Arrays.stream(b).max().getAsInt();

    int left = 0;
    int right = Integer.MAX_VALUE / 3;

    while (right - left > 1) {
      int k = (left + right) / 2;
      if (ok(k, b, max + 1)) {
        right = k;
      } else {
        left = k;
      }
    }
    return right;
  }

  public static int[] shrink(int[] a) {
    int n = a.length;

    int min = 20;
    int[] b = new int[n];

    b[0] = Math.min(min, a[0]);
    for (int i = 1; i < n ; i++) {
      int v = a[i] - a[i - 1];
      
      b[i] = b[i - 1] + Math.min(min, v);
    }

    return b;
  }

  private static boolean ok(int k, int[] a, int max) {
    int n = a.length;

    SegmentTreeOverwrite st = new SegmentTreeOverwrite(new int[max]);
    for (int i = 1; i < n; i++) {
      if (a[i - 1] < a[i])
        continue;

      int j = a[i] - 1;
      st.update(j + 1, max, 0);

      while (true) {
        st.update(j, j + 1, st.get(j) + 1);

        if (st.get(j) >= k) {
          st.update(j, j + 1, 0);
          j--;
          if (j < 0)
            return false;
        } else {
          break;
        }
      }
    }
    return true;
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
