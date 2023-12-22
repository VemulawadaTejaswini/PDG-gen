import java.util.*;

class Main{

    int[] par, rank;
    int V, E;
    P[] es;

    void init(int n){
        par = new int[n];
        rank = new int[n];
        for(int i=0; i<n; i++){
            par[i] = i; rank[i] = i;
        }
    }

    int find(int x){
        if(par[x]==x) return x;
        else return par[x] = find(par[x]);
    }

    void unit(int x, int y){
        x = find(x); y = find(y);
        if(x==y) return;
        if(rank[x]<rank[y]) par[x] = y;
        else {
            par[y] = x;
            if(rank[x]==rank[y]) rank[x]++;
        }
    }

    boolean same(int x, int y){
        return find(x)==find(y);
    }

    class P{
        int u, v, cost;
        P(int u, int v, int cost){
            this.u = u;
            this.v = v;
            this.cost = cost;
        }
    }

    void solve(){
        Scanner sc = new Scanner(System.in);
        int INF = Integer.MAX_VALUE/2;

        while(true){
            V = sc.nextInt(); E = sc.nextInt();
            if(V==0 && E==0) break;

            es = new P[E];
            for(int i=0; i<E; i++){
                int a = sc.nextInt()-1, b = sc.nextInt()-1, w = sc.nextInt();
                es[i] = new P(a, b, w);
            }

            Arrays.sort(es, new Comparator<P>(){
                    public int compare(P p1, P p2){
                        return p1.cost - p2.cost;
                    }
                });

            int ans = INF;
            for(int i=0; i<E; i++){
                init(V);
                int max = 0, min = INF;
                int cnt = 0;
                for(int j=i; j<E; j++){
                    P e = es[j];
                    if(!same(e.u, e.v)){
                        unit(e.u, e.v);
                        max = Math.max(max, e.cost);
                        min = Math.min(min, e.cost);
                        cnt++;
                    }
                }
                if(cnt!=V-1) continue;
                ans = Math.min(ans, max - min);
            }
            if(ans==INF) ans = -1;
            System.out.println(ans);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}