
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Ranking {
    public String[] min;
    public int[] argmin;
    public int K;
    
    public Ranking(int K)
    {
        this.K = K;
        min = new String[K];
        argmin = new int[K];
        Arrays.fill(argmin, -1);
    }
    
    public void query(String v, int ind)
    {
        for(int i = 0;i < K;i++){
            if(min[i] == null || v.compareTo(min[i]) < 0){
                for(int j = K-2;j >= i;j--){
                    min[j+1] = min[j];
                    argmin[j+1] = argmin[j];
                }
                min[i] = v;
                argmin[i] = ind;
                break;
            }
        }
    }
}



public class Main {
  private static void solve() {
    char[] s = ns();
    int k = ni();
    Ranking rank = new Ranking(k);
    Set<String> set = new HashSet<>();
    int n = s.length;
    for (int i = 0; i < n; i ++) {
      for (int j = i + 1; j <= n; j ++) {
        String str = new String(s, i, j - i);
        if (!set.contains(str)) {
          set.add(str);
          rank.query(str, i);
        }
      }
    }

    System.out.println(rank.min[k - 1]);
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


