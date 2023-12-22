import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        UnionFind uf = new UnionFind(n+1);
        for(int i = 0; i < m; i++){
            uf.unite(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
        var set = new HashSet<Integer>();
        for(int i = 1; i <= n; i++){
            set.add(uf.root(i));
        }
        System.out.println(set.size() -1);
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