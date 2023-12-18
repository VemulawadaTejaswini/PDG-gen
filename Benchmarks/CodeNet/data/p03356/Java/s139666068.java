import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        UnionFind uf = new UnionFind(n);
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            int num = in.nextInt() - 1;
            p[i] = num;
        }
        for (int i = 0; i < m; i++) {
            uf.unite(in.nextInt() - 1, in.nextInt() - 1);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(i == p[i] || uf.find(p[i]) == uf.find(i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

class UnionFind {
    int[] parent;
    int[] rank;

    public UnionFind(int size) {
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if(parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    public void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if(rank[x] < rank[y]) {
            parent[x] = y;
        }else {
            parent[y] = x;
            if(rank[x] == rank[y]) {
                rank[x] ++;
            }
        }
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }

    public void show() {
        for (int i = 0; i < parent.length; i++) {
            find(i);
        }
        System.out.println(Arrays.toString(parent));
    }
}