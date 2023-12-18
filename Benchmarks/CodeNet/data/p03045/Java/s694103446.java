import java.util.Scanner;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        UnionFind uf = new UnionFind(n);

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            int z = sc.nextInt();

            uf.union(x, y);

            // System.out.println(uf.get_tree(n));
        }

        System.out.println(uf.get_tree(n));

        sc.close();
    }
}

class UnionFind {

    int[] parent;
    int[] rank;

    public UnionFind(int size) {
        this.parent = new int[size];
        this.rank = new int[size];

        for (int i = 0; i < size; i++) {
            makeSet(i);
        }
    }

    public void makeSet(int i) {
        parent[i] = i;
        rank[i] = 0;
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot;
        } else if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (xRoot != yRoot) {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }

    public int find(int i) {
        if (i != parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }

    int get_tree(int size) {
        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i < size; i++) {
            st.add(find(i));
        }
        return st.size();
    }

}