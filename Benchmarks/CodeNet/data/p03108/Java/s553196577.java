
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[M];
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        // UnionFindTreeを使うため、橋を増やしていくことを考える
        UnionFindTree tree = new UnionFindTree(N+1);
        long[] ans = new long[M];
        ans[M-1] = (long)N*(N-1)/2;
        for(int m = M-1; m >= 1; m--){
            if(!tree.same(A[m], B[m])) {
                ans[m-1] = ans[m] - (long)tree.size(A[m]) * tree.size(B[m]);
                tree.union(A[m], B[m]);
            }
        }

        for(int i = 0; i < M; i++) {
            out.println(ans[i]);
        }
    }
}

// https://gist.github.com/keitin/e5ba4ba4ccd6cd3afb3485c5ea85846c#file-union-find-java
class UnionFindTree {
    int[] parent; //インデックスとノードを対応させ、そのルートノードのインデックスを格納
    int[] size;   //インデックスとノードを対応させ、同じグループに属する頂点数を格納
    int[] rank;   //parentと同様に、木の高さを格納

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
        } else if(rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
            size[yRoot] = size[xRoot] + size[yRoot];
        } else if (xRoot != yRoot){
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
    public int size(int i){
        if(i != parent[i]){
            size[i] = size(find(i));
        }
        return size[i];
    }

    //同じ木に属しているか
    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}
