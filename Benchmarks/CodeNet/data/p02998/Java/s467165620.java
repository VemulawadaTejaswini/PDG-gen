
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class DisjointSet {
  public int[] upper; // minus:num_element(root) plus:root(normal)
//public int[] w;
  
  public DisjointSet(int n)
  {
      upper = new int[n];
      Arrays.fill(upper, -1);
//    w = new int[n];
  }
  
  public DisjointSet(DisjointSet ds)
  {
      this.upper = Arrays.copyOf(ds.upper, ds.upper.length);
  }       
  
  public int root(int x)
  {
      return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
  }
  
  public boolean equiv(int x, int y)
  {
      return root(x) == root(y);
  }
  
  public boolean union(int x, int y)
  {
      x = root(x);
      y = root(y);
      if(x != y) {
          if(upper[y] < upper[x]) {
              int d = x; x = y; y = d;
          }
//        w[x] += w[y];
          upper[x] += upper[y];
          upper[y] = x;
      }
      return x == y;
  }
  
  public int count()
  {
      int ct = 0;
      for(int u : upper){
          if(u < 0)ct++;
      }
      return ct;
  }
  
  public int[][] toBucket()
  {
      int n = upper.length;
      int[][] ret = new int[n][];
      int[] rp = new int[n];
      for(int i = 0;i < n;i++){
          if(upper[i] < 0)ret[i] = new int[-upper[i]];
      }
      for(int i = 0;i < n;i++){
          int r = root(i);
          ret[r][rp[r]++] = i;
      }
      return ret;
  }
}



public class Main {


  private static void solve() {
    int n = ni();
    int[][] p = new int[n][3];
    
    
    for (int i = 0; i < n; i ++) {
      p[i] = new int[] {i, ni(), ni()};
    }
    
    DisjointSet ds = new DisjointSet(n);
    
    Arrays.sort(p, (o1, o2) -> o1[1] - o2[1]);
    for (int i = 0; i < n - 1; i ++) {
      if (p[i][1] == p[i + 1][1]) {
        ds.union(p[i][0],  p[i + 1][0]);
      }
    }
    Arrays.sort(p, (o1, o2) -> o1[2] - o2[2]);
    for (int i = 0; i < n - 1; i ++) {
      if (p[i][2] == p[i + 1][2]) {
        ds.union(p[i][0],  p[i + 1][0]);
      }
    }
    
    int[][] buc = ds.toBucket();

    long ret = 0;
    for (int[] a : buc) {
      if (a != null) {
        ret += f(a, p);
      }
      
    }
    System.out.println(ret);
  }

  static long f(int[] a, int[][] p) {
    Set<Integer> x = new HashSet<>();
    Set<Integer> y = new HashSet<>();
    for (int i : a) {
      x.add(p[i][1]);
      y.add(p[i][2]);
    }
    
    if (x.size() <= 1 || y.size() <= 1) {
      return 0;
    }
    
    return (long)x.size() * y.size() - a.length;
    
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
