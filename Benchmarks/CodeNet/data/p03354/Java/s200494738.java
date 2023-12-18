import java.util.Scanner;
import java.util.Arrays;

class Main {
    static final Scanner sc = new Scanner(System.in);
    static int n, m;
    static int[] p = new int[100005];
    static int x, y;
    
    static int ans = 0;
    
    static UnionFind uf = new UnionFind(100005);
    
    public static void main(String[] args) {
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 1; i <= n; ++i) {
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < m; ++i) {
            x = sc.nextInt();
            y = sc.nextInt();

            uf.unite(p[x], p[y]);
        }

        for (int i = 1; i <= n; i++) {
            if (uf.isSameGroup(p[i], i)) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}

/**
 * @author ei1710
 * @version 1.05
 */


/**
 * 素集合データ構造.<br>
 * 各操作O(a(n))程度(a() はアッカーマン関数の逆関数)
 */
class UnionFind {

    /**
     * 添字の示すノードの親.<br>
     * 親がない = 自身が根のとき、-1 * (集合の大きさ)をもつ
     */
    int[] parent;

    /**
     * 木の大きさ.<br>
     * あまり速くならなかった<br>
     * 計算量は O(log n) から O(a(n))くらいまで落ちるはずなのに
     */
    int[] rank;

    /** nmemb個の要素からなる UnionFind */
    public UnionFind(int nmemb) {
        parent = new int[nmemb];
        rank = new int[nmemb];
        
        Arrays.fill(parent, -1);
        Arrays.fill(rank, 0);
    }

    /**
     * 根を求める
     * @param x 根を求めるノードの番号
     */
    protected int root(int x) {
        if (parent[x] < 0) {
            return x;
        }
        
        parent[x] = root(parent[x]);
        return parent[x];
    }

    /** ノードx, yが同じ集合であるかを確かめる */
    public boolean isSameGroup(int x, int y) {
        return root(x) == root(y);
    }

    /**
     * ノードx, y を併合.
     * x, yがすでに同じ集合にあるときは何もしない
     */
    public void unite(int x, int y) {

        x = root(x);
        y = root(y);

        if (x == y) {
            return;
        }

        //小さい木を大きい方へマージ(木の高さを抑えられるので)
        if (rank[x] > rank[y]) {
            parent[x] += parent[y];
            parent[y] = x;
        }
        else {
            parent[y] += parent[x];
            parent[x] = y;

            if (rank[x] == rank[y]) {
                rank[y]++;
            }
        }
        
        return;
    }

    /** グループの大きさ(=要素数)を調べる */
    public int groupSize(int x) {
        return -1 * parent[root(x)];
    }
}
