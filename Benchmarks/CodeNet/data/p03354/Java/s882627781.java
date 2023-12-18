import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    int p[] = new int[N];

    for (int i = 0; i < N; i++) {
      p[i] = Integer.parseInt(sc.next()) - 1;
    }

    UnionFind uf = new UnionFind(N);
    for (int i = 0; i < M; i++) {
      uf.union(Integer.parseInt(sc.next()) - 1, Integer.parseInt(sc.next()) - 1);
    }
    int ans = 0;
    for (int i = 0; i < N; i++) {
      if (uf.same(i, p[i])) {
        ans++;
      }
    }

    System.out.println(ans);
  }

  static class UnionFind {
    public int parent[];
    public int rank[];

    public UnionFind(int size) {
      parent = new int[size];
      rank = new int[size];
      for (int i = 0; i < size; i++) {
        parent[i] = i;
        rank[i] = 0;
      }
    }

    public int find(int i) {
      if (i != parent[i]) {
        parent[i] = find(parent[i]);
      }
      return parent[i];
    }

    public void union(int x, int y) {
      int xRoot = find(x);
      int yRoot = find(y);
      if (rank[xRoot] > rank[yRoot]) {
        parent[yRoot] = xRoot;
      } else if (rank[yRoot] > rank[xRoot]) {
        parent[xRoot] = yRoot;
      } else if (xRoot != yRoot) {
        parent[yRoot] = xRoot;
        rank[xRoot]++;
      }
    }

    public boolean same(int x, int y) {
      return find(x) == find(y);
    }
  }
}