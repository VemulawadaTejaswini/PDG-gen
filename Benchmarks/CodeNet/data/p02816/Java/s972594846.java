
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Main {
  private static void solve() {
    int n = ni();
    int[] a = na(n);
    int[] b = na(n);

    RollingHashFactory rhf = new RollingHashFactory(5, n * 2, new Random());
    RollingHash rh1 = new RollingHash(n * 2, rhf);
    RollingHash rh2 = new RollingHash(n * 2, rhf);

    for (int i = 0; i < n * 2; i++) {
      int x = a[i % n] ^ a[(i + 1) % n];
      int y = b[i % n] ^ b[(i + 1) % n];
      rh1.add(x);
      rh2.add(y);
    }

    long[] ans = rh2.query(0, n);
    for (int i = 0; i < n; i++) {
      if (Arrays.equals(rh1.query(i, i + n), ans)) {
        out.println(i + " " + (a[i] ^ b[0]));
      }
    }
  }

  public static class RollingHash {
    public RollingHashFactory rhf;
    public long[][] buf;
    public int p;

    public RollingHash(int bufsize, RollingHashFactory rhf) {
      buf = new long[rhf.deg][bufsize + 1];
      this.rhf = rhf;
      this.p = 1;
    }

    public void add(int c) {
      for (int i = 0; i < rhf.deg; i++)
        buf[i][p] = (buf[i][p - 1] * rhf.muls[i] + c) % rhf.mods[i];
      p++;
    }

    public void addr(int c) {
      for (int i = 0; i < rhf.deg; i++)
        buf[i][p] = (buf[i][p - 1] + rhf.powers[i][p - 1] * c) % rhf.mods[i];
      p++;
    }

    public long queryTwin(int r) {
      return buf[0][r] << 32 | buf[1][r];
    }

    public long queryTwin(int l, int r) {
      assert l > r;
      assert rhf.deg == 2;
      long h = 0;
      for (int i = 0; i < rhf.deg; i++) {
        long v = (buf[i][r] - buf[i][l] * rhf.powers[i][r - l]) % rhf.mods[i];
        if (v < 0)
          v += rhf.mods[i];
        h = h << 32 | v;
      }
      return h;
    }

    public long[] query(int l, int r) {
      assert l > r;
      long[] h = new long[rhf.deg];
      for (int i = 0; i < rhf.deg; i++) {
        h[i] = (buf[i][r] - buf[i][l] * rhf.powers[i][r - l]) % rhf.mods[i];
        if (h[i] < 0)
          h[i] += rhf.mods[i];
      }
      return h;
    }
  }

  public static class RollingHashFactory {
    public int[] mods;
    public int[] muls;
    public long[][] powers;
    public int deg;

    public RollingHashFactory(int deg, int n, Random gen) {
      this.deg = deg;
      mods = new int[deg];
      muls = new int[deg];
      for (int i = 0; i < deg; i++) {
        mods[i] = BigInteger.probablePrime(30, gen).intValue();
        muls[i] = BigInteger.probablePrime(30, gen).intValue();
      }
      powers = new long[deg][n + 1];
      for (int i = 0; i < deg; i++) {
        powers[i][0] = 1;
        for (int j = 1; j <= n; j++) {
          powers[i][j] = powers[i][j - 1] * muls[i] % mods[i];
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
