import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        int[] friend = new int[n+1];
        UnionFind uf = new UnionFind(n+1);
        for(int i = 0; i < m; i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            friend[a]++;
            friend[b]++;
            uf.unite(a, b);
        }
        int[] block = new int[n+1];
        for(int i = 0; i < k; i++){
            int c = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            if(uf.same(c, d)){
                block[c]++;
                block[d]++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            sb.append(uf.size[uf.root(i)] - 1 - friend[i] - block[i]).append(" ");
        }
        System.out.println(sb);
    }
    
    static class UnionFind {
        int[] parent;
        int[] size;

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