import java.util.*;

public class Main{
    
    static int n;
    static int m;
    static ArrayList<Integer>[] g;
    static int[][] cost;
    static boolean[] used;
    static int[] dis;
    static final int INF = 1_000_000_000 + 1;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        
        g = new ArrayList[n];
        for(int i=0; i<n; i++){
            g[i]= new ArrayList<Integer>();
        }
        
        cost = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                cost[i][j] = INF;
            }
        }
        used = new boolean[n];
        
        for(int i=0; i<m; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int d = sc.nextInt();
            cost[l-1][r-1] =  d;
            cost[r-1][l-1] = -d;
            g[l-1].add(r-1);
            g[r-1].add(l-1);
        }
        
        dis = new int[n];
        for(int i=0; i<n; i++){
            dis[i] = INF;
        }
        
        boolean ans = true;
        for(int i=0; i<n; i++){
            if(!used[i]){
                boolean res = dfs(i);
                if(!res){
                    ans = false;
                }
            }
        }
        
        System.out.println(ans ? "Yes" : "No");
    }
    
    public static boolean dfs(int v){
        boolean res =  true;
        
        Deque<Integer> q = new ArrayDeque<Integer>();
        q.push(v);
        dis[v] = 0;
        
        while(q.size()!=0){
            int now = q.pop();
            used[now] = true;
            for(int i=0; i<g[now].size(); i++){
                int next = g[now].get(i);
                if(!used[next]){
                    if(dis[next]==INF){
                        dis[next] = dis[now] + cost[now][next];
                    }else if(dis[next] != dis[now] + cost[now][next]){
                        res = false;
                    }
                    q.push(next);
                }
            }
        }
        return res;
    }
    
}
