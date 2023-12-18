import java.util.Scanner;

class Main {
    public static class UnionFind {

        private int[] parent;

        public UnionFind(int n) {
            // 親の番号を格納する。
            // 自分自身が親だった場合は-(その集合のサイズ)を格納する。
            this.parent = new int[n];

            for (int i = 0; i < n; i++) {
                // 最初の時点では親は自分自身
                // 集合のサイズは１
                this.parent[i] = -1;
            }
        }

        // aがどのグループに属しているか調べる。
        public int root(int a) {
            if (this.parent[a] < 0) {
                return a;
            } else {
                // 再帰的に親をたどる。
                return this.parent[a] = this.root(this.parent[a]);
            }
        }

        // aの集合のサイズを返す
        public int size(int a) {
            return -this.parent[this.root(a)];
        }

        // aとbをつなぐ。
        // 大きい方(a)に小さい方(b)をつなぐ感じ。
        public boolean connect(int a, int b) {
            // 親同士をつなぐ。
            a = this.root(a);
            b = this.root(b);

            // すでにくっついている場合
            if (a == b) {
                return false;
            }

            if (this.size(a) < this.size(b)) {
                int r = a;
                a = b;
                b = r;
            }

            this.parent[a] += this.parent[b];
            this.parent[b] = a;

            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] X = new int[M];
        int[] Y = new int[M];
        int[] Z = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = scanner.nextInt() - 1;
            Y[i] = scanner.nextInt() - 1;
            Z[i] = scanner.nextInt() - 1;
        }
        UnionFind find = new UnionFind(N);
        for (int i = 0; i < M; i++) {
            find.connect(X[i], Y[i]);
        }
        boolean[] ans = new boolean[N];
        for (int i = 0; i < N; i++) {
            ans[find.root(i)] = true;
        }
        int cnt = 0;
        for (boolean b : ans) {
            if (b) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
