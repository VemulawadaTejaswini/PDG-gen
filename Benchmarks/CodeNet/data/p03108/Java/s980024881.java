import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[][] edges = new int[M][2];
    for (int i = 0; i < M; i++) {
      edges[i][0] = scanner.nextInt() - 1;
      edges[i][1] = scanner.nextInt() - 1;
    }
    UnionFind uf = new UnionFind(N);
    long[] count = new long[M + 1];
    count[M] = (long) N * (N - 1) / 2;
    for (int i = M - 1; i >= 0; i--) {
      int a = edges[i][0];
      int b = edges[i][1];
      count[i] = count[i + 1];
      if (uf.find(a) != uf.find(b)) {
        count[i] -= (long) uf.size(uf.find(a)) * uf.size(uf.find(b));
        uf.union(a, b);
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= M; i++) sb.append(count[i]).append('\n');
    System.out.print(sb.toString());
  }

  static class UnionFind {
    private final int[] table;
    private final int[] ranks;
    private final int[] sizes;

    public UnionFind(int size) {
      this.table = new int[size];
      this.ranks = new int[size];
      this.sizes = new int[size];
      for (int i = 0; i < size; i++) {
        table[i] = i;
        sizes[i] = 1;
      }
    }

    public int find(int x) {
      if (table[x] != x) {
        table[x] = find(table[x]);
      }
      return table[x];
    }

    public int size(int x) {
      return sizes[x];
    }

    public void union(int x, int y) {
      int xRoot = find(x);
      int yRoot = find(y);
      if (xRoot == yRoot) return;

      if (ranks[xRoot] < ranks[yRoot]) {
        int tmp = xRoot;
        xRoot = yRoot;
        yRoot = tmp;
      }

      table[yRoot] = xRoot;
      sizes[xRoot] += sizes[yRoot];
      if (ranks[xRoot] == ranks[yRoot]) ranks[xRoot]++;
    }
  }
}
