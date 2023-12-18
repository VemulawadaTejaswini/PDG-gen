import java.util.Scanner;

public class Main {

    static class UnionFind {
        // 親の番号.
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        // xが属する木の根を再帰で得る.
        private int root(int x) {
            if (parent[x] == x) {
                return x;
            }
            return parent[x] = root(parent[x]);
        }

        // 木を結合.
        private void unite(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            if (rx == ry) {
                return;
            }
            parent[rx] = ry;
        }

        // 2つの木が同じかどうか.
        private boolean same(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            return rx == ry;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        int[] x = new int[m];
        int[] y = new int[m];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < m; i++) {
            uf.unite(x[i] - 1, y[i] - 1);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (uf.same(i, p[i] - 1)) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
