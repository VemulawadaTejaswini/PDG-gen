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
    DPeopleonaLine solver = new DPeopleonaLine();
    solver.solve(1, in, out);
    out.close();
  }

  static class DPeopleonaLine {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      boolean f = true;
      int n = in.nextInt();
      int m = in.nextInt();
      PotentialUnionFind puf = new PotentialUnionFind();
      puf.init(n);
      for (int i = 0; i < m; i++) {
        int l = in.nextInt() - 1;
        int r = in.nextInt() - 1;
        long dis = in.nextLong();
        if (puf.find(l, r)) {
          // out.println(i + ": find true");
          // out.println("dif(l, r):" + puf.dif(l, r));
          if (puf.dif(l, r) != dis) {
            f = false;
          }
        } else {
          // out.println(i + ": find false");
          puf.union(l, r, dis);
        }
        // out.println(f);
      /*
      for (int j = 0; j < n; j++) {
        out.println(j + "th weight: " + puf.potential(j));
      }
      */
      }

      out.println(f ? "Yes" : "No");
    }

  }

  static class UnionFind {

    int[] par;
    int[] rank;

    int root(int x) {
      if (par[x] == x) {
        return x;
      } else {
        par[x] = root(par[x]); // 経路を圧縮しておく.
        return par[x];
      }
    }

    boolean find(int x, int y) {
      return root(x) == root(y);
    }

  }

  static class PotentialUnionFind extends UnionFind {

    long[] pot;

    void init(int n) {
      par = new int[n];
      rank = new int[n];
      pot = new long[n];
      for (int i = 0; i < n; i++) {
        par[i] = i; // はじめは全員が根である
        rank[i] = 0;
        pot[i] = 0;
      }
    }

    int root(int x) {
      if (par[x] == x) {
        return x;
      } else {
        int r = root(par[x]);
        pot[x] += pot[par[x]];
        par[x] = r;
        return par[x];
      }
    }

    void union(int x, int y, long w) {
      w = w + potential(x) - potential(y);
      int rx = root(x);
      int ry = root(y);
      if (rx == ry) {
        return;
      }
      if (rank[rx] < rank[ry]) {
        int tmp = rx;
        rx = ry;
        ry = tmp;
        w = -w;
      }
      if (rank[rx] == rank[ry]) {
        rank[rx]++;
      }
      par[ry] = rx;
      pot[ry] = w;
    }

    long potential(int x) {
      root(x);
      return pot[x];
    }

    long dif(int x, int y) {
      return potential(y) - potential(x);
    }

  }
}

