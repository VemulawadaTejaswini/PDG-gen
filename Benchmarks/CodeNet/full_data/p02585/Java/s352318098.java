import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] P = new int[N];
        long[] C = new long[N];
        for (int i = 0; i < N; i++) {
            P[i] = scan.nextInt()-1;
        }
        long max = Long.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            C[i] = scan.nextInt();
            max = Math.max(max, C[i]);
        }
        if (max < 0) {
            System.out.println(max);
            return;
        }
        UnionFind uf = new UnionFind(N, C);
        for (int i = 0; i < N; i++) {
            uf.unite(i, P[i]);
        }
        long ans = Long.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            long size = uf.size(i);
            long group_sum = uf.cost(i);
            int current = i;
            long sum = 0;
            for (int j = 0; j < Math.min(K, size); j++) {
                sum += C[current];
                current = P[current];
                ans = Math.max(ans, sum);
            }
            if (group_sum < 0) {
                continue;
            }
            long remain = K - (K / size) * size;
            current = i;
            sum = group_sum * (K / size);
            for (int j = 0; j < remain; j++) {
                sum += C[current];
                current = P[current];
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
    }
    class UnionFind {
        int n = 0;
        int[] parent;
        int[] count;
        long[] sum;
        long[] cost;
        UnionFind(int n, long[] cost) {
            this.n = n;
            int[] parent = new int[n];
            int[] count = new int[n];
            long[] sum = new long[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                count[i] = 1;
            }
            this.parent = parent;
            this.count = count;
            this.cost = cost;
            for (int i = 0; i < n; i++) {
                sum[i] = cost[i];
            }
            this.sum = sum;
        }
        int parent(int i) {
            if (this.parent[i] == i) {
                return i;
            }
            return this.parent[i] = this.parent(this.parent[i]);
        }
        boolean same(int i, int j) {
            return this.parent(i) == this.parent(j);
        }
        int size(int x) {
            int parent_x = this.parent(x);
            return this.count[parent_x];
        }
        long cost(int x) {
            int parent_x = this.parent(x);
            return this.sum[parent_x];
        }
        void unite(int x, int y) {
            int parent_x = this.parent(x);
            int parent_y = this.parent(y);
            if (parent_x == parent_y) {
                return;
            }
            int size_x = this.count[parent_x];
            int size_y = this.count[parent_y];
            if (size_x < size_y) {
                this.count[parent_y] += this.count[parent_x];
                this.sum[parent_y] += this.sum[parent_x];
                this.count[parent_x] = -1;
                this.sum[parent_x] = -1;
                this.parent[parent_x] = parent_y;
                return;
            }
            this.count[parent_x] += this.count[parent_y];
            this.sum[parent_x] += this.sum[parent_y];
            this.count[parent_y] = -1;
            this.sum[parent_y] = -1;
            this.parent[parent_y] = parent_x;
        }
    }
}
