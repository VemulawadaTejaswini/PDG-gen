
import java.util.Arrays;

public class Main {

  static int H;
  static int W;
  private static void solve() {
    H = ni();
    W = ni();
    
    char[][] map = new char[H][];
    for (int i = 0; i < H; i ++) {
      map[i] = ns();
    }
    

    int ptr = 0;
    int[] from = new int[200000];
    int[] to = new int[200000];
    int[] w = new int[200000];

    int src = W * H * 2;
    int sink = W * H * 2 + 1;

    int INF = 110000;
    int[][] DIR = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    for (int i = 0; i < H; i ++) {
      for (int j = 0; j < W; j ++) {
        int in = j + W * i;
        int out = H * W + j + i * W;
        from[ptr] = in;
        to[ptr] = out;
        w[ptr] = map[i][j] == 'X' ? INF : 1;
        ptr ++;
        
        if (i == 0 || i == H - 1 || j == 0 || j == W - 1) { 
          if (map[i][j] == 'X') {
            System.out.println(-1);
            return;
          } else {
            from[ptr] = out;
            to[ptr] = sink;
            w[ptr] = INF;
            ptr ++;
          }
        }

        if (map[i][j] == 'X') {
          from[ptr] = src;
          to[ptr] = in;
          w[ptr] = INF;
          ptr ++;
        }
        
        for (int[] d : DIR) {
          int ni = i + d[0];
          int nj = j + d[1];
          if (ni < 0 || ni >= H || nj < 0 || nj >= W) {
            continue;
          } else {
            int nin = nj + W * ni;
            from[ptr] = out;
            to[ptr] = nin;
            w[ptr] = INF;
            ptr ++;
          }
        }
      }
    }
    from = Arrays.copyOf(from, ptr);
    to = Arrays.copyOf(to, ptr);
    w = Arrays.copyOf(w, ptr);
    
    int[][][] cap = packWD(sink + 1, from, to, w);
    
    int ret = maximumFlowDinic(cap, src, sink);
    System.out.println(ret);
  }

  public static int[][][] packWD(int n, int[] from, int[] to, int[] w){ return packWD(n, from, to, w, from.length); }
  public static int[][][] packWD(int n, int[] from, int[] to, int[] w, int sup)
  {
      int[][][] g = new int[n][][];
      int[] p = new int[n];
      for(int i = 0;i < sup;i++)p[from[i]]++;
      for(int i = 0;i < n;i++)g[i] = new int[p[i]][2];
      for(int i = 0;i < sup;i++){
          --p[from[i]];
          g[from[i]][p[from[i]]][0] = to[i];
          g[from[i]][p[from[i]]][1] = w[i];
      }
      return g;
  }
  
  public static int maximumFlowDinic(int[][][] g, int source, int sink)
  {
      int n = g.length;
      
      // unweighted invgraph
      int[] p = new int[n];
      for(int i = 0;i < n;i++){
          for(int j = 0;j < g[i].length;j++)p[g[i][j][0]]++;
      }
      int[][] ig = new int[n][];
      for(int i = 0;i < n;i++)ig[i] = new int[p[i]];
      for(int i = n-1;i >= 0;i--){
          for(int j = 0;j < g[i].length;j++){
              ig[g[i][j][0]][--p[g[i][j][0]]] = i;
          }
      }
      
      int[][] f = new int[n][n];
      int[] d = new int[n];
      int[] q = new int[n];
      int ret = 0;
      while(true){
          Arrays.fill(d, -1);
          q[0] = source;
          int r = 1;
          d[source] = 0;
          
          for(int v = 0;v < r;v++){
              int cur = q[v];
              // plus flow
              for(int[] ne : g[cur]){
                  int nex = ne[0], w = ne[1];
                  if(d[nex] == -1 && w - f[cur][nex] > 0) {
                      q[r++] = nex;
                      d[nex] = d[cur] + 1;
                  }
              }
              // minus flow
              for(int nex : ig[cur]){
                  if(d[nex] == -1 && -f[cur][nex] > 0) {
                      q[r++] = nex;
                      d[nex] = d[cur] + 1;
                  }
              }
          }
          if(d[sink] == -1)break;
          int delta = 0;
          while((delta = dfsDinic(d, g, ig, f, source, sink, Integer.MAX_VALUE)) > 0){
              ret += delta;
          }
      }
      
      return ret;
  }
  
  public static int dfsDinic(int[] d, int[][][] g, int[][] ig, int[][] f, int cur, int t, int min)
  {
      if(cur == t){
          return min;
      }else{
          int left = min;
          for(int[] ne : g[cur]){
              int nex = ne[0], w = ne[1];
              if(d[nex] == d[cur]+1 && w-f[cur][nex] > 0){
                  int fl = dfsDinic(d, g, ig, f, nex, t, Math.min(left, w-f[cur][nex]));
                  if(fl > 0){
                      f[cur][nex] += fl;
                      f[nex][cur] -= fl;
                      left -= fl;
                      if(left == 0)return min;
                  }
              }
          }
          for(int nex : ig[cur]){
              if(d[nex] == d[cur]+1 && -f[cur][nex] > 0){
                  int fl = dfsDinic(d, g, ig, f, nex, t, Math.min(left, -f[cur][nex]));
                  if(fl > 0){
                      f[cur][nex] += fl;
                      f[nex][cur] -= fl;
                      left -= fl;
                      if(left == 0)return min;
                  }
              }
          }
          return min-left;
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
