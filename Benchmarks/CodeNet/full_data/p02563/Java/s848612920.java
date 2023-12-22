import java.util.*;

class Convolution {
  /**
   * Find primitive root.
   *
   * @param m A prime number.
   * @return Primitive root.
   */
  private static int primitiveRoot(int m) {
      if (m == 2) return 1;
      if (m == 167772161) return 3;
      if (m == 469762049) return 3;
      if (m == 754974721) return 11;
      if (m == 998244353) return 3;

      int[] divs = new int[20];
      divs[0] = 2;
      int cnt = 1;
      int x = (m - 1) / 2;
      while (x % 2 == 0) x /= 2;
      for (int i = 3; (long) (i) * i <= x; i += 2) {
          if (x % i == 0) {
              divs[cnt++] = i;
              while (x % i == 0) {
                  x /= i;
              }
          }
      }
      if (x > 1) {
          divs[cnt++] = x;
      }
      for (int g = 2; ; g++) {
          boolean ok = true;
          for (int i = 0; i < cnt; i++) {
              if (powMod(g, (m - 1) / divs[i], m) == 1) {
                  ok = false;
                  break;
              }
          }
          if (ok) return g;
      }
  }

  private static long powMod(long x, long n, int m) {
      if (m == 1) return 0;
      long r = 1;
      long y = x % m;
      while (n > 0) {
          if ((n & 1) != 0) r = (r * y) % m;
          y = (y * y) % m;
          n >>= 1;
      }
      return r;
  }

  private static int ceil_pow2(int n) {
      int x = 0;
      while ((1L << x) < n) x++;
      return x;
  }

   private static long[] sum_ie(int mod, int g) {
      long[] sum_ie = new long[30]; // sum_ie[i] = es[0] * ... * es[i - 1] * ies[i]
      long[] es = new long[30];
      long[] ies = new long[30];  // es[i]^(2^(2+i)) == 1

      int cnt2 = Integer.numberOfTrailingZeros(mod - 1);
      long e = powMod(g, (mod - 1) >> cnt2, mod);
      long ie = powMod(e, mod - 2, mod);
      for (int i = cnt2; i >= 2; i--) {
          // e^(2^i) == 1
          es[i - 2] = e;
          ies[i - 2] = ie;
          e = e * e % mod;
          ie = ie * ie % mod;
      }
      long now = 1;
      for (int i = 0; i < cnt2 - 2; i++) {
          sum_ie[i] = ies[i] * now % mod;
          now = now * es[i] % mod;
      }
      return sum_ie;
  }

  /**
   * Inverse NTT.
   *
   * @param a      Target array.
   * @param sum_ie Calculate by {link: sum_ie}
   * @param mod    Mod.
   */
  private static void butterfly_inv(long[] a, long[] sum_ie, int mod) {
      int n = a.length;
      int h = ceil_pow2(n);

      for (int ph = h; ph >= 1; ph--) {
          int w = 1 << (ph - 1), p = 1 << (h - ph);
          long inow = 1;
          for (int s = 0; s < w; s++) {
              int offset = s << (h - ph + 1);
              for (int i = 0; i < p; i++) {
                  long l = a[i + offset];
                  long r = a[i + offset + p];
                  a[i + offset] = (l + r) % mod;
                  a[i + offset + p] = (mod + l - r) * inow % mod;
              }
              int x = Integer.numberOfTrailingZeros(~s);
              inow = inow * sum_ie[x] % mod;
          }
      }
  }

  private static long[] sum_e(int mod, int g) {
      long[] sum_e = new long[30];  // sum_e[i] = ies[0] * ... * ies[i - 1] * es[i]
      long[] es = new long[30];
      long[] ies = new long[30];  // es[i]^(2^(2+i)) == 1
      int cnt2 = Integer.numberOfTrailingZeros(mod - 1);
      long e = powMod(g, (mod - 1) >> cnt2, mod);
      long ie = powMod(e, mod - 2, mod);
      for (int i = cnt2; i >= 2; i--) {
          // e^(2^i) == 1
          es[i - 2] = e;
          ies[i - 2] = ie;
          e = e * e % mod;
          ie = ie * ie % mod;
      }
      long now = 1;
      for (int i = 0; i < cnt2 - 2; i++) {
          sum_e[i] = es[i] * now % mod;
          now = now * ies[i] % mod;
      }
      return sum_e;
  }

  private static void butterfly(long[] a, long[] sum_e, int mod) {
      int n = a.length;
      int h = ceil_pow2(n);

      for (int ph = 1; ph <= h; ph++) {
          int w = 1 << (ph - 1), p = 1 << (h - ph);
          long now = 1;
          for (int s = 0; s < w; s++) {
              int offset = s << (h - ph + 1);
              for (int i = 0; i < p; i++) {
                  long l = a[i + offset];
                  long r = a[i + offset + p] * now % mod;
                  a[i + offset] = (l + r) % mod;
                  a[i + offset + p] = (l - r + mod) % mod;
              }
              int x = Integer.numberOfTrailingZeros(~s);
              now = now * sum_e[x] % mod;
          }
      }
  }

  public static long[] convolution(long[] a, long[] b, int mod) {
      int n = a.length;
      int m = b.length;

      int z = 1 << ceil_pow2(n + m - 1);
      {
          long[] na = new long[z];
          long[] nb = new long[z];
          System.arraycopy(a, 0, na, 0, n);
          System.arraycopy(b, 0, nb, 0, m);
          a = na;
          b = nb;
      }

      int g = primitiveRoot(mod);
      long[] sume = sum_e(mod, g);
      long[] sumie = sum_ie(mod, g);

      butterfly(a, sume, mod);
      butterfly(b, sume, mod);
      for (int i = 0; i < z; i++) {
          a[i] = a[i] * b[i] % mod;
      }
      butterfly_inv(a, sumie, mod);
      a = Arrays.copyOf(a, n + m - 1);

      long iz = powMod(z, mod - 2, mod);
      for (int i = 0; i < n + m - 1; i++) a[i] = a[i] * iz % mod;
      return a;
  }

  public static void main(String[] args) {
      long[] a = {1, 2, 3, 4};
      long[] b = {5, 6, 7, 8, 9};
      int mod = 998244353;
      long[] ret = convolution(a, b, mod);
      System.out.println(Arrays.toString(ret));
  }
}


public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();

    long[] a = nal(n);
    long[] b = nal(m);
    int mod = 998244353;
    long[] ret = Convolution.convolution(a, b, mod);

    for (int i = 0; i < n + m - 1; i ++) {
      out.print(ret[i] + " ");
    }
    out.println();
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
