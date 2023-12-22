
  /**
   * Convolution.
   *
   * @verified https://atcoder.jp/contests/practice2/tasks/practice2_f
   */
  class Convolution {
      /**
       * Find a primitive root.
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
                  if (pow(g, (m - 1) / divs[i], m) == 1) {
                      ok = false;
                      break;
                  }
              }
              if (ok) return g;
          }
      }
  
      /**
       * Power.
       *
       * @param x Parameter x.
       * @param n Parameter n.
       * @param m Mod.
       * @return n-th power of x mod m.
       */
      private static long pow(long x, long n, int m) {
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
  
      /**
       * Ceil of power 2.
       *
       * @param n Value.
       * @return Ceil of power 2.
       */
      private static int ceilPow2(int n) {
          int x = 0;
          while ((1L << x) < n) x++;
          return x;
      }
  
      /**
       * Extended Euclidean algorithm.
       *
       * @param a Value 1.
       * @param b Value 2.
       * @return gcd and extra.
       */
      private static long[] invGcd(long a, long b) {
          a = a % b;
          if (a == 0) return new long[]{b, 0};
          long s = b, t = a;
          long m0 = 0, m1 = 1;
  
          while (t > 0) {
              long u = s / t;
              s -= t * u;
              m0 -= m1 * u;
  
              long tmp = s;
              s = t;
              t = tmp;
              tmp = m0;
              m0 = m1;
              m1 = tmp;
          }
          if (m0 < 0) m0 += b / s;
          return new long[]{s, m0};
      }
  
      /**
       * Pre-calculation for NTT.
       *
       * @param mod NTT Prime.
       * @param g   Primitive root of mod.
       * @return Pre-calculation table.
       */
      private static long[] sumE(int mod, int g) {
          long[] sum_e = new long[30];
          long[] es = new long[30];
          long[] ies = new long[30];
          int cnt2 = Integer.numberOfTrailingZeros(mod - 1);
          long e = pow(g, (mod - 1) >> cnt2, mod);
          long ie = pow(e, mod - 2, mod);
          for (int i = cnt2; i >= 2; i--) {
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
  
      /**
       * Pre-calculation for inverse NTT.
       *
       * @param mod Mod.
       * @param g   Primitive root of mod.
       * @return Pre-calculation table.
       */
      private static long[] sumIE(int mod, int g) {
          long[] sum_ie = new long[30];
          long[] es = new long[30];
          long[] ies = new long[30];
  
          int cnt2 = Integer.numberOfTrailingZeros(mod - 1);
          long e = pow(g, (mod - 1) >> cnt2, mod);
          long ie = pow(e, mod - 2, mod);
          for (int i = cnt2; i >= 2; i--) {
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
       * @param a     Target array.
       * @param sumIE Pre-calculation table.
       * @param mod   NTT Prime.
       */
      private static void butterflyInv(long[] a, long[] sumIE, int mod) {
          int n = a.length;
          int h = ceilPow2(n);
  
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
                  inow = inow * sumIE[x] % mod;
              }
          }
      }
  
      /**
       * Inverse NTT.
       *
       * @param a    Target array.
       * @param sumE Pre-calculation table.
       * @param mod  NTT Prime.
       */
      private static void butterfly(long[] a, long[] sumE, int mod) {
          int n = a.length;
          int h = ceilPow2(n);
  
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
                  now = now * sumE[x] % mod;
              }
          }
      }
  
      /**
       * Convolution.
       *
       * @param a   Target array 1.
       * @param b   Target array 2.
       * @param mod NTT Prime.
       * @return Answer.
       */
      public static long[] convolution(long[] a, long[] b, int mod) {
          int n = a.length;
          int m = b.length;
          if (n == 0 || m == 0) return new long[0];
  
          int z = 1 << ceilPow2(n + m - 1);
          {
              long[] na = new long[z];
              long[] nb = new long[z];
              System.arraycopy(a, 0, na, 0, n);
              System.arraycopy(b, 0, nb, 0, m);
              a = na;
              b = nb;
          }
  
          int g = primitiveRoot(mod);
          long[] sume = sumE(mod, g);
          long[] sumie = sumIE(mod, g);
  
          butterfly(a, sume, mod);
          butterfly(b, sume, mod);
          for (int i = 0; i < z; i++) {
              a[i] = a[i] * b[i] % mod;
          }
          butterflyInv(a, sumie, mod);
          a = java.util.Arrays.copyOf(a, n + m - 1);
  
          long iz = pow(z, mod - 2, mod);
          for (int i = 0; i < n + m - 1; i++) a[i] = a[i] * iz % mod;
          return a;
      }
  
      /**
       * Convolution.
       *
       * @param a Target array 1.
       * @param b Target array 2.
       * @return Answer.
       */
      public static long[] convolutionLL(long[] a, long[] b) {
          int n = a.length;
          int m = b.length;
          if (n == 0 || m == 0) return new long[0];
  
          long mod1 = 754974721;
          long mod2 = 167772161;
          long mod3 = 469762049;
          java.math.BigInteger  m2m3 = java.math.BigInteger.valueOf(mod2 * mod3);
          java.math.BigInteger  m1m3 = java.math.BigInteger.valueOf(mod1 * mod3);
          java.math.BigInteger  m1m2 = java.math.BigInteger.valueOf(mod1 * mod2);
          long m1m2m3 = mod1 * mod2 * mod3;
  
          java.math.BigInteger i1 = java.math.BigInteger.valueOf(invGcd(mod2 * mod3, mod1)[1]);
          java.math.BigInteger i2 = java.math.BigInteger.valueOf(invGcd(mod1 * mod3, mod2)[1]);
          java.math.BigInteger i3 = java.math.BigInteger.valueOf(invGcd(mod1 * mod2, mod3)[1]);
  
          long[] c1 = convolution(a, b, (int) mod1);
          long[] c2 = convolution(a, b, (int) mod2);
          long[] c3 = convolution(a, b, (int) mod3);
  
          java.math.BigInteger [] c = new java.math.BigInteger [n + m - 1];
          java.util.Arrays.fill(c, java.math.BigInteger.ZERO);
          java.math.BigInteger[] offset = new java.math.BigInteger[]{
                  java.math.BigInteger.valueOf(0),
                  java.math.BigInteger.valueOf(0),
                  java.math.BigInteger.valueOf(1 * m1m2m3),
                  java.math.BigInteger.valueOf(2 * m1m2m3),
                  java.math.BigInteger.valueOf(3 * m1m2m3)
          };
  
          java.math.BigInteger bmod1 = java.math.BigInteger.valueOf(mod1);
          java.math.BigInteger bmod2 = java.math.BigInteger.valueOf(mod2);
          java.math.BigInteger bmod3 = java.math.BigInteger.valueOf(mod3);
          java.math.BigInteger ll = new java.math.BigInteger("18446744073709551616");
          for (int i = 0; i < n + m - 1; i++) {
              java.math.BigInteger x = java.math.BigInteger.valueOf(0);
              x = x.add(java.math.BigInteger.valueOf(c1[i]).multiply(i1).mod(bmod1).multiply(m2m3).mod(ll));
              x = x.add(java.math.BigInteger.valueOf(c2[i]).multiply(i2).mod(bmod2).multiply(m1m3).mod(ll));
              x = x.add(java.math.BigInteger.valueOf(c3[i]).multiply(i3).mod(bmod3).multiply(m1m2).mod(ll));
  
              long diff = c1[i] - x.mod(bmod1).longValue();
              if (diff < 0) diff += mod1;
              x = x.subtract(offset[(int) (diff % 5)]).add(ll).mod(ll);
              c[i] = x;
          }
          return java.util.Arrays.stream(c).mapToLong(java.math.BigInteger::longValue).toArray();
      }
  
      /**
       * Naive convolution. (Complexity is O(N^2)!!)
       *
       * @param a   Target array 1.
       * @param b   Target array 2.
       * @param mod Mod.
       * @return Answer.
       */
      public static long[] convolutionNaive(long[] a, long[] b, int mod) {
          int n = a.length;
          int m = b.length;
          int k = n + m - 1;
          long[] ret = new long[k];
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < m; j++) {
                  ret[i + j] += a[i] * b[j] % mod;
                  ret[i + j] %= mod;
              }
          }
          return ret;
      }
  }
  

public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();

    long[] a = nal(n);
    long[] b = nal(m);
    long[] ret = Convolution.convolutionLL(a, b);
    int mod = 998244353;

    for (int i = 0; i < n + m - 1; i ++) {
      out.print(ret[i] % mod + " ");
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
