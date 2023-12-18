
import java.util.Arrays;
import java.util.BitSet;

public class Main {
  private static void solve() {
    int n = ni();
    int[][] a = ntable(n, 2);
    int[][] b = ntable(n, 2);
    
    
    boolean[][] g = new boolean[n][n];
    for (int i = 0; i < n; i ++) {
      for (int j = 0; j < n; j ++) {
        if (a[i][0] < b[j][0] && a[i][1] < b[j][1]) {
          g[i][j] = true;
        }
      }
    }
    
    System.out.println(doBipartiteMatching(g));
  }

  public static int doBipartiteMatching(boolean[][] g)
  {
      int n = g.length;
      if(n == 0)return 0;
      int m = g[0].length;
      if(m == 0)return 0;
      int[] im = new int[m];
      Arrays.fill(im, -1);
      BitSet visited = new BitSet();
      int matched = 0;
      for(int i = 0;i < n;i++){
          if(visit(g, i, visited, im)) {
              visited.clear();
              matched++;
          }
      }
      return matched;
  }
  
  public static boolean visit(boolean[][] g, int cur, BitSet visited, int[] im)
  {
      if(cur == -1)return true;

      for(int i = visited.nextClearBit(0);i != g[cur].length;i = visited.nextClearBit(i+1)){
          if(g[cur][i]){
              visited.set(i);
              if(visit(g, im[i], visited, im)){
                  im[i] = cur;
                  return true;
              }
          }
      }
      return false;
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


