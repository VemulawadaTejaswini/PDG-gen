
import java.util.Arrays;

class DisjointSet {
  public int[] upper; // minus:num_element(root) plus:root(normal)
  
  public DisjointSet(int n)
  {
      upper = new int[n];
      Arrays.fill(upper, -1);
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
          upper[x] += upper[y];
          upper[y] = x;
      }
      return x == y;
  }
}


public class Main {


  private static void solve() {
    int n = ni();
    long d = ni();
    int[] a = na(n);
    int[] from = new int[n * 2 - 2];
    int[] to = new int[n * 2 - 2];
    long[] w = new long[n * 2 - 2];
    
    int ptr = 0;
    int minArg = 0;
    for (int i = 1; i < n; i ++) {
      long x = Math.abs(minArg - i) * d + a[minArg];
      long y = d + a[i - 1];;
      if (x > y) {
        minArg = i - 1;
      }
      from[ptr] = i;
      to[ptr] = minArg;
      w[ptr] = Math.min(x, y) + a[i];
      ptr ++;
    }
    
    minArg = n - 1;
    for (int i = n - 2; i >= 0; i --) {
      long x = Math.abs(minArg - i) * d + a[minArg];
      long y = d + a[i + 1];;
      if (x > y) {
        minArg = i + 1;
      }
      from[ptr] = i;
      to[ptr] = minArg;
      w[ptr] = Math.min(x, y) + a[i];
      ptr ++;
    }
    
    DisjointSet ds = new DisjointSet(n);
    long[][] idx = new long[ptr][2];
    for (int i = 0; i < ptr; i ++) {
      idx[i][0] = i;
      idx[i][1] = w[i];
    }
    Arrays.sort(idx, (o1, o2) -> Long.compare(o1[1], o2[1]));
    long ret = 0;
    for (int i = 0; i < ptr; i ++) {
      int j = (int)idx[i][0];
      if (ds.root(from[j]) != ds.root(to[j])) {
        ret += w[j];
        ds.union(from[j], to[j]);
      }
    }
    System.out.println(ret);
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
