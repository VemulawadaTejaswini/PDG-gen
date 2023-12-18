
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();

    long t = nl();
    long[][] p = new long[n][2];
    for (int i = 0; i < n; i++) {
      p[i][0] = nl();
      p[i][1] = nl();
    }

    Arrays.sort(p, (o1, o2) -> {
      long x = o2[0] * (o1[1] + 1) - o1[0] * (o2[1] + 1);
      if (x != 0) {
        return Long.signum(x);
      } else {
        return Long.signum(o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
      }
    });

    long inf = Integer.MAX_VALUE;
    int m = 28;
    long[][] dp = new long[n + 1][m];
    for (long[] v : dp)
      Arrays.fill(v, inf);
    dp[0][0] = 0;



    int zp = 0;
    for (int i = 1; i <= n; i++) {
      long[] q = p[i - 1];
      long a = q[0] + 1;
      long b = q[0] + q[1] + 1;

      if (q[0] == 0) {
        zp = i - 1;
        break;
      }

      dp[i][0] = 0;
      for (int j = 1; j <= Math.min(i, m); j++) {
        long nex = dp[i - 1][j - 1] >= inf ? inf : a * dp[i - 1][j - 1] + b;
        dp[i][j] = Math.min(dp[i - 1][j], Math.min(nex, inf));
      }
    }

    int ret = 0;
    for (int i = 0; i <= m; i++) {
      if (dp[zp][i] > t)
        break;

      int now = i;
      long nt = dp[zp][i];
      for (int j = zp; j < n; j++) {
        if (nt + p[j][1] + 1 <= t) {
          nt += p[j][1] + 1;
          now++;
        } else {
          break;
        }
      }
      ret = Math.max(now, ret);
    }

    System.out.println(ret);
  }

  class SegmentTreeRMQ {
    public int M, H, N;
    public int[] st;

    public SegmentTreeRMQ(int n) {
      N = n;
      M = Integer.highestOneBit(Math.max(N - 1, 1)) << 2;
      H = M >>> 1;
      st = new int[M];
      Arrays.fill(st, 0, M, Integer.MAX_VALUE);
    }

    public SegmentTreeRMQ(int[] a) {
      N = a.length;
      M = Integer.highestOneBit(Math.max(N - 1, 1)) << 2;
      H = M >>> 1;
      st = new int[M];
      for (int i = 0; i < N; i++) {
        st[H + i] = a[i];
      }
      Arrays.fill(st, H + N, M, Integer.MAX_VALUE);
      for (int i = H - 1; i >= 1; i--)
        propagate(i);
    }

    public void update(int pos, int x) {
      st[H + pos] = x;
      for (int i = (H + pos) >>> 1; i >= 1; i >>>= 1)
        propagate(i);
    }

    private void propagate(int i) {
      st[i] = Math.min(st[2 * i], st[2 * i + 1]);
    }

    public int minx(int l, int r) {
      int min = Integer.MAX_VALUE;
      if (l >= r)
        return min;
      while (l != 0) {
        int f = l & -l;
        if (l + f > r)
          break;
        int v = st[(H + l) / f];
        if (v < min)
          min = v;
        l += f;
      }

      while (l < r) {
        int f = r & -r;
        int v = st[(H + r) / f - 1];
        if (v < min)
          min = v;
        r -= f;
      }
      return min;
    }

    public int min(int l, int r) {
      return l >= r ? 0 : min(l, r, 0, H, 1);
    }

    private int min(int l, int r, int cl, int cr, int cur) {
      if (l <= cl && cr <= r) {
        return st[cur];
      } else {
        int mid = cl + cr >>> 1;
        int ret = Integer.MAX_VALUE;
        if (cl < r && l < mid) {
          ret = Math.min(ret, min(l, r, cl, mid, 2 * cur));
        }
        if (mid < r && l < cr) {
          ret = Math.min(ret, min(l, r, mid, cr, 2 * cur + 1));
        }
        return ret;
      }
    }

    public int firstle(int l, int v) {
      int cur = H + l;
      while (true) {
        if (st[cur] <= v) {
          if (cur < H) {
            cur = 2 * cur;
          } else {
            return cur - H;
          }
        } else {
          cur++;
          if ((cur & cur - 1) == 0)
            return -1;
          if ((cur & 1) == 0)
            cur >>>= 1;
        }
      }
    }

    public int lastle(int l, int v) {
      int cur = H + l;
      while (true) {
        if (st[cur] <= v) {
          if (cur < H) {
            cur = 2 * cur + 1;
          } else {
            return cur - H;
          }
        } else {
          if ((cur & cur - 1) == 0)
            return -1;
          cur--;
          if ((cur & 1) == 1)
            cur >>>= 1;
        }
      }
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

