import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] a = new int[m];
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      a[i] = scanner.nextInt() - 1;
      b[i] = scanner.nextInt() - 1;
    }
    scanner.close();

    long[] ans = new long[m];
    ans[m - 1] = (long) n * (n - 1) / 2;

    UnionFind uni = new UnionFind(n);

    for (int i = m - 1; i >= 1; i--) {
      ans[i - 1] = ans[i];

      if (uni.root(a[i]) != uni.root(b[i])) {
        ans[i - 1] -= (long) uni.size(a[i]) * uni.size(b[i]);
        uni.connect(a[i], b[i]);
      }
    }
    for (int i = 0; i < m; i++) {
      System.out.println(ans[i]);
    }
  }

  static class UnionFind {

    private int[] parent;

    public UnionFind(int n) {
      // 親の番号を格納する。
      // 自分自身が親だった場合は-(その集合のサイズ)を格納する。
      parent = new int[n];

      for (int i = 0; i < n; i++) {
        // 最初の時点では親は自分自身
        // 集合のサイズは１
        parent[i] = -1;
      }
    }

    // aがどのグループに属しているか調べる。
    public int root(int a) {
      if (parent[a] < 0) {
        return a;
      } else {
        // 再帰的に親をたどる。
        return parent[a] = root(parent[a]);
      }
    }

    // aの集合のサイズを返す
    public int size(int a) {
      return -parent[root(a)];
    }

    // aとbをつなぐ。
    // 大きい方(a)に小さい方(b)をつなぐ感じ。
    public boolean connect(int a, int b) {
      // 親同士をつなぐ。
      a = root(a);
      b = root(b);

      // すでにくっついている場合
      if (a == b) {
        return false;
      }

      if (size(a) < size(b)) {
        int r = a;
        a = b;
        b = r;
      }

      parent[a] += parent[b];
      parent[b] = a;

      return true;
    }
  }

}
