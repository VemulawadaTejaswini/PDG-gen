import java.util.*;

import static java.lang.System.*;

// https://atcoder.jp/contests/abc097/tasks/arc097_b
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] p = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            p[i] = sc.nextInt();
        }

        UnionFindTree tree = new UnionFindTree(N + 1);

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            tree.union(x, y);
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (i == p[i] || tree.same(p[i], i)) {
                cnt++;
            }
        }

        out.println(cnt);
    }
}

// https://gist.github.com/keitin/e5ba4ba4ccd6cd3afb3485c5ea85846c#file-union-find-java
class UnionFindTree {
    int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納
    int[] size;   //インデックスとノードを対応させ、そのルートノードと同じグループに属する頂点数を格納
    int[] rank; //parentと同様に、木の高さを格納

    public UnionFindTree(int size) {
        this.parent = new int[size];
        this.size = new int[size];
        this.rank = new int[size];

        for (int i = 0; i < size; i++) {
            makeSet(i);
        }
    }

    public void makeSet(int i) {
        parent[i] = i;
        size[i] = 1;
        rank[i] = 0; //集合の高さ
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        //xが属する木の方が大きい場合
        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot; //yの親をxに更新
            size[xRoot] = size[xRoot] + size[yRoot];
        } else if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
            size[yRoot] = size[xRoot] + size[yRoot];
        } else if (xRoot != yRoot) {
            parent[yRoot] = xRoot;
            rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
            size[xRoot] = size[xRoot] + size[yRoot];
        }
    }

    //引数の属する木のルートのidを返す
    public int find(int i) {
        if (i != parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    //引数の属する木のサイズを返す
    public int size(int i) {
        if (i != parent[i]) {
            size[i] = size(find(i));
        }
        return size[i];
    }

    //同じ木に属しているか
    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}