import java.util.Scanner;

public class Main {

    static class UnionFind {
        int[] parent;
        int[] rank;
        int[] elmsize;

        UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];
            elmsize = new int[size];

            for(int i = 0; i < size; i++) makeSet(i);
        }

        void makeSet(int x) {
            parent[x] = x;
            rank[x] = 0;
            elmsize[x] = 1;
        }

        void unite(int x, int y) {
            int xRoot = root(x);
            int yRoot = root(y);

            if(rank[xRoot] > rank[yRoot]) {
                parent[yRoot] = xRoot;
                elmsize[xRoot] += elmsize[yRoot];
            } else if(rank[xRoot] < rank[yRoot]) {
                parent[xRoot] = yRoot;
                elmsize[yRoot] += elmsize[xRoot];
            } else if(xRoot != yRoot) {
                parent[yRoot] = xRoot;
                rank[xRoot]++;
                elmsize[xRoot] += elmsize[yRoot];
            }
        }

        int root(int x) {
            if(x != parent[x]) {
                parent[x] = root(parent[x]);
            }
            return parent[x];
        }

        boolean same(int x, int y) {
            return root(x) == root(y);
        }

        int size(int x) {
            return elmsize[root(x)];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt(); int k = sc.nextInt();
        UnionFind uf = new UnionFind(n);
        int[] deg = new int[n];
        for(int i = 0; i < m; i++) {
            int a, b;
            a = Integer.parseInt(sc.next()); b = Integer.parseInt(sc.next());
            --a; --b;
            deg[a]++; deg[b]++;
            uf.unite(a, b);
        }
        int[][] to = new int[k][2];
        for(int i = 0; i < k; i++) {
            to[i][0] = Integer.parseInt(sc.next()) -1;
            to[i][1] = Integer.parseInt(sc.next()) -1;
        }
        int[] ans = new int[n];
        for(int i = 0; i < n ; i++) {
            ans[i] = uf.size(i) - 1 - deg[i];
        }
        for(int i = 0; i < k; i++) {
            if(uf.same(to[i][0], to[i][1])) {
                ans[to[i][0]]--;
                ans[to[i][1]]--;
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.printf("%d%c", ans[i], i==n-1?'\n':' ');
        }
    }
}