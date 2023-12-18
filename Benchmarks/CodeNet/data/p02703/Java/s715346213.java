import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 2019;
    int[] child,color,count;
    long[] res;
    ArrayList<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        out.println(main.solve());
        main.solve();
        out.flush();
    }
    long solve(){
        int n = sc.nextInt(), m = sc.nextInt(), S = sc.nextInt();
        ArrayList<Edge>[] tree = new ArrayList[n];
        for(int i=0;i<n;i++) tree[i] = new ArrayList<>();
        for(int i=0;i<m;i++){
            int u = sc.nextInt()-1, v = sc.nextInt()-1;
            int fee = sc.nextInt();
            long time = sc.nextLong();
            tree[u].add(new Edge(v,fee,time));
            tree[v].add(new Edge(u,fee,time));
        }
        int[] c = new int[n], d= new int[n];
        for(int i=0;i<n;i++){
            c[i] = sc.nextInt(); d[i] = sc.nextInt();
        }
        int s_max = 50*n;
        long[][] dp = new long[n][s_max+1];
        long inf = Long.MAX_VALUE/10;
        for(int i=0;i<n;i++) Arrays.fill(dp[i],inf);
        S = Math.min(S,s_max);
        dp[0][S] = 0;
        PriorityQueue<State> pq = new PriorityQueue<>(5000, Comparator.comparingLong(ele->ele.res));
        pq.add(new State(0,S,0));
        while(pq.size()>0){
            State cur = pq.poll();
            if(dp[cur.pos][cur.coin]<cur.res) continue;
            // first of all, buy one coins here
            int idx = cur.pos;
            if(cur.coin<s_max){
                int target = Math.min(s_max, cur.coin+c[idx]);
                if(dp[idx][target]>cur.res+d[idx]){
                    dp[idx][target] = cur.res+d[idx];
                    pq.add(new State(idx, target, dp[idx][target]));
                }
            }
            // then go to neiboring cities
            for(Edge e:tree[idx]){
                if(e.fee>cur.coin) continue;
                int to = e.to;
                int  left = cur.coin-e.fee;
                if(dp[to][left]<=cur.res+e.time) continue;
                dp[to][left] = cur.res+e.time;
                pq.add(new State(to, left, dp[to][left]));
            }
        }
        for(int t=1;t<n;t++){
            long ans = inf;
            for(int res=0;res<=s_max;res++) ans = Math.min(ans,dp[t][res]);
            out.println(ans);
        }
        return 0;
    }
    class Edge{
        int to,fee;
        long time;
        public Edge(){}
        public Edge(int _to, int _f, long _time){
            to = _to; fee = _f; time = _time;
        }
    }
    class State{
        int pos; int coin; long res;
        public State(int p, int c, long r){
            pos = p; coin = c; res= r;
        }
    }

}

