import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer> adj[];
    static int c=0;
    static boolean vis[];
    static int cnt[];
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        int n=sc.nextInt(),x=sc.nextInt()-1,y=sc.nextInt()-1;
        adj=new ArrayList[n];
        for (int i=0;i<n;i++)adj[i]=new ArrayList<>();
        for (int i=0;i<n-1;i++){
            adj[i].add(i+1);
            adj[i+1].add(i);
        }
        vis=new boolean[n];
        adj[x].add(y);
        adj[y].add(x);
        cnt=new int[n];
        for (int i=0;i<n;i++){
            Arrays.fill(vis,false);
            int dist[]=new int[n];
            LinkedList<Integer> q=new LinkedList<>();
            q.add(i);
            vis[i]=true;
            while (!q.isEmpty()){
                int u=q.poll();
                for (int v:adj[u]){
                    if (vis[v])continue;
                    q.add(v);
                    vis[v]=true;
                    dist[v]=dist[u]+1;
                }
            }
            for (int z:dist)cnt[z]++;
        }
        StringBuilder sb=new StringBuilder();
        for (int i=1;i<n;i++)sb.append(cnt[i]/2+"\n");
        System.out.print(sb);

    }
    static void dfs(int i,int h,int st){
        if (i>st) {
            cnt[h]++;
        }
        if (vis[i])return;
        vis[i]=true;
        for (int u:adj[i]){
            if (vis[u])continue;
            dfs(u,h+1,st);
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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