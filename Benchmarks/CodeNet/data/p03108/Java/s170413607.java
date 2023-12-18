package main.java.tasks;

import FastIO.FastScanner;
import java.io.PrintWriter;

public class DDecayedBridges {
    public void solve(int testNumber, FastScanner in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = in.nextInt()-1;
            B[i] = in.nextInt()-1;
        }
        long[] inconvs = new long[M];
        long inc = (long) N*(N-1)/2;
        UnionFindTree uf = new UnionFindTree(N);
        for (int i = M-1; i >= 0; i--) {
            inconvs[i] = inc;
            if (!uf.same(A[i], B[i])) {
                inc -= uf.size(A[i]) * uf.size(B[i]);
                uf.unite(A[i], B[i]);
            }
        }

        for (int i = 0; i < M; i++) {
            out.println(inconvs[i]);
        }
    }
    class UnionFindTree {

        int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納
        int[] rank; //parentと同様に、木の高さを格納
        int[] size; //木の要素の数を格納。最新はparentのindexに
        int group;


        public UnionFindTree(int n) {
            this.parent = new int[n];
            this.rank = new int[n];
            this.size = new int[n];
            group = n;

            for (int i = 0; i < n; i++) {
                makeSet(i);
            }
        }

        public void makeSet(int i) {
            parent[i] = i;
            rank[i] = 0; //集合の高さ
            size[i] = 1;
        }

        public void unite(int x, int y) {
            int xRoot = find(x);
            int yRoot = find(y);
            if (xRoot == yRoot) return;
            group--;
            //xが属する木の方が大きい場合
            if (rank[xRoot] > rank[yRoot]) {
                parent[yRoot] = xRoot; //yの親をxに更新
                size[xRoot] += size[yRoot];

            } else if(rank[xRoot] < rank[yRoot]) {
                parent[xRoot] = yRoot;
                size[yRoot] += size[xRoot];
            } else {
                parent[yRoot] = xRoot;
                rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
                size[xRoot] += size[yRoot];
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

        public int size(int i) {
            return size[find(i)];
        }
    }
}
