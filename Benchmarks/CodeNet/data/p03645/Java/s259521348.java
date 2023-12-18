import java.io.*;
import java.util.*;

public class Main {

    static class Vertex {
        int data;
        int distance;
        ArrayList<Vertex> path = new ArrayList<>();
        
        public Vertex(int d) {
            this.data = d;
            this.distance = Integer.MAX_VALUE;
        }
        
        public Vertex(int d, int dist) {
            this.data = d;
            this.distance = dist;
        }
        
        public void addPath(Vertex v) {
            this.path.add(v);
        }
        
        public void addPathAll(ArrayList<Vertex> v) {
            this.path = new ArrayList<>(v);
            //this.path.addAll(v);
        }
    }
    
    static class Edge {
        int vertex;
        int weight;
        
        public Edge(int v, int w) {
            this.vertex = v;
            this.weight = w;
        }
    }

    
    static class Question {
        int N, M;
        ArrayList<Edge>[] network;
        ArrayList<Vertex> vertices;
        boolean[] visited;
        
        
        public void dijkstra(int start) {    
            PriorityQueue<Vertex> pq = new PriorityQueue<>(new Comparator<Vertex>() {
                @Override
                public int compare(Vertex newV, Vertex oldV) { return newV.distance - oldV.distance; }
            });
            pq.add( vertices.get(start) );

            while ( !pq.isEmpty() ) {
                Vertex curr = pq.poll();
                visited[curr.data] = true;
                
                if ( !network[curr.data].isEmpty() ) {
                    for (Edge e : network[curr.data]) {
                        if ( !visited[e.vertex] ) {   
                            int newDistance = curr.distance + e.weight;
                            Vertex child = vertices.get( e.vertex );

                            if ( newDistance < child.distance ) {
                                pq.remove(child);
                                child.distance = newDistance;
                                child.addPathAll(curr.path);
                                child.addPath(curr);
                                pq.add(child);
                            }
                        }
                    }
                }
                
            }
        }
        
        public boolean solve() {
            dijkstra(0);
            Vertex v = vertices.get(N-1);
            pl(v.distance);
            if (v.distance < 3)return true;
            return false;
        }

        public void init() {
            network = new ArrayList[N+1];
            vertices = new ArrayList<>();
            
            for (int i = 0; i < N; i++) {
                network[i] = new ArrayList<>();
                if (i == 0) vertices.add(new Vertex(i, 0));
                else vertices.add(new Vertex(i));
            }
            visited = new boolean[N];
        }
        
        public void main(FastScanner in, PrintWriter out) {
            N = in.nextInt();
            M = in.nextInt();
            init();
            for (int i = 0; i < M; i++) {
                int u = in.nextInt()-1;
                int v = in.nextInt()-1;
                int w = 1;
                network[u].add( new Edge(v, w) );
                network[v].add( new Edge(u, w) );
            }
            out.println( solve() ? "POSSIBLE" : "IMPOSSIBLE" );
        }
        
        public void p(Object o) { System.out.print(o); }
        public void pl(Object o) { System.out.println(o); }
        public void arp(int[] o) { pl( Arrays.toString(o) ); }
        public void arp(boolean[] o) { pl( Arrays.toString(o) ); }
        public void arpp(int[][] o) { 
            for (int i = 0; i < o.length; i++) {
                for (int j = 0; j < o[0].length; j++) { p( o[i][j] + " " ); } pl("");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Question q = new Question();
        q.main(in, out);
        out.close();
        in.close();
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(InputStream in) { br = new BufferedReader(new InputStreamReader(in)); }
        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); } 
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        public void close() throws IOException { br.close(); }
    }
}
