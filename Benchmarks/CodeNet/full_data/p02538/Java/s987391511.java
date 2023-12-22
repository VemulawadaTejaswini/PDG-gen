import java.util.*;

/**
 * TODO: verify {@link LazySegTree#maxRight} and {@link LazySegTree#minLeft}
 * 
 * @verified https://atcoder.jp/contests/practice2/tasks/practice2_k
 */

class SegmentTreeRSQHash {
  public int M, H, N;
  public long[] st;
  public long[] cover;
  public long MUL, MOD;

  public long[] pows;
  public long[] gas;

  private void init() {
    pows = new long[H + 1];
    pows[0] = 1;
    for (int i = 1; i <= H; i++)
      pows[i] = pows[i - 1] * MUL % MOD;
    gas = new long[H + 1];
    gas[0] = 1;
    for (int i = 1; i <= H; i++) {
      gas[i] = gas[i - 1] + pows[i];
      if (gas[i] >= MOD)
        gas[i] -= MOD;
    }
  }

  public SegmentTreeRSQHash(int n, long MUL, long MOD) {
    this.MUL = MUL;
    this.MOD = MOD;
    N = n;
    M = Integer.highestOneBit(Math.max(N - 1, 1)) << 2;
    H = M >>> 1;
    st = new long[M];
    init();
  }

  public SegmentTreeRSQHash(char[] a, long MUL, long MOD) {
    this.MUL = MUL;
    this.MOD = MOD;
    N = a.length;
    M = Integer.highestOneBit(Math.max(N - 1, 1)) << 2;
    H = M >>> 1;
    st = new long[M];
    for (int i = 0; i < N; i++) {
      st[H + i] = a[i];
    }
    cover = new long[H];
    init();

    for (int i = (M >> 1) - 1; i >= 1; i--) {
      propagate(i);
    }
  }

  private void propagate(int i) {
    if (cover[i] == 0) {
      st[i] = (st[2 * i] * pows[H / Integer.highestOneBit(i) / 2] + st[2 * i + 1]) % MOD;
    } else {
      st[i] = cover[i] * gas[H / Integer.highestOneBit(i) - 1] % MOD;
    }
  }

  public void update(int x, long v) {
    st[H + x] = v;
    for (int cur = H + x >>> 1; cur >= 1; cur >>>= 1)
      propagate(cur);
  }

  public void update(int l, int r, char v) {
    update(l, r, v, 0, H, 1);
  }

  protected void update(int l, int r, char v, int cl, int cr, int cur) {
    if (l <= cl && cr <= r) {
      if (cur >= H) {
        st[cur] = v;
      } else {
        cover[cur] = v;
        propagate(cur);
      }
    } else {
      if (cover[cur] != 0) {
        if (2 * cur < H) {
          cover[2 * cur] = cover[2 * cur + 1] = cover[cur];
          cover[cur] = 0;
          propagate(2 * cur);
          propagate(2 * cur + 1);
        } else {
          st[2 * cur] = st[2 * cur + 1] = cover[cur];
          cover[cur] = 0;
        }
      }

      int mid = cl + cr >>> 1;
      if (cl < r && l < mid) {
        update(l, r, v, cl, mid, 2 * cur);
      }
      if (mid < r && l < cr) {
        update(l, r, v, mid, cr, 2 * cur + 1);
      }
      propagate(cur);
    }
  }

  public long sum(int l, int r) {
    return sum(l, r, 0, H, 1);
  }

  protected long sum(int l, int r, int cl, int cr, int cur) {
    if (l <= cl && cr <= r) {
      return st[cur];
    } else {
      if (cover[cur] != 0) {
        int len = Math.min(r, cr) - Math.max(l, cl);
        return gas[len - 1] * cover[cur] % MOD;
      }

      long L = Long.MIN_VALUE, R = Long.MIN_VALUE;
      int mid = cl + cr >>> 1;
      if (cl < r && l < mid) {
        L = sum(l, r, cl, mid, 2 * cur);
      }
      if (mid < r && l < cr) {
        R = sum(l, r, mid, cr, 2 * cur + 1);
      }
      if (L != Long.MIN_VALUE && R != Long.MIN_VALUE) {
        int rlen = Math.min(r, cr) - Math.max(l, mid);
        return (pows[rlen] * L + R) % MOD;
      } else if (L != Long.MIN_VALUE) {
        return L;
      } else if (R != Long.MIN_VALUE) {
        return R;
      } else {
        throw new RuntimeException();
      }
    }
  }
}

@SuppressWarnings("unused")
public class Main {

  private static void solve() {
    int n = ni();
    int q = ni();

    char[] a = new char[n];
    Arrays.fill(a, (char) 1);
    int mod = 998244353;
    SegmentTreeRSQHash st = new SegmentTreeRSQHash(a, 10, mod);

    for (int i = 0; i < q; i++) {
      int l = ni() - 1;
      int r = ni();
      int d = ni();
      st.update(l, r, (char) d);
      out.println(st.sum(0, n));
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
