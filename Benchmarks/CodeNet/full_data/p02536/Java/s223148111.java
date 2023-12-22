import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
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
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(uf.parent(i));
        }
        System.out.println(set.size() - 1); 
    }
    class UnionFind {
        int[] parent;
        int[] size;
        UnionFind(int N) {
            int[] parent = new int[N]; 
            int[] size = new int[N];
            Arrays.fill(size, 1);
            for (int i = 0; i < N; i++) {
                parent[i] = i;
            }
            this.size = size;
            this.parent = parent;
        }
        int parent(int x) {
            if (this.parent[x] == x) {
                return x;
            }
            return this.parent[x] = this.parent(this.parent[x]);
        }
        void unite(int x, int y) {
            int px = this.parent(x);
            int py = this.parent(y);
            if (px == py) {
                return;
            }
            int sx = this.size[px];
            int sy = this.size[py];
            if (sx < sy) {
                this.size[py] += this.size[px];
                this.size[px] = 0;
                this.parent[px] = py;
                return;
            }
            this.size[px] += this.size[py];
            this.size[py] = 0;
            this.parent[py] = px;
        }
    }
}
