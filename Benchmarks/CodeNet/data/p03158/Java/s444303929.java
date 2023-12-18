
public class Main {


  private static void solve() {
    int n = ni();
    int q = ni();
    int[] a = na(n);
    int[] x = na(q);


    long[] sum = new long[n + 1];
    long[] esum = new long[n + 1];
    long[] osum = new long[n + 1];
    for (int i = 0; i < n; i ++) {
      sum[i + 1] = sum[i] + a[i];

      esum[i + 1] = esum[i] + (i % 2 == 1 ? a[i] : 0);
      osum[i + 1] = osum[i] + (i % 2 == 0 ? a[i] : 0);
    }
    
    for (int v : x) {
      int ok = 1;
      int ng = n;
      while (ng - ok > 1) {
        int k = (ok + ng) / 2;
        if (ok(k, a, v)) {
          ok = k;
        } else {
          ng = k;
        }
      }
      long ret = (sum[n] - sum[n - ok]);

      int last = Math.max(0, n - ok * 2);
      if (last % 2 == 0) {
        ret += esum[last];
      } else {
        ret += osum[last];
      }
      System.out.println(ret);
    }
  }

  //Takahashiくんが上からk枚取ることが可能か
  private static boolean ok(int k, int[] a, int x) {
    int n = a.length;
    if (k > a.length) return false;

    int d = a[n - k] - x;
    int s = lowerBound(a, x - d);
    int m = (n - k) - s + 1;
    return m >= k;
  }

  public static int lowerBound(int[] a, int v)
  {
      int low = -1, high = a.length;
      while(high-low > 1){
          int h = high+low>>>1;
          if(a[h] >= v){
              high = h;
          }else{
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
