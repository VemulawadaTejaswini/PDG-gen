
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class UnionFind {
  private int[] table;
  private int[] rank;
  
  public UnionFind(int size) {
      this.table = new int[size];
      this.rank = new int[size];
      for (int i = 0; i < size; i ++) {
          this.table[i] = i;
          this.rank[i] = 1;
      }
  }

  public boolean isSame(int node1, int node2) {
      return find(node1) == find(node2);
  }

  public int find(int node) {
      if (table[node] == node) {
          return node;
      } else {
          return table[node] = find(table[node]);
      }
  }

  public void union(int node1, int node2) {
      int root1 = find(node1);
      int root2 = find(node2);
      
      if (rank[root1] < rank[root2]) {
          table[root1] = root2;
      } else if (rank[root1] > rank[root2]) {
          table[root2] = root1;
      } else if (root1 != root2) {
          table[root2] = root1;
          rank[root1] ++;
      }
  }
}
public class Main {
  private static void solve() {
    int n = ni();
    int m = ni();
    
    int[] p = na(n);
    
    UnionFind uf = new UnionFind(n + 1);
    for (int i = 0; i < m; i ++) {
      uf.union(ni(), ni());
    }
    
    Map<Integer, List<int[]>> map = new HashMap<>();
    for (int i = 1; i <= n; i ++) {
      int q = p[i - 1];
      int root = uf.find(i);
      if (!map.containsKey(root)) {
        map.put(root, new ArrayList<>());
      }
      map.get(root).add(new int[] {q, i});
    }
    
    int ret = 0;
    for (List<int[]> list : map.values()) {
      Set<Integer> set = new HashSet<>();
      for (int[] x : list) {
        set.add(x[0]);
      }
      for (int[] x : list) {
        if (set.contains(x[1])) {
          ret ++;
        }
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


