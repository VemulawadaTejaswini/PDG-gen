import java.util.*;

public class Main{

    int n;
    int[][] c;
    int[] per;
    boolean[] used;
    int goal,ans;
    //int[] v = new int[87654322];

    void solve(){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        c = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                c[i][j] = sc.nextInt();
            }
        }

        String s = "";
        for(int i=1; i<=n; i++) s += Integer.toString(i);

        goal = Integer.parseInt(s);

        per = new int[n];
        used = new boolean[n];
        ans = 0;
        //Arrays.fill(v,-1);
        dfs(0);

        System.out.println(ans);
    }

    void dfs(int pos){
        if(pos==n){
            int[] tmp = new int[n];
            for(int i=0; i<n; i++) tmp[i] = per[i];
            ans = Math.max(ans, dijkstra(tmp));
            return;
        }

        for(int i=0; i<n; i++){
            if(used[i]) continue;
            used[i] = true;
            per[pos] = i+1;
            dfs(pos+1);
            used[i] = false;
        }
    }

    class P{
        int[] p;
        int cost;
        P(int[] p, int cost){
            this.p = p;
            this.cost = cost;
        }
    }

    int dijkstra(int[] p){
        PriorityQueue<P> 
            q = new PriorityQueue<P>(n, new Comparator<P>(){
                    public int compare(P a, P b){
                        return a.cost - b.cost;
                    }
                });

        q.add(new P(p,0));
        int[] v = new int[87654322];
        Arrays.fill(v,-1);

        while(q.size()>0){
            P pp = q.poll();
            int[] perm = pp.p;
            int cost = pp.cost;

            String s = "";
            for(int i=0; i<n; i++) s += Integer.toString(perm[i]);

            //System.out.println(s+" "+cost);

            int nn = Integer.parseInt(s);
            if(nn==goal) return cost;
            if(v[nn]!=-1) continue;
            v[nn] = cost;

            for(int i=0; i<n; i++){
                //if(perm[i]==i+1) continue;
                for(int j=i+1; j<n; j++){
                    //if(perm[j]==j+1) continue;
                    int[] permm = new int[n];
                    for(int k=0; k<n; k++) permm[k] = perm[k];
                    int tmp = permm[i];
                    permm[i] = permm[j];
                    permm[j] = tmp;
                    q.add(new P(permm, cost+c[i][j]));
                }   
            }
        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}