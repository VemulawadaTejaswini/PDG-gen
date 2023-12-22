import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

class SegmentTreeOverwriteRSQ {
  public int M, H, N;
  public long[] st;
  public long[] cover;
  private long I = Long.MAX_VALUE;

  public SegmentTreeOverwriteRSQ(long[] a) {
    N = a.length;
    M = Integer.highestOneBit(Math.max(N - 1, 1)) << 2;
    H = M >>> 1;
    cover = new long[H];
    Arrays.fill(cover, I);
    st = new long[M];
    Arrays.fill(st, I);
    for (int i = 0; i < N; i++) {
      st[H + i] = a[i];
    }
    for (int i = H - 1; i >= 1; i--) {
      propagate(i);
    }
  }

  public SegmentTreeOverwriteRSQ(int n) {
    N = n;
    M = Integer.highestOneBit(Math.max(N - 1, 1)) << 2;
    H = M >>> 1;
    cover = new long[H];
    Arrays.fill(cover, I);
    st = new long[M];
    Arrays.fill(st, 0);
    for (int i = H - 1; i >= 1; i--) {
      propagate(i);
    }
  }

  private void propagate(int i) {
    if (cover[i] == I) {
      st[i] = st[2 * i] + st[2 * i + 1];
    } else {
      int len = H / Integer.highestOneBit(i);
      st[i] = cover[i] * len;
    }
  }

  public void update(int l, int r, long v) {
    update(l, r, v, 0, H, 1);
  }

  private void update(int l, int r, long v, int cl, int cr, int cur) {
    if (l <= cl && cr <= r) {
      if (cr == cl + 1) {
        st[cur] = v;
      } else {
        cover[cur] = v;
        propagate(cur);
      }
    } else {
      int mid = cl + cr >>> 1;
      boolean bp = false;
      if (cover[cur] != I) { // back-propagate
        if (2 * cur >= H) {
          st[2 * cur] = st[2 * cur + 1] = cover[cur];
        } else {
          cover[2 * cur] = cover[2 * cur + 1] = cover[cur];
          bp = true;
        }
        cover[cur] = I;
      }
      if (cl < r && l < mid) {
        update(l, r, v, cl, mid, 2 * cur);
      } else if (bp) {
        propagate(2 * cur);
      }
      if (mid < r && l < cr) {
        update(l, r, v, mid, cr, 2 * cur + 1);
      } else if (bp) {
        propagate(2 * cur + 1);
      }
      propagate(cur);
    }
  }

  public long sum(int l, int r) {
    return sum(l, r, 0, H, 1);
  }

  private long sum(int l, int r, int cl, int cr, int cur) {
    if (l <= cl && cr <= r) {
      return st[cur];
    } else {
      if (cover[cur] != I) {
        int len = Math.min(r, cr) - Math.max(l, cl);
        return cover[cur] * len;
      }
      int mid = cl + cr >>> 1;
      long ret = 0L;
      if (cl < r && l < mid) {
        ret += sum(l, r, cl, mid, 2 * cur);
      }
      if (mid < r && l < cr) {
        ret += sum(l, r, mid, cr, 2 * cur + 1);
      }
      return ret;
    }
  }

  public long[] toArray() {
    return toArray(1, 0, H, new long[H]);
  }

  private long[] toArray(int cur, int l, int r, long[] ret) {
    if (r - l == 1) {
      ret[cur - H] = st[cur];
    } else if (cover[cur] != I) {
      Arrays.fill(ret, l, r, cover[cur]);
    } else {
      toArray(2 * cur, l, l + r >>> 1, ret);
      toArray(2 * cur + 1, l + r >>> 1, r, ret);
    }
    return ret;
  }
}

public class Main {

  private static void solve() {
    int h = ni();
    int w = ni();

    int[][] p = ntable(h, 2);
    for (int i = 0; i < h; i++) {
      p[i][0]--;
    }

    SegmentTreeOverwriteRSQ st = new SegmentTreeOverwriteRSQ(w);
    st.update(0, w, 1);

    int[] ret = new int[h];
    int last = 0;
    for (int i = 0; i < h; i++) {
      int[] q = p[i];
      st.update(q[0], q[1], 0);
      if (st.sum(0, w) > 0) {
        ret[i] = i + 1;

        int left = 0;
        int right = w;
        while (right - left > 1) {
          int k = (left + right) / 2;
          if (st.sum(0, k) > 0) {
            right = k;
          } else {
            left = k;
          }
        }
        last = left;
      } else {
        if (q[0] <= last && last < q[1]) {
          ret[i] = (i == 0 ? 0 : ret[i - 1]) + 1 + (q[1] - last);
          last = q[1];

          if (last >= w) {
            ret[i] = -1;
          }
        } else {
          if (last >= w) {
            ret[i] = -1;
          } else {
            ret[i] = (i == 0 ? 0 : ret[i - 1]);
          }
        }
      }
    }
    for (int v : ret) {
      out.println(v);
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
