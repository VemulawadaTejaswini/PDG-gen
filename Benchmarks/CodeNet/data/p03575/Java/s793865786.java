import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        int[][] edges = new int[M][2];
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            edges[i][0] = a;
            edges[i][1] = b;
        }
        int answer = 0;
        for (int i = 0; i < M; i++) {
            UnionFind uf = new UnionFind(N);
            for (int j = 0; j < M; j++) {
                if (i == j) {
                    continue;
                }
                uf.unite(edges[j][0],edges[j][1]);
            }
            if (uf.size(0) < N) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
    class UnionFind {
        private int[] parent;
        private int[] size;
        public UnionFind(int n) {
            int[] parent = new int[n];
            int[] size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
            for (int i = 0; i < n; i++) {
                size[i] = 1;
            }
            this.parent = parent;
            this.size = size;
        }
        public int find(int x) {
            if (this.parent[x] == x) {
                return x;
            }
            return this.parent[x] = find(this.parent[x]);
        }
        public boolean same(int x, int y) {
            return this.find(x) == this.find(y);
        }
        public int size(int x) {
            x = this.find(x);
            return this.size[x];
        }
        public void unite(int x, int y) {
            if (same(x, y)) {
                return;
            }
            x = this.find(x);
            y = this.find(y);
            if (this.size[x] < this.size[y]) {
                this.parent[x] = y;
                this.size[y] += this.size[x];
                this.size[x] = -1;
            } else {
                this.parent[y] = x;
                this.size[x] += this.size[y];
                this.size[y] = -1;
            }
        }
    }
}
