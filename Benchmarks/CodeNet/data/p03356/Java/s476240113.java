import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] p = new int[n+1];
        for(int i = 1; i <= n; i++){
            p[i] = Integer.parseInt(sc.next());
        }
        
        UnionFind uf = new UnionFind(n+1);
        int x, y;
        for(int i = 0; i < m; i++){
            x = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());
            uf.unite(x, y);
        }
        
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(uf.same(i, p[i])){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
    
    static class UnionFind {
        int[] parent;
        int[] rank;
        
        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for(int i = 0; i < n; i++){
                parent[i] = i;
            }
        }
        private int root(int x){
            if(parent[x] == x){
                return x;
            }else{
                return parent[x] = root(parent[x]);
            }
        }
        private void unite(int x, int y){
            x = root(x);
            y = root(y);
            if(x == y) return;

            if(rank[x] < rank[y]){
                parent[x] = y;
            }else{
                parent[y] = x;
                if(rank[x] == rank[y]){
                    rank[x]++;
                }
            }
        }
        private boolean same(int x, int y){
            return root(x) == root(y);
        }
    }
}