import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[N + 1];
        int[] x = new int[M];
        int[] y = new int[M];

        for(int i=1; i<=N; i++){
            p[i] = sc.nextInt();
        }

        for(int i=0; i<M; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        sc.close();
        UnionFind uf = new UnionFind(N + 1);
        for(int i=0; i<M; i++){
            uf.union(x[i], y[i]);
        }
        int ans = 0;
        for(int i=1; i<=N; i++){
            if(uf.same(i, p[i])){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}

class UnionFind{
    int[] par;
    int[] rank;

    public UnionFind(int N){
        par = new int[N];
        rank = new int[N];
        for(int i=1; i<N; i++){
            par[i] = i;
            rank[i] = 0;
        }
    }

    public void union(int x, int y){
        int xroot = find(x);
        int yroot = find(y);
        if(rank[xroot]>rank[yroot]){
            par[yroot] = xroot;
        }
        else if(rank[xroot]<rank[yroot]){
            par[xroot] = yroot;
        }
        else if(xroot!=yroot){
            par[yroot] = xroot;
        }
    }

    public int find(int x){
        if(x==par[x]){
            return x;
        }
        return par[x] = find(par[x]);
    }
    public boolean same(int x, int y){
        return find(x)==find(y);
    }
}