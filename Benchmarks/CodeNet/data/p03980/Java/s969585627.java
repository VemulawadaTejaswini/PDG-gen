
import java.util.ArrayList;
import java.util.List;

public class Main {

  private static void solve() {
    int q = ni();
    
    for (int i = 0; i < q; i ++) {
      int[] ret = solve(ns());
      out.println(ret[0] + " " + ret[1]);
    }
  }
  
  public static int[] solve(char[] s) {
    //{maxFlg, left, rightMin, rightMax}

    int n = s.length;

    int ptr = 0;
    Node now = new Node();
    Node root = now;
    List<Node> numList = new ArrayList<>();

    for (int i = 0; i < n; i ++) {
      char c = s[i];
      if (c == '^' || c == '_') {
        now.maxFlg = c == '^';
        now.left = new Node();
        now.right = new Node();
        now.left.parent = now.right.parent = now;
      } else if (c == ',') {
        now.pos[ptr] = i;
        now = now.parent.right;
        ptr = 0;
      } else if (c == ')') {
        now.pos[ptr] = i;
        now = now.parent;
      } else if (c == '(') {
        now = now.left;
        ptr = 0;
      } else if (c == '?') {
        now.pos[ptr] = i;
      } else if ('0' <= c && c <= '9') {
        if (ptr == 0) numList.add(now);
        now.v[ptr] = c;
        now.pos[ptr] = i;
        ptr ++;
      }
    }

    ptr = 0;
    while (root.min < root.max) {
      while (!numList.get(ptr).read()) {
        if (root.min == root.max) break;
        ptr ++;
      }
    }
    now = numList.get(ptr);
    return new int[] {root.min, now.pos[now.ptr - 1] + 1};
  }
  

  private static class Node {
    public Node parent;
    public Node left;
    public Node right;
    
    public boolean maxFlg;
    
    public int max = 99;
    public int min = 0;
    public char[] v = {0, 0, 0, 0};
    public int[] pos = {0, 0, 0, 0};
    public int ptr = 0;
    
    public void set() {
      int min, max;
      if (maxFlg) {
        min = Math.max(left.min, right.min);
        max = Math.max(left.max, right.max);
      } else {
        min = Math.min(left.min, right.min);
        max = Math.min(left.max, right.max);
      }
      boolean updated = false;
      if (min != this.min || max != this.max) {
        updated = true;
      }
      this.min = min;
      this.max = max;
      if (updated && parent != null)
        parent.set();
    }
    
    private boolean read() {
      if (v[ptr] == 0) {
        if (ptr == 1) {
          max = min;
          if (parent != null)
            parent.set();
          ptr ++;
          return true;
        }
        return false;
      }

      if (ptr == 0) {
        int x = v[ptr] - '0';
        if (x > 0) {
          max = x * 10 + 9;
          min = x;
        } else {
          max = 0;
          min = 0;
        }
      } else {
        int x = (v[0] - '0') * 10 + (v[1] - '0');
        max = x;
        min = x;
      }
      if (parent != null)
        parent.set();
      ptr ++;
      return true;
    }
    
    public String toString() {
      return("{ Type:" + (maxFlg ? '^' : '_') + " Max:" + max + " Min:" + min + " Left:" + left + " Right:" + right + "}");
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
