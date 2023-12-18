
public class Main {
  private static void solve() {
    int n = ni();
    int[] from = new int[n-1];
    int[] to = new int[n-1];
    for (int i = 0; i < n - 1; i ++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
    }
    int[][] g = packU(n, from, to);
    
    ved1 = new int[n];
    ved2 = new int[n];
    q = new int[n];
    int ret = dfs(0, new boolean[n], g);
    System.out.println(ret - 1);
  }
  
  private static int dfs(int now, boolean[] ved, int[][] g) {

    int[] dia = diameter(g, now, ved);
    ved[dia[3]] = true;
    int max = -1;
    
    for (int next : g[dia[3]]) {
      if (ved[next]) continue;
      max = Math.max(max, dfs(next, ved, g));
    }
    
    return max + 1;
  }
  
  public static int[][] packU(int n, int[] from, int[] to){ return packU(n, from, to, from.length); }
  public static int[][] packU(int n, int[] from, int[] to, int sup)
  {
      int[][] g = new int[n][];
      int[] p = new int[n];
      for(int i = 0;i < sup;i++)p[from[i]]++;
      for(int i = 0;i < sup;i++)p[to[i]]++;
      for(int i = 0;i < n;i++)g[i] = new int[p[i]];
      for(int i = 0;i < sup;i++){
          g[from[i]][--p[from[i]]] = to[i];
          g[to[i]][--p[to[i]]] = from[i];
      }
      return g;
  }

  
  private static int[] ved1;
  private static int[] ved2;
  private static int cnt = 1;
  private static int[] q;
  public static int[] diameter(int[][] g, int v, boolean[] sved)
  {
    cnt ++;
      int f0 = -1, f1 = -1, d01 = -1, c = -1;
      {
          int qp = 0;
          q[qp++] = v; ved1[0] = cnt;
          for(int i = 0;i < qp;i++){
              int cur = q[i];
              for(int e : g[cur]){
                  if(ved1[e] != cnt && !sved[e]){
                      ved1[e] = cnt;
                      q[qp++] = e;
                      continue;
                  }
              }
          }
          f0 = q[qp-1];
      }
      {
          int qp = 0;

          q[qp++] = f0; ved2[f0] = cnt;
          for(int i = 0;i < qp;i++){
              int cur = q[i];
              for(int e : g[cur]){
                  if(ved2[e] != cnt && !sved[e]){
                      ved2[e] = cnt;
                      q[qp++] = e;
                      continue;
                  }
              }
          }
          f1 = q[qp-1];
          c = q[qp / 2];
      }
      return new int[]{d01, f0, f1, c};
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
