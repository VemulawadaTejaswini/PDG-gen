import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<edge>[]graph;
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(f.readLine());

        int n = Integer.parseInt (st.nextToken());
        int m = Integer.parseInt (st.nextToken());
        graph=new ArrayList[n];
        for(int i=0;i<n;i++)
            graph[i]=new ArrayList<>();
        for(int i=0;i<m;i++){
            st = new StringTokenizer (f.readLine());
            int a = Integer.parseInt (st.nextToken())-1;
            int b = Integer.parseInt (st.nextToken())-1;
            graph[a].add(new edge(b));
        }
        dp=new long[n];
        long ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,solve(i));
        }
        ans--;
        System.out.println(ans);
        f.close();

        //print to System. out.println

    }
    static long []dp;
    public static long solve(int idx){
        long ret=1;
        long add=0;
        if(dp[idx]!=0){
            return dp[idx];
        }

        for(int i=0;i<graph[idx].size();i++){
            add=0;
            add+=solve(graph[idx].get(i).to);
            ret=Math.max(add+1,ret);
        }
        dp[idx]=ret;
        return ret;
    }
}
class edge{
    int to;
    edge(int a){
        to=a;
    }
}