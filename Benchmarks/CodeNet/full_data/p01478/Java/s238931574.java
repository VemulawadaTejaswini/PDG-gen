import java.util.*;

public class Main{

    int n;
    int[][] c;
    char[] per;
    boolean[] used;
    String goal;
    ArrayList<String> slist;
    //int[] v = new int[87654322];

    void solve(){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        c = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int cc = sc.nextInt();
                c[i][j] = cc;
                c[j][i] = cc;
            }
        }

        goal = "";
        for(int i=1; i<=n; i++) goal += Integer.toString(i);

        slist = new ArrayList<String>();
        per = new char[n];
        used = new boolean[n];
        dfs(0);

        int ans = 0;
        for(int i=0; i<slist.size(); i++){
            ans = Math.max(ans, dijkstra(slist.get(i)));
        }

        System.out.println(ans);
    }

    void dfs(int pos){
        if(pos==n){
            slist.add(new String(per));
            return;
        }

        for(int i=0; i<n; i++){
            if(used[i]) continue;
            used[i] = true;
            per[pos] = (char)('0'+(i+1));
            dfs(pos+1);
            used[i] = false;
        }
    }

    class P{
        String p;
        int cost;
        P(String p, int cost){
            this.p = p;
            this.cost = cost;
        }
    }

    int dijkstra(String ss){
        PriorityQueue<P> 
            q = new PriorityQueue<P>(n, new Comparator<P>(){
                    public int compare(P a, P b){
                        return a.cost - b.cost;
                    }
                });

        q.add(new P(ss,0));
        boolean[] v = new boolean[8765432];

        while(q.size()>0){
            P pp = q.poll();
            String perm = pp.p;
            int cost = pp.cost;

            if(cost>100000*n) continue;

            int nn = Integer.parseInt(perm.substring(0,n-1));
            if(perm.equals(goal)) return cost;
            if(v[nn]) continue;
            v[nn] = true;

            //System.out.println(perm+" "+cost);

            char[] permm = perm.toCharArray();

            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    char tmp = permm[i];
                    permm[i] = permm[j];
                    permm[j] = tmp;
                    q.add(new P(new String(permm), cost+c[i][j]));
                    tmp = permm[i];
                    permm[i] = permm[j];
                    permm[j] = tmp;
                }   
            }
        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}