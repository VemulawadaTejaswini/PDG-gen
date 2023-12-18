
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  private static void solve() {
    int n = ni();
    int m = ni();
    int[] from = new int[m];
    int[] to = new int[m];
    Set<Integer> con = new HashSet<>();
    for (int i = 0; i < m; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      con.add(from[i] * 1000 + to[i]);
      con.add(to[i] * 1000 + from[i]);
    }
    int[][] g = packU(n, from, to);
    boolean[] all = new boolean[n];
    int allCount = 0;
    for (int i = 0; i < n; i++) {
      all[i] = g[i].length == n - 1;
      if (all[i]) {
        allCount ++;
      }
    }

    List<Integer> ok = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (all[i]) continue;
      boolean[] color = new boolean[n];
      Set<Integer> set = new HashSet<>();
      color(i, color, g, all, set, con);
      
      if (check(color, g)) {
        int cnt = 0;
        for (int j = 0; j < n; j ++) {
          if (color[j]) {
            cnt ++;
          }
        }
        ok.add(cnt);
      }
    }
    if (ok.size() == 0) {
      System.out.println(-1);
      return;
    }
    
    // edgeの数
    int min = Integer.MAX_VALUE;
    for (int x : ok) {
      int s = x;
      int e = x + allCount;
      for (int i = s; i <= e; i ++) {
        int n1 = i;
        int n2 = n - i;
        min = Math.min(n1 * (n1 - 1) / 2 + n2 * (n2 - 1)  /2, min);
      }
    }
    System.out.println(min);
  }

  private static boolean check(boolean[] used, int[][] g) {
    int n = used.length;
    int m = 0;
    int edges = 0;
    for (int i = 0; i < n; i++) {
      if (!used[i]) {
        m++;
        for (int v : g[i]) {
          if (!used[v]) {
            edges++;
          }
        }
      }
    }
    return edges == m * (m - 1);
  }
  
  
  private static void color(int now, boolean[] color, int[][] g, boolean[] all, Set<Integer> set, Set<Integer> con) {
    color[now] = true;
    set.add(now);
    int n = g.length;
    outer: for (int next : g[now]) {
      if (all[next] || color[next])
        continue;
      
      for (int v : set) {
        if (!con.contains(next * 1000 + v)) { 
          continue outer;
        }
      }

      color(next, color, g, all, set, con);
    }
  }

  public static int[][] packU(int n, int[] from, int[] to) {
    return packU(n, from, to, from.length);
  }

  public static int[][] packU(int n, int[] from, int[] to, int sup) {
    int[][] g = new int[n][];
    int[] p = new int[n];
    for (int i = 0; i < sup; i++)
      p[from[i]]++;
    for (int i = 0; i < sup; i++)
      p[to[i]]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]];
    for (int i = 0; i < sup; i++) {
      g[from[i]][--p[from[i]]] = to[i];
      g[to[i]][--p[to[i]]] = from[i];
    }
    return g;
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


