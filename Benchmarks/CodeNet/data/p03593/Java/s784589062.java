
import java.util.Arrays;

public class Main {
  private static void solve() {
    int h = ni();
    int w = ni();

    char[][] a = new char[h][w];
    char[][] b = new char[w][h];
    for (int i = 0; i < h; i++) {
      a[i] = ns();
    }
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        b[j][i] = a[i][j];
      }
    }
    
    boolean ret1 = check(a);
    boolean ret2 = check(b);

    out.println(ret1 && ret2 ? "Yes" : "No");
  }
  
  private static boolean check(char[][] a) {
    int h = a.length;
    int w = a[0].length;
    boolean[] flg = new boolean[w];
    Arrays.fill(flg, true);

    for (int i = 0; i < h; i ++) {
      boolean[] v = search(a[i]);
      if (v == null) {
        return false;
      } else {
        for (int j = 0; j < w; j ++) {
          if (!v[j]) {
            flg[j] = false;
          }
        }
        
        boolean ok = false;
        for (boolean x : flg) {
          if (x) {
            ok = true;
            break;
          }
        }
        
        if (!ok) {
          return false;
        }
      }
    }
    return true;
  }

  private static boolean[] search(char[] v) {
    int[] count = new int[26];
    for (char c : v) {
      count[c - 'a'] ++;
    }
    int odd = 0;
    char oddC = 0;
    for (int i = 0; i < 26; i ++) {
      if (count[i] % 2 == 1) {
        odd ++;
        if (odd >= 2) {
          return null;
        }
        oddC = (char)(i + 'a');
      }
    }
    
    boolean[] ret = new boolean[v.length];
    if (oddC == 0) {
      Arrays.fill(ret, true);
      return ret;
    }
    for (int i = 0; i < v.length; i ++) {
      if (v[i] == oddC) {
        ret[i] = true;
      }
    }
    return ret;
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
      a[i] = ni();
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


