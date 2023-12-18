import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    static ArrayList<Integer>[]adj;
    static void bfs(int s,int []d){
        Arrays.fill(d,-1);
        d[s]=0;
        Queue<Integer>q= new LinkedList<>();
        ((LinkedList<Integer>) q).add(s);
        while (!q.isEmpty()){
            int u = q.poll();
            for (int v:adj[u]){
                if (d[v]==-1){
                    d[v]=1+d[u];
                    ((LinkedList<Integer>) q).add(v);
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[][]dis = new int[n][n];
        adj= new ArrayList[n];
        for (int i =0;i<n;i++)adj[i]=new ArrayList<>();
        int x= sc.nextInt()-1;
        int y= sc.nextInt()-1;
        adj[x].add(y);
        adj[y].add(x);
        for (int i =0;i<n-1;i++){
            adj[i].add(i+1);
            adj[i+1].add(i);
        }
        int[]ans= new int[n];
        for (int i =0;i<n;i++){
            bfs(i,dis[i]);
        }
        for (int i =0;i<n;i++){
            for (int j =i+1;j<n;j++){
                ans[dis[i][j]]++;
            }
        }
        for (int i =1;i<n;i++)
            pw.println(ans[i]);
        pw.flush();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

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

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }

}