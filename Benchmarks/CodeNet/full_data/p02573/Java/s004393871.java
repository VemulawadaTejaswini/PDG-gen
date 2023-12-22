import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        var uf = new UnionFind(n+1);
        for(int i = 0; i < m; i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            uf.unite(a, b);
        }
        int ans = 0;
        for(int i = 1; i <= n; i++){
            ans = Math.max(uf.size[i], ans);
        }
        System.out.println(ans);
    }
    
    static class UnionFind {
        int[] parent, size;
        
        public UnionFind(int n) {
            parent = new int[n];
            size = new int[n];
            for(int i = 0; i < n; i++){
                parent[i] = i;
                size[i] = 1;
            }
        }
        int root(int x){
            if(parent[x] == x){
                return x;
            }else{
                return parent[x] = root(parent[x]);
            }
        }
        void unite(int x, int y){
            x = root(x);
            y = root(y);
            if(x == y) return;
            
            if(size[x] < size[y]){
                parent[x] = y;
                size[y] += size[x];
            }else{
                parent[y] = x;
                size[x] += size[y];
            }
        }
        boolean same(int x, int y){
            return root(x) == root(y);
        }
    }
}