import java.util.*;

class Main{

    P[] es;
    int V, E;
    int INF = Integer.MAX_VALUE/2;
    int[] par, rank;

    void init(int n){
        par = new int[n];
        rank = new int[n];
        for(int i=0; i<n; i++){
            par[i] = i;
            rank[i] = i;
        }
    }

    int find(int x){
        if(par[x]==x) return x;
        else return par[x] = find(par[x]);
    }

    void unit(int x, int y){
        x = find(x);
        y = find(y);
        if(x==y) return;

        if(rank[x]<rank[y]) par[x] = y;
        else{
            par[y] = x;
            if(rank[x]==rank[y]) rank[x]++;
        }
    }

    boolean same(int x, int y){
        return find(x) == find(y);
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
        while(true){
            V = sc.nextInt();
            E = sc.nextInt();
            if(V==0 && E==0) break;

            es = new P[E];
            for(int i=0; i<E; i++){
                int a = sc.nextInt()-1, b = sc.nextInt()-1;
                int w = sc.nextInt();
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
                int cnt = 0;
                int max = 0, min = INF;
                for(int j=i; j<E; j++){
                    P p = es[j];
                    if(!same(p.u, p.v)){
                        unit(p.u, p.v);
                        max = Math.max(max, p.cost);
                        min = Math.min(min, p.cost);
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