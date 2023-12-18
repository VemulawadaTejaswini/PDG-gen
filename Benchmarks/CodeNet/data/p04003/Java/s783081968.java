
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Main {

  static int currentId = 0;
  static int[][][] g;
  static List<int[]> edge = new ArrayList<>();
  static Map<Long, Integer> c2id = new HashMap<>();
  static Set<Integer> visited = new HashSet<>();;

  private static void solve() {
    int n = ni();
    int m = ni();
    int[] from = new int[m];
    int[] to = new int[m];
    int[] w = new int[m];
    for (int i = 0; i < m; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      w[i] = ni();
    }
    g = packWU(n, from, to, w);
    dfs(0, 0);

    
    int target = id(n - 1, 0);
    
    int l = edge.size();
    int[] nf = new int[l];
    int[] nt = new int[l];
    int[] nw = new int[l];
    for (int i = 0; i < l; i ++) {
      int[] v = edge.get(i);
      nf[i] = v[0];
      nt[i] = v[1];
      nw[i] = v[2];
    }
    
    int[][][] h = packWU(c2id.size(), nf, nt, nw);
    int[] d = dijk(h, 0);
    System.out.println(d[target] >= Integer.MAX_VALUE / 2 ? -1 : d[target]);
  }

  public static int[] dijk(int[][][] g, int from)
  {
      int n = g.length;
      int[] d = new int[n];
      Arrays.fill(d, Integer.MAX_VALUE);
      Queue<int[]> q = new PriorityQueue<int[]>(100000, new Comparator<int[]>(){
          public int compare(int[] a, int[] b) {
              if(a[1] - b[1] != 0)return a[1] - b[1];
              return a[0] - b[0];
          }
      });
      q.add(new int[]{from, 0});
      
      d[from] = 0;
      while(q.size() > 0){
          int[] cur = q.poll();
          for(int[] e : g[cur[0]]){
              int next = e[0];
              int nd = d[cur[0]] + e[1];
              if(nd < d[next]){
                  d[next] = nd;
                  q.add(new int[]{next, nd});
              }
          }
      }
      return d;
  }

  private static void dfs(int now, int company) {
    visited.add(id(now, company));

    for (int[] next : g[now]) {
      int nc = next[1];
      int nv = next[0];
      if (visited.contains(id(nv, nc)))
        continue;

      if (company == 0) {
        edge.add(new int[] {id(now, 0), id(nv, nc), 1});
        dfs(nv, nc);
      } else if (nc == company) {
        edge.add(new int[] {id(now, company), id(nv, nc), 0});
        dfs(nv, nc);
      }
    }
    if (!visited.contains(id(now, 0))) {
      edge.add(new int[] {id(now, company), id(now, 0), 0});
      dfs(now, 0);
    }
  }

  private static int id(int node, int company) {
    long hash = company * 10000000L + node;
    if (c2id.containsKey(hash)) {
      return c2id.get(hash);
    } else {
      int id = currentId;
      c2id.put(hash, id);
      currentId++;
      return id;
    }
  }

  public static int[][][] packWU(int n, int[] from, int[] to, int[] w) {
    int sup = from.length;
    int[][][] g = new int[n][][];
    int[] p = new int[n];
    for (int i = 0; i < sup; i++)
      p[from[i]]++;
    for (int i = 0; i < sup; i++)
      p[to[i]]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]][2];
    for (int i = 0; i < sup; i++) {
      --p[from[i]];
      g[from[i]][p[from[i]]][0] = to[i];
      g[from[i]][p[from[i]]][1] = w[i];
      --p[to[i]];
      g[to[i]][p[to[i]]][0] = from[i];
      g[to[i]][p[to[i]]][1] = w[i];
    }
    return g;
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
