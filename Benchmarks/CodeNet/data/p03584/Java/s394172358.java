
public class Main {

  static class Node {
    Node node0;
    Node node1;
    long sum = -1;
    
    public void add(int x, long value, int depth) {
      if (depth < 0) {
        this.sum = value;
        return;
      }

      if ((x & (1 << depth)) != 0) {
        if (node1 == null) {
          node1 = new Node();
        }
        node1.add(x, value, depth - 1);
      } else {
        if (node0 == null) {
          node0 = new Node();
        }
        node0.add(x, value, depth - 1);
      }
    }
    
    public long sum() {
      if (sum < 0) {
        sum = 0;
        if (node1 != null) {
          sum +=  node1.sum();
        }
        if (node0 != null) {
          sum += node0.sum();
        }
      }
      return sum;
    }
    
    public long max(int k, int depth) {
      if (depth < 0) {
        return this.sum;
      }
      if ((k & (1 << depth)) != 0) {
        long a = node0 == null ? 0 : node0.sum;
        long b = node0 == null ? 0 : node0.max(k, depth - 1);
        long c = node1 == null ? 0 : node1.max(k, depth - 1);
        return Math.max(a, b + c);
      } else {
        long b = node0 == null ? 0 : node0.max(k, depth - 1);
        return b;
      }
    }
  }
  
  private static void solve() {
    int n = ni();
    int k = ni();
    int[][] a = ntable(n, 2);
    
    Node root = new Node();
    for (int[] v : a) {
      root.add(v[0], v[1], 30);
    }
    root.sum();
    

    System.out.println(root.max(k, 30));
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


