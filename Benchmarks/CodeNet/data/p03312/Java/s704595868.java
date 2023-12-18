
public class Main {



  private static void solve() {
    int n = ni();
    int[] a = na(n);

    long[] sum = new long[n + 1];
    for (int i = 0; i < n; i++) {
      sum[i + 1] = sum[i] + a[i];
    }
    
    long[] pre = mins(a);
    long[] suf = mins(rev(a));
    long ret = Long.MAX_VALUE;
    for (int i = 2; i < n - 1; i ++) {
      long big = (sum[i] + pre[i-1])/2;
      long sma = (sum[i] - pre[i-1])/2;
      long big2 = (sum[n] - sum[i] + suf[n-2-(i-1)])/2;
      long sma2 = (sum[n] - sum[i] - suf[n-2-(i-1)])/2;
      
      ret = Math.min(ret, Math.max(big, big2) - Math.min(sma, sma2));
    }
    System.out.println(ret);
  }

  private static int[] rev(int[] a) {
    int[] ret = new int[a.length];
    for (int i = 0; i < a.length; i ++) {
      ret[a.length - i - 1] = a[i];
    }
    return ret;
  }
  private static long[] mins(int[] a) {
    int n = a.length;
    long[] sum = new long[n + 1];
    for (int i = 0; i < n; i++) {
      sum[i + 1] = sum[i] + a[i];
    }

    long[] mins = new long[n];
    for (int i = 1; i < n; i++) {
      int lb = lowerBound(sum, sum[i + 1] / 2);
      mins[i] = Long.MAX_VALUE / 2;
      mins[i] = Math.min(mins[i], Math.abs(sum[lb] - (sum[i + 1] - sum[lb])));
      mins[i] = Math.min(mins[i], Math.abs(sum[lb - 1] - (sum[i + 1] - sum[lb - 1])));
    }
    return mins;
  }

  public static int lowerBound(long[] a, long v) {
    int low = -1, high = a.length;
    while (high - low > 1) {
      int h = high + low >>> 1;
      if (a[h] >= v) {
        high = h;
      } else {
        low = h;
      }
    }
    return high;
  }



  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = System.getProperty("debug");
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
