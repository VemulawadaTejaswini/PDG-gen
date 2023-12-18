
public class Main {
  static char[][] map;
  static int h, w;
  private static void solve() {
    h = ni();
    w = ni();
    
    map = new char[h][w];
    for (int i = 0; i < h; i ++) {
      map[i] = ns();
    }
    
    int n = h;
    if (!dfs(n, 0, 0, new int[n / 2][2])) {
      System.out.println("NO");
      return;
    }
    
    char[][] tr = new char[w][h];
    for (int i = 0; i < h; i ++) {
      for (int j = 0; j < w; j ++) {
        tr[j][i] = map[i][j];
      }
    }
    map = tr;
    int tmp = w;
    w = h;
    h = tmp;
    
    if (!dfs(n, 0, 0, new int[n / 2][2])) {
      System.out.println("NO");
      return;
    }
    System.out.println("YES");
        
  }
  
  private static boolean check(int[][] pair) {
    boolean[] usedRow = new boolean[h];
    for (int[] v : pair) {
      int[][] cnt = new int[2][26];
      usedRow[v[0]] = usedRow[v[1]] = true;
      for (int i = 0; i < w; i ++) {
        cnt[0][map[v[0]][i] - 'a'] ++;
        cnt[1][map[v[1]][i] - 'a'] ++;
      }
      
      for (int i = 0; i < 26; i ++) {
        if (cnt[0][i] != cnt[1][i]) {
          return false;
        }
      }
    }
    return true;
  }
  
  private static boolean dfs(int n, int map, int k, int[][] pair) {
    if (k == n / 2) {
      return check(pair);
    }

    for (int i = 0; i < n; i ++) {
      if (((map >> i) & 1) == 0) {
        for (int j = i + 1; j < n; j ++) {
          if (((map >> j) & 1) == 0) {
            pair[k][0] = i;
            pair[k][1] = j;
            boolean ret = dfs(n, map | (1 << i) | (1 << j), k + 1, pair);
            if (ret) {
              return true;
            }
          }
        }
        break;
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


