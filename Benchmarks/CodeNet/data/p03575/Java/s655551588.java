import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0 ; i < m ; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }

        int count = 0;
        for (int i = 0 ; i < m ; i++) {
            UnionFindTree uf = new UnionFindTree(n);
            for (int j = 0 ; j < m ; j++) {
                if (i != j) {
                    uf.union(a[j], b[j]);
                }
            }
            if (!uf.same(a[i], b[i])) count++;
        }

        System.out.println(count);

    }

}

class UnionFindTree {
    int[] parent;
    int[] rank;

    public UnionFindTree(int size) {
        this.parent = new int[size];
        this.rank = new int[size];

        for (int i = 0 ; i < size ; i++) {
            makeSet(i);
        }
    }
    /*
     * UnionFindを初期化
     * はじめはすべての頂点が根
     * はじめはすべての高さは1
     */
    public void makeSet(int i) {
        parent[i] = i;
        rank[i] = 0;
    }

    /*
     * 引数の属する木のルートのIDを返す
     */
    public int find(int i) {
        if (i != parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    /*
     * 引数を同じ集合に追加する。
     * その際に木構造もいい感じにいじくる。
     */
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

    /*
     * 同じ木に属しているか
     */
    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}