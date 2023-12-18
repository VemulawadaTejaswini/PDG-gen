
//package cf;
import java.io.*;
import java.util.*;
public class Main {
    static int p=1000000007;
    public static void main(String[] args) throws Exception{
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        FastReader sc=new FastReader();
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> adj[]=new ArrayList[n+1];
        for(int i=0;i<=n;i++)
        {
            List<Integer> l1=new ArrayList<>();
            adj[i]=l1;
        }
        for(int i=0;i<m;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj[u].add(v);
        }

        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=0;
        boolean vis[]=new boolean[n+1];
        for(int i=1;i<=n;i++) {
            if(vis[i]==false)
               ans= Math.max(dfs(adj, i, dp, vis),ans);
        }
        System.out.println(ans);
        // StringBuilder sb=new StringBuilder();
        //   out.write(sb.toString());
        out.flush();
    }

    private static int dfs(List<Integer>[] adj, int i, int[] dp, boolean[] vis) {
        vis[i]=true;
      //  System.out.println(i+" ");

        if(adj[i].size()==0)
        {
            dp[i]=0;
            return 0;
        }
        if(dp[i]!=-1)
            return dp[i];
        int this_path=0;
        for(int v:adj[i])
        {
                this_path=Math.max(1+dfs(adj,v,dp,vis),this_path);
        }
        dp[i]=this_path;
        //System.out.println(Arrays.toString(dp));
        return dp[i];
    }


    ///////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


}
