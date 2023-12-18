
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[]adj;
    static boolean is;
    static int dfs(int u,int p) {
        int ret = 1;
        for (int v : adj[u])
            if (v != p) {
                ret += dfs(v, u);
            }
        return ret;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        adj= new ArrayList[n];
        for (int i =0;i<n;i++)
            adj[i]=new ArrayList<>();
        for (int i =0;i<n-1;i++){
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            adj[u].add(v);
            adj[v].add(u);
        }
        int grtr=0;
        int node=0;
        for (int i =0;i<n;i++){
            if (adj[i].size()>2){
                grtr++;
                node=i;
            }
        }
        if (grtr>1){
            pw.println(-1);
        }
        else if (grtr==0){
            for (int i =1;i<=n;i++)
                pw.print(i+" ");
            pw.println();
        }
        else {
            grtr=0;
            int nxt=adj[node].get(0);
            for (int v:adj[node]){
                if (adj[v].size()>1){
                    grtr++;
                    nxt=v;
                }
            }
            if (grtr>1){
                pw.println(-1);
            }
            else {
                int sz=dfs(nxt,node);
                int[]ans = new int[n];
                for (int i =0;i<sz;i++)
                    ans[i]=i+1;
                int root=sz+1;
                for (int i =sz;i<n-2;i++){
                    ans[i]=i+2;
                }
                ans[n-2]=root;
                ans[n-1]=n;
                for (int x:ans)
                    pw.print(x+" ");
                pw.println();
            }
        }
        pw.close();

    }
    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(next());
            }
            return arr;
        }

    }

}
