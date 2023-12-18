
public class Main {

  private static void solve() {
    int n = ni();
    char[] s = ns();

    System.out.println(solve(s));

    // int d = 10;
    // for (int i = 0; i < Math.pow(3, d); i++) {
    // char[] s = new char[d];
    // int v = i;
    // for (int j = 0; j < d; j++) {
    // s[j] = (char) (v % 3 + 1 + '0');
    // v /= 3;
    // }
    //
    // int ret = solve(s);
    // int ret3 = solve3(s);
    // if (ret != ret3) {
    // System.out.println("NG");
    // }
    // }
  }



  private static int solve(char[] s) {

    int odd = 0;
    int n = s.length;
    long[] table = new long[n];
    for (int i = 0; i < n; i++) {
      if (i <= n / 2)
        table[i] = C(n - 1, i, 2);


      int d = s[i] - '0';
      odd += d * table[i <= n / 2 ? i : (n - 1 - i)] % 2;
      odd %= 2;
    }

    int[] cnt = new int[4];
    for (char c : s) {
      cnt[c - '0']++;
    }
    if (cnt[1] > 0 && cnt[3] > 0 && cnt[2] == 0) {
      char[] to = new char[n - 1];
      for (int i = 0; i < n - 1; i++) {
        int d = Math.abs(s[i] - s[i + 1]);
        to[i] = (char) ((d == 2 ? 1 : 0) + '0');
      }
      return solve(to) == 1 ? 2 : 0;

    } else {
      return odd;
    }

  }


  private static int solve3(char[] s) {
    int n = s.length;
    int[][] a = new int[n + 1][n];
    for (int i = 0; i < n; i++) {
      a[0][i] = s[i] - '0';
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        a[i + 1][j] = Math.abs(a[i][j] - a[i][j + 1]);
      }
    }
    return a[n - 1][0];
  }

  public static long C(long n, long r, int p) {
    if (n < 0 || r < 0 || r > n)
      return 0L;
    if (r == 0 || n == r)
      return 1;
    long pe = 0;
    for (long i = n / p; i >= 1; i /= p)
      pe += i;
    for (long i = r / p; i >= 1; i /= p)
      pe -= i;
    for (long i = (n - r) / p; i >= 1; i /= p)
      pe -= i;
    if (pe > 0)
      return 0L;

    long flip = n / p - r / p - (n - r) / p;
    int nmp = (int) (n % p), rmp = (int) (r % p);
    if (nmp < rmp)
      return 0L;
    long ret = C(n / p, r / p, p);
    long den = 1;
    for (int i = 1; i <= rmp; i++) {
      ret = ret * (nmp - i + 1) % p;
      den = den * i % p;
    }
    ret = ret * invl(den, p) % p;
    if (flip % 2 != 0) {
      ret = -ret;
      if (ret < 0)
        ret += p;
    }
    return ret;
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

