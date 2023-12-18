import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();

    UnionFind uf = new UnionFind(N);

    for (int i = 0; i < M; i++) {
      int left = scanner.nextInt() - 1;
      int right = scanner.nextInt() - 1;
      int dist = scanner.nextInt();

      Result lr = uf.find(left);
      Result rr = uf.find(right);

      if (lr.root == rr.root) {
        if (rr.dist - lr.dist != dist) {
          System.out.println("No");
          return;
        }
      } else {
        uf.union(left, right, dist);
      }
    }

    System.out.println("Yes");
  }

  static class UnionFind {
    private final int[] table;
    private final int[] delta;
    private final int[] ranks;

    UnionFind(int size) {
      this.table = new int[size];
      this.delta = new int[size];
      this.ranks = new int[size];
      for (int i = 0; i < size; i++) {
        table[i] = i;
      }
    }

    Result find(int x) {
      if (table[x] != x) {
        Result parentRes = find(table[x]);
        return new Result(parentRes.root, parentRes.dist + delta[x]);
      }
      return new Result(x, 0);
    }

    void union(int x, int y, int dist) {
      Result xRoot = find(x);
      Result yRoot = find(y);
      if (xRoot.root == yRoot.root) return;

      if (ranks[xRoot.root] < ranks[yRoot.root]) {
        Result tmp = xRoot;
        xRoot = yRoot;
        yRoot = tmp;
        dist = -dist;
      }

      table[yRoot.root] = xRoot.root;
      delta[yRoot.root] = xRoot.dist + dist - yRoot.dist;
      if (ranks[xRoot.root] == ranks[yRoot.root]) ranks[xRoot.root]++;
    }
  }

  static class Result {
    public final int root;
    public final int dist;

    Result(int root, int dist) {
      this.root = root;
      this.dist = dist;
    }
  }
}
