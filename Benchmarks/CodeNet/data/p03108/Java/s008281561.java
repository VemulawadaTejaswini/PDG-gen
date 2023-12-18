import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        
        for(int i = 0; i < M; i++){
            A[i] = sc.nextInt() - 1;
            B[i] = sc.nextInt() - 1;
        }
        
        long[] ans = new long[M];
        UnionFind uf = new UnionFind(N);
        for(int i = M-1; i >= 0; i--){
            int sizeA = uf.size(A[i]);
            int sizeB = uf.size(B[i]);
            
            if( !uf.isSame(A[i], B[i]) ){
                ans[i] = (long) sizeA * sizeB;
                uf.unite(A[i], B[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            sb.append(ans[i]).append("\r\n");
            if(i != M-1) ans[i+1] += ans[i];
        }
        
        System.out.println(sb.toString());
        
    }
    
    static class UnionFind{
        int[] parent;
        int[] size;
        int N;
        
        public UnionFind(int N){
            parent = new int[N];
            size = new int[N];
            this.N = N;
            for(int i = 0; i < N; i++){
                parent[i] = i;
                size[i] = 1;
            }
        }
        
        public int size(int x){
            return size[root(x)];
        }
        
        public void unite(int x, int y){
            if( isSame(x, y) ) return;
            size[root(y)] += size[root(x)];            
            parent[root(x)] = root(y);
        }
        
        public int root(int x){
            if( parent[x] == x ) return x;
            return parent[x] = root(parent[x]);
        }
        
        public boolean isSame(int x, int y){
            return root(x) == root(y);
        }
    }

}
