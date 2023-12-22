import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {
    
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CConnectCities solver = new CConnectCities();
        solver.solve(1, in, out);
        out.close();
    }
    
    static class CConnectCities {
        
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int ans = 0;
            UnionFind uf = new UnionFind(n);
            for (int i = 0; i < m; i++) {
                int a = Integer.parseInt(in.next()) - 1;
                int b = Integer.parseInt(in.next()) - 1;
                uf.unite(a, b);
            }
//        debug(uf);
            for (int i = 1; i < n; i++) {
                if (!uf.same(0, i)) {
                    ans++;
                }
            }
            // 出力
            out.println(ans);
            
            
        }
        
        public class UnionFind {
            
            private int[] parent;
            private int[] rank;
            private int[] elmsize;
            
            UnionFind(int size) {
                parent = new int[size];
                rank = new int[size];
                elmsize = new int[size];
                
                for (int i = 0; i < size; i++) {
                    makeSet(i);
                }
            }
            
            void makeSet(int x) {
                parent[x] = x;
                rank[x] = 0;
                elmsize[x] = 1;
            }
            
            public void unite(int x, int y) {
                int xRoot = root(x);
                int yRoot = root(y);
                
                if (rank[xRoot] > rank[yRoot]) {
                    parent[yRoot] = xRoot;        //x の木に結合
                    elmsize[xRoot] += elmsize[yRoot];
                } else if (rank[xRoot] < rank[yRoot]) {
                    parent[xRoot] = yRoot;        //y の木に結合
                    elmsize[yRoot] += elmsize[xRoot];
                } else if (xRoot != yRoot) {        //同じ高さで根が違うとき
                    parent[yRoot] = xRoot;        //x の木に結合
                    rank[xRoot]++;                //x の木の高さを加算
                    elmsize[xRoot] += elmsize[yRoot];
                }
            }
            
            public int root(int x) {
                if (x != parent[x]) {    
                    parent[x] = root(parent[x]);
                }
                return parent[x];
            }
            
            public boolean same(int x, int y) {
                return root(x) == root(y);
            }
            
        }
        
    }
}

