import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {

  private static class Node {
    int c;
    int str = -1;
    int[] cnt = new int[26];
    Node[] child = new Node[26];

    public Node(int c) {
      this.c = c;
    }

    public void add(char[] s, int i, int n) {
      if (i == s.length) {
        this.str = n;
        return;
      }
      int c = s[i] - 'a';

      if (this.child[c] == null) {
        this.child[c] = new Node(c);
      }
      this.child[c].add(s, i + 1, n);
    }
  }

  private static void dfs2(Node node, int[][] cnt, Map<Integer, List<Query>> map, int n) {

    if (map.containsKey(node.str)) {
      for (Query query : map.get(node.str)) {
        int ret = 0;
        char[] p = query.p;
        for (int i = 0; i < 26; i++) {
          for (int j = i + 1; j < 26; j++) {
            ret += cnt[p[i] - 'a'][p[j] - 'a'];
          }
        }
        for (int i = 0; i < 26; i++) {
          ret += node.cnt[i];
        }
        query.ret = n - ret;
      }
    }

    for (int i = 0; i < 26; i++) {
      if (node.child[i] == null)
        continue;

      for (int j = 0; j < 26; j++) {
        cnt[node.child[i].c][j] += node.cnt[j];
      }
      dfs2(node.child[i], cnt, map, n);
      for (int j = 0; j < 26; j++) {
        cnt[node.child[i].c][j] -= node.cnt[j];
      }
    }
  }

  private static int dfs(Node node) {
    int total = node.str >= 0 ? 1 : 0;

    for (int i = 0; i < 26; i++) {
      if (node.child[i] == null)
        continue;

      node.cnt[i] = dfs(node.child[i]);
      total += node.cnt[i];
    }
    return total;
  }

  private static class Query {
    char[] p;
    int index;
    int i;
    int ret;
  }

  private static void solve() {
    int n = ni();
    char[][] s = new char[n][];

    Node root = new Node(-1);
    for (int i = 0; i < n; i++) {
      s[i] = ns();
      root.add(s[i], 0, i);
    }

    int q = ni();
    Map<Integer, List<Query>> map = new HashMap<>();

    for (int i = 0; i < q; i++) {

      int k = ni() - 1;
      char[] p = ns();

      Query query = new Query();
      query.i = k;
      query.p = p;
      query.index = i;

      map.putIfAbsent(k, new ArrayList<>());
      map.get(k).add(query);
    }

    dfs(root);
    dfs2(root, new int[26][26], map, n);

    int[] ret = new int[q];
    for (List<Query> queries : map.values()) {
      for (Query query : queries)
        ret[query.index] = query.ret;
    }

    for (int v : ret) {
      out.println(v);
    }
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
