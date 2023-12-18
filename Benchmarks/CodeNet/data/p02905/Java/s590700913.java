
import java.util.Arrays;

public class Main {
  private static void solve() {
    int n = ni();
    int mod = 998244353;

    int[] a = na(n);
    int max = Arrays.stream(a).max().getAsInt();
    int[] lpf = enumLowestPrimeFactors(max);

    long[] sum = new long[max + 1];
    long[] sq = new long[max + 1];
    for (int v : a) {
      for (int u : enumDivisorsFast(v, lpf)) {
        sum[u] += v;
        sum[u] %= mod;
        sq[u] += (long) v * v;
        sq[u] %= mod;
      }
    }

    long[] h = new long[max + 1];
    long ret = 0;
    for (int i = 1; i <= max; i++) {
      h[i] = invl(i, mod);
      for (int u : enumDivisorsFast(i, lpf)) {
        if (u == i)
          continue;

        h[i] += mod - h[u];
        h[i] %= mod;
      }

      long now = (sum[i] * sum[i] % mod + mod - sq[i]) * h[i] % mod;
      ret += now;
      ret %= mod;
    }

    System.out.println(ret * invl(2, mod) % mod);
  }

  public static long invl(long a, long mod) {
    long b = mod;
    long p = 1, q = 0;
    while (b > 0) {
      long c = a / b;
      long d;
      d = a;
      a = b;
      b = d % b;
      d = p;
      p = q;
      q = d - c * q;
    }
    return p < 0 ? p + mod : p;
  }


  public static int[] enumDivisorsFast(int n, int[] lpf) {
    int[] divs = {1};
    while (lpf[n] > 0) {
      int p = lpf[n];
      int e = 0;
      for (; p == lpf[n]; e++, n /= p);
      int olen = divs.length;
      divs = Arrays.copyOf(divs, olen * (e + 1));
      for (int i = olen; i < divs.length; i++)
        divs[i] = divs[i - olen] * p;
    }
    return divs;
  }


  public static int[] enumLowestPrimeFactors(int n) {
    int tot = 0;
    int[] lpf = new int[n + 1];
    int u = n + 32;
    double lu = Math.log(u);
    int[] primes = new int[(int) (u / lu + u / lu / lu * 1.5)];
    for (int i = 2; i <= n; i++)
      lpf[i] = i;
    for (int p = 2; p <= n; p++) {
      if (lpf[p] == p)
        primes[tot++] = p;
      int tmp;
      for (int i = 0; i < tot && primes[i] <= lpf[p] && (tmp = primes[i] * p) <= n; i++) {
        lpf[tmp] = primes[i];
      }
    }
    return lpf;
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
