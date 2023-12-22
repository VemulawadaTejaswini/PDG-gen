import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < M; i++) {
            int A = scan.nextInt()-1;
            int B = scan.nextInt()-1;
            uf.unite(A, B);
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int size = uf.size(i);
            ans = Math.max(ans, size);
        }
        System.out.println(ans);
    }
    class UnionFind {
        int[] parent;
        int[] size;
        UnionFind(int N) {
            int[] parent = new int[N];
            for (int i = 0; i < N; i++) {
                parent[i] = i;
            }
            this.parent = parent;
            int[] size = new int[N];
            Arrays.fill(size, 1);
            this.size = size;
        }
        int parent(int x) {
            if (this.parent[x] == x) {
                return x;
            }
            return this.parent[x] = this.parent(this.parent[x]);
        }
        int size(int x) {
            int p_x = this.parent(x);
            return this.size[p_x];
        }
        void unite(int x, int y) {
            int p_x = this.parent(x);
            int p_y = this.parent(y);
            if (p_x == p_y) {
                return;
            }
            if (this.size[p_x] < this.size[p_y]) {
                this.size[p_y] += this.size[p_x];
                this.size[p_x] = -1;
                this.parent[p_x] = p_y;
                return;
            }
            this.size[p_x] += this.size[p_y];
            this.size[p_y] = -1;
            this.parent[p_y] = p_x;
        }
    }
}
