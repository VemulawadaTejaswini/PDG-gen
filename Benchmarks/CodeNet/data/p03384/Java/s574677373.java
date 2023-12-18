import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[]adj;
    static int[]dis;
    static void dfs(int u,int p) {
        for (int v:adj[u]){
            if (v!=p)
            {
                dis[v]=1+dis[u];
                dfs(v,u);
            }
        }
    }
    static int []nodes;
    static boolean is,dia[];
    static ArrayList<Integer>gen(int u,int p){
        ArrayList<Integer>sol = new ArrayList<>();
        int add=adj[u].size();
        for (int v:adj[u]){
            if (v!=p){
                if (adj[v].size()>1){
                    sol.add(adj[v].size()-2);
                    sol.addAll(gen(v,u));
                }
            }
        }
        return sol;
    }
    static boolean getdia(int u,int p){
        if (u==nodes[1])
            return dia[u]=true;
        for (int v:adj[u])
            if (v!=p)
                dia[u]|=getdia(v,u);

        return dia[u];
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
        dis= new int[n];
        dfs(0,-1);
        int node=0;
        for (int i =0;i<n;i++){
            if (dis[node]<dis[i])
                node=i;
        }
        dis= new int[n];
        dfs(node,-1);
        int node2=node;
        for (int i =0;i<n;i++)
            if (dis[node2]<dis[i])
                node2=i;
        nodes= new int[2];
        nodes[0]=node;
        nodes[1]=node2;
        dia= new boolean[n];
        getdia(node,-1);
        is=true;
        for (int i =0;i<n;i++){
            boolean here=dia[i];
            for (int v:adj[i])
                here|=dia[v];
            is&=here;
        }
        if (!is){
            pw.println(-1);
            pw.flush();
            return;
        }
        ArrayList<Integer>a1=gen(node,-1);
        ArrayList<Integer>a2=gen(node2,-1);
        ArrayList<Integer>selected=a1;

        for (int i =0;i<a1.size();i++){
            if (a1.get(i)==a2.get(i))
                continue;
            if (a1.get(i)<a2.get(i))
                selected=a1;
            else selected=a2;
            break;
        }
        selected.add(0,0);
        selected.add(0);
        int[]ans = new int[n];
        int id=0;
        for (int i =0;i<a1.size();i++){
            int x = selected.get(i);
            ans[id+x]=id+1;
            int v=id+2;
            for (int j = id;j<id+x;j++){
                ans[j]=v++;
            }
            id+=x+1;
        }
        for (int x:ans)
            pw.print(x+" ");
        pw.println();
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