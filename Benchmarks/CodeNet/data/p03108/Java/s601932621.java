import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    DDecayedBridges solver = new DDecayedBridges();
    solver.solve(1, in, out);
    out.close();
  }

  static class DDecayedBridges {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      int[] a = new int[m];
      int[] b = new int[m];
      long[] inconv = new long[m];
      UnionFind uf = new UnionFind();
      uf.init(n);
      for (int i = 0; i < m; i++) {
        a[i] = in.nextInt();
        b[i] = in.nextInt();
      }

      inconv[m - 1] = (long) (n * (n - 1)) / 2;
      for (int i = m - 1; i > 0; i--) {
        if (uf.same(a[i], b[i])) {
          inconv[i - 1] = inconv[i];
        } else {
          inconv[i - 1] = inconv[i] - (long) uf.size(a[i]) * uf.size(b[i]);
        }
        uf.union(a[i], b[i]);
      }

      for (int i = 0; i < m; i++) {
        out.println(inconv[i]);
      }

    }

  }

  static class UnionFind {

    private int MAX_N = 1000000;
    int[] parent = new int[MAX_N];
    int[] treeSize = new int[MAX_N];

    void init(int n) {
      for (int i = 0; i < n; i++) {
        parent[i] = i;
        treeSize[i] = 1;
      }
    }

    int find(int x) {
      if (parent[x] == x) {
        // X is Root
        return x;
      } else {
        return parent[x] = find(parent[x]);
      }
    }

    boolean same(int x, int y) {
      return find(x) == find(y);
    }

    void union(int x, int y) {
      x = find(x);
      y = find(y);
      if (x == y) {
        return;
      } else {
        treeSize[find(y)] += treeSize[find(x)];
        parent[x] = y;
      }
    }

    int size(int x) {
      return treeSize[find(x)];
    }

  }
}

