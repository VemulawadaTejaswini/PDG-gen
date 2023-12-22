import java.util.*;

class Main{

    int[] par, rank;
    int INF = Integer.MAX_VALUE;

    void init(int n){
        par = new int[n];
        rank = new int[n];
        for(int i=0; i<n ;i++){
            par[i] = i;
            rank[i] = 0;
        }
    }

    int find(int x){
        if(par[x]==x) return x;
        else return par[x] = find(par[x]);
    }

    void unite(int x, int y){
        x = find(x); y = find(y);
        if(x==y) return;

        if(rank[x] < rank[y]) par[x] = y;
        else{
            par[y] = x;
            if(rank[x]==rank[y]) rank[x]++;
        }
    }

    boolean same(int x, int y){
        return find(x) == find(y);
    }

    class Edge{
        int u, v, cost;
        Edge(int u, int v, int cost){
            this.u = u;
            this.v = v;
            this.cost = cost;
        }
    }

    void solve(){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt(), m = sc.nextInt();
            if(n==0 && m==0) break;

            Edge[] e = new Edge[m];
            for(int i=0; i<m; i++){
                int a = sc.nextInt()-1, b = sc.nextInt()-1;
                int w = sc.nextInt();
                e[i] = new Edge(a, b, w);
            }

            Arrays.sort(e, new Comparator<Edge>(){
                    public int compare(Edge e1, Edge e2){
                        return e1.cost - e2.cost;
                    }
                });

            int min = INF;
            for(int start=0; start<m; start++){
                int ma = 0, mi = INF;
                init(n);
                for(int i=start; i<m; i++){
                    Edge ee = e[i];
                    if(!same(e[i].u, e[i].v)){
                        unite(e[i].u, e[i].v);
                        ma = Math.max(ma, e[i].cost);
                        mi = Math.min(mi, e[i].cost);
                    }
                }
                HashSet<Integer> set = new HashSet<Integer>();
                for(int i=0; i<n; i++) set.add(par[i]);
                if(set.size()>1) continue;
                min = Math.min(min, ma-mi);
            }
            if(min==INF) min = -1;
            System.out.println(min);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}