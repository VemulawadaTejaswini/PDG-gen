
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int n = sc.nextInt();
        int m = sc.nextInt();
        UnionFindTree uf = new UnionFindTree(n);
//        debug(uf.parent);
        for (int i = 0; i < m; i++) {
            uf.union(sc.nextInt() - 1, sc.nextInt() - 1);
        }

//        debug(uf.parent);
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            int p = uf.find(uf.parent[i]);
            size[p]++;
        }
//        debug(size);
        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, size[i]);
        }

        System.out.println(max);

        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}


class UnionFindTree {

    int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納
    int[] rank; //parentと同様に、木の高さを格納

    public UnionFindTree(int size) {
        this.parent = new int[size];
        this.rank = new int[size];

        for (int i = 0; i < size; i++) {
            makeSet(i);
        }
    }

    public void makeSet(int i) {
        parent[i] = i;
        rank[i] = 0; //集合の高さ
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        //xが属する木の方が大きい場合
        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot; //yの親をxに更新

        } else if(rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;

        } else if (xRoot != yRoot){
            parent[yRoot] = xRoot;
            rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
        }
    }

    //引数の属する木のルートのidを返す
    public int find(int i) {
        if (i != parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    //同じ木に属しているか
    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}
