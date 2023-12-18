import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
public class Main {
    static void dfs(int i, ArrayList<Integer>[] g, boolean[] vis, int[] dp) {
        vis[i]=true;
        for(int j:g[i]) {
            if(!vis[j])
                dfs(j,g,vis,dp);
            dp[i]=Math.max(dp[i],dp[j]+1);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String s=br.readLine();
        String[] c=s.split(" ");
        int n=Integer.valueOf(c[0]),
            m=Integer.valueOf(c[1]);
        ArrayList<Integer>[] g=new ArrayList[n];
        for(int i=0;i<n;i++)
            g[i]=new ArrayList<>();
        for(int i=0;i<m;i++) {
            s=br.readLine();
            c=s.split(" ");
            int x=Integer.valueOf(c[0])-1,
                y=Integer.valueOf(c[1])-1;
            g[x].add(y);
        }
        int[] dp=new int[n];
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++) {
            if(!vis[i])
                dfs(i,g,vis,dp);
        }
        int ans=0;
        for(int i=0;i<n;i++)
            ans=Math.max(ans,dp[i]);
        pw.print(ans);
        br.close();
        pw.close();
    }
}