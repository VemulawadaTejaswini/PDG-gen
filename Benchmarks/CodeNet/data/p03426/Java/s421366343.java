
import java.util.HashMap;
import java.util.Map;

public class Main {

  private static void solve() {
    int h = ni();
    int w = ni();
    int d = ni();
    
    Map<Integer, int[]> map = new HashMap<>();
    for (int i = 0; i < h; i ++) {
      for (int j = 0; j < w; j ++) {
        int a = ni() - 1;
        map.put(a, new int[] {i, j});
      }
    }
    long[][] arr = new long[d][h * w / d + 1];
    for (int i = 0; i < d; i ++) {
      for (int j = i + d; j < w * h; j += d) {
        int[] p1 = map.get(j - d);
        int[] p2 = map.get(j);
        int len = Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
        arr[i][j / d] = arr[i][j / d - 1] + len;
      }
    }
    
    int q = ni();
    for (int i = 0; i < q; i ++) {
      int l = ni() - 1;
      int r = ni() - 1;
      
      int m = l % d;
      long ans = arr[m][r / d] - arr[m][l / d];
      out.println(ans);
    }
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
