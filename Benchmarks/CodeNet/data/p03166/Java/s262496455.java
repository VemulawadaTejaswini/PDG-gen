import java.awt.*;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static LinkedList<Integer> adj[];
    static boolean vis[];static int dp[],inDeg[],dist[];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        adj=new LinkedList[n];
        inDeg=new int[n];
        for (int i=0;i<n;i++){
            adj[i]=new LinkedList<>();
        }
        dist=new int[n];
        for (int i=0;i<m;i++){
            int a=sc.nextInt()-1,b=sc.nextInt()-1;
            adj[a].add(b);
            inDeg[b]++;
        }
        dp=new int[n];
        vis=new boolean[n];
        for (int i=0;i<n;i++){
            if (inDeg[i]==0){
                dfs(i);
            }
        }
        int ans=0;
        for (int i=0;i<n;i++){
            ans=Math.max(ans,dist[i]);
        }
        System.out.println(ans);
    }
    static void dfs(int i){
        if (vis[i])return;
        vis[i]=true;
        for (int u:adj[i]){
            dist[u]=Math.max(dist[u],dist[i]+1);
            inDeg[u]--;
            if (inDeg[u]==0){
                dfs(u);
            }
        }
    }

}