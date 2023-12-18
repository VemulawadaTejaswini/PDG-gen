import java.util.*;

public class Main{
    static final int INF = (int)1e9 + 7;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Edge[] edges = new Edge[m];
        
        for(int i=0; i<m; i++){
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            edges[i] = new Edge(l, r, c);
        }
        
        Arrays.sort(edges);
        long[] dp = new long[n+1];
        Arrays.fill(dp, INF);
        TreeSet<Integer> t = new TreeSet<>();
        t.add(1);
        t.add(INF);
        dp[1] = 0;
        for(int i=0; i<m; i++){
            Edge e = edges[i];
            int id = t.higher(e.l-1);
            if(id==INF){
                System.out.println(-1);
                return;
            }
            
            while(id!=INF && id <= e.r){
                long cost = dp[id]+e.c;
                t.add(e.r);
                if(dp[e.r] > cost){
                    dp[e.r] = cost;
                }
                id = t.higher(id);
            }
        }
        
        System.out.println(dp[n]);
        
    }
    
    
}


class Edge implements Comparable<Edge>{
    public int l = 0;
    public int r = 0;
    public int c = 0;
     
    public Edge(int l, int r, int c) {
        this.l = l;
        this.r = r;
        this.c = c;
    }
     
    @Override
    public int compareTo(Edge o) {
        return this.l - o.l;
    }
}
