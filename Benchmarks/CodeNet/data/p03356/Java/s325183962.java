import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        
        UnionFind uf = new UnionFind(n + 1);
        int[] p = new int[n + 1];
        int x, y;

        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            uf.unite(p[x], p[y]);
        }

        for (int i = 1; i <= n; i++) {
            if (uf.same(i, p[i])) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}

class UnionFind {
    private int[] tree;

    public UnionFind(int size) {
        tree = new int[size];

        for (int i = 0; i < size; i++) {
            tree[i] = -1;
        }
    }

    public void unite(int x, int y) {
        x = root(x);
        y = root(y);

        if (x == y) {
            return;
        }
        else {
            tree[x] += tree[y];
            tree[y] = x;

            return;
        }
    }

    public int root(int node) {
        if (tree[node] < 0) {
            return node;
        }
        else {
            return tree[node] = root(tree[node]);
        }
    }

    public boolean same(int x, int y) {
        return root(x) == root(y);
    }

    public int size(int node) {
        return -1 * root(node);
    }
}
