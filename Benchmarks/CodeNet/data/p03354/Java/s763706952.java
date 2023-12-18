import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[N + 1];
        for (int i = 1; i <= N; i++) p[i] = sc.nextInt();
        int[] x = new int[M];
        int[] y = new int[M];
        for (int i = 0; i < M; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < M; i++) {
            uf.union(x[i], y[i]);
        }
        int cnt = 0;
        for (int j = 1; j <= N; j++) {
            if (j == p[j]) {
                cnt++;
                continue;
            }
            if (uf.isConnected(j, p[j])) cnt++;
        }
        System.out.println(cnt);
    }

    static class UnionFind {
        int n;
        int[] id;
        int[] sz;

        public UnionFind(int n_) {
            n = n_;
            id = new int[n + 1];
            sz = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                id[i] = i;
                sz[i] = 1;
            }
        }

        private int find(int p) {
            if (id[p] == p) return id[p];
            while (id[p] != p) {
                id[p] = id[id[p]];
                p = id[p];
            }
            return p;
        }

        public boolean isConnected(int p, int q) {
            return find(p) == find(q);
        }

        public void union(int p, int q) {
            int i = find(p);
            int j = find(q);
            if (i == j) return;
            if (sz[i] < sz[j]) {
                sz[j] += sz[i];
                id[i] = j;
            } else {
                sz[i] += sz[j];
                id[j] = i;
            }
        }
    }
}
