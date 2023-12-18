import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private class Edge{
        int from;
        int to;
        int w;
        int idx;

        Edge(int from, int to, int w, int idx) {
            this.from = from;
            this.to = to;
            this.w = w;
            this.idx = idx;
        }
    }

    ArrayList<Edge>[] edges;
    int n,m;
    boolean[] mrk;

    private void solve() {
        n = in.nextInt();
        m = in.nextInt();

        edges = new ArrayList[n+1];
        for(int i=0;i<n;i++){
            edges[i] = new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            edges[a-1].add(new Edge(a-1,b-1,c,i));
            edges[b-1].add(new Edge(b-1,a-1,c,i));
        }
        mrk = new boolean[m+1];
        Arrays.fill(mrk,false);
        for(int i=0;i<n;i++){
            dijkstra(i);
        }
        int ans =0;
        for(int i=0;i<m;i++){
            if(!mrk[i]) ans++;
        }
        out.print(ans);
    }

    private void dijkstra(int u){
        int[] dist = new int[n+1];
        Arrays.fill(dist,100000000);
        dist[u] = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>(new EdgeCompartor());
        for(Edge e:edges[u]){
            pq.add(e);
        }

        while (!pq.isEmpty()){
            Edge e = pq.poll();
            u = e.from;
            int v = e.to;

            if(dist[v] >= dist[u]+e.w){
                dist[v] = dist[u]+e.w;
                mrk[e.idx] = true;
                for(Edge f:edges[v]){
                    pq.add(f);
                }
            }
        }
    }

    private class EdgeCompartor implements Comparator<Edge>{

        @Override
        public int compare(Edge o1, Edge o2) {
            return o1.w-o2.w;
        }
    }

    private void runIO() {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        solve();
        out.close();
    }
    private static class FastScanner {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private FastScanner() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private String nextLine() {
            String ret = "";
            try {
                ret = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
