import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        int k = Integer.parseInt(scanner.next());
        UnionFind uf = new UnionFind(n);
        int[] fb = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(scanner.next());
            int b = Integer.parseInt(scanner.next());
            fb[a] += 1;
            fb[b] += 1;
            uf.unite(a, b);
        }
        for (int i = 0; i < k; i++) {
            int c = Integer.parseInt(scanner.next());
            int d = Integer.parseInt(scanner.next());
            if (uf.same(c, d)) {
                fb[c] += 1;
                fb[d] += 1;
            }
        }
        for (int i = 1; i < n+1; i++) {
            System.out.print(uf.size(i)-1-fb[i]);
            System.out.print(" ");
        }
    }
}

class UnionFind {
    int[] data = new int[1000000];
    UnionFind(int n) {
        for (int i = 0; i < n+1; i++) {
            this.data[i] = -1;
        }
    }
    public int root(int x) {
        if (this.data[x] < 0) {
            return x;
        }
        this.data[x] = root(this.data[x]);
        return this.data[x];
    }
    public void unite(int x, int y) {
        x = root(x);
        y = root(y);
        if (x != y) {
            if (this.data[x] < this.data[y]) {
                this.data[x] += this.data[y];
                this.data[y] = x;
            } else {
                this.data[y] += this.data[x];
                this.data[x] = y;
            }
        }
    }
    public boolean same(int x, int y) {
        return root(x) == root(y);
    }
    public int size(int x) {
        return -this.data[root(x)];
    }
}
