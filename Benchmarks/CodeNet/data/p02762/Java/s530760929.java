import java.util.*;
import java.io.*;

public class Main {

  void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int m = in.nextInt();
    int k = in.nextInt();

    UnionFind uf = new UnionFind(n);
    int[] deg = new int[n];
    for (int i = 0; i < m; ++i) {
      int u = in.nextInt() - 1;
      int v = in.nextInt() - 1;

      deg[u]++;
      deg[v]++;
      uf.union(u, v);
    }

    int[] ans = new int[n];
    for (int i = 0; i < n; ++i) {
      ans[i] = uf.sizeOfSet(i) - deg[i] - 1;
      //System.err.println(i + " " + uf.sizeOfSet(i) + " " + deg[i]);
    }

    for (int i = 0; i < k; ++i) {
      int u = in.nextInt() - 1;
      int v = in.nextInt() - 1;

      if (uf.isSameSet(u, v)) {
        ans[u]--;
        ans[v]--;
      }
    }

    for (int i = 0; i < n; ++i) {
      out.print(ans[i] + " ");
    }
  }

  public static void main(String[] args) throws Exception {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    Main solver = new Main();
    solver.solve(in, out);
    out.close();
  }

  static class InputReader {
    BufferedReader in;
    StringTokenizer st;

    public InputReader(InputStream is) {
      in = new BufferedReader(new InputStreamReader(is));
    }

    public String next() {
      try {
        while (st == null || !st.hasMoreTokens()) {
          st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }
  }
}

class UnionFind {
  int[] p, size;
  
  public UnionFind(int n) {
    p = new int[n];
    size = new int[n];
    for (int i = 0; i < n; ++i) {
      size[i] = 1;
      p[i] = i;
    }
  }

  public int find(int u) {
    if (p[u] == u) {
      return u;
    }

    return p[u] = find(p[u]);
  }

  public boolean isSameSet(int u, int v) {
    return find(u) == find(v);
  }

  public int sizeOfSet(int u) {
    return size[find(u)];
  }

  public void union(int u, int v) {
    int x = find(u);
    int y = find(v);

    if (x != y) {
      if (size[x] > size[y]) {
        size[x] += size[y];
        p[y] = x;
      } else {
        p[x] = y;
        size[y] += size[x];
      }
    }
  }
}
