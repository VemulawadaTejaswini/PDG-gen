import java.util.*;
import java.io.*;
   
public class Main {
   
    static int vertex;
    static int edges;
    static boolean[] visited;
    static int[] cost;
    static int[] parent;
    static ArrayList<Edge>[] graph;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int INFINITY = Integer.MAX_VALUE;
    static Main obj = new Main();
   
    class Edge implements Comparable<Edge> {
   
        int from;
        int to;
        int weight;
   
        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
   
        @Override
        public int compareTo(Edge other) {
            int diff = weight - other.weight;
            return diff;
        }
   
    }
   
    public static void main(String[] args) throws IOException {
   
        input();
        prim();
   
    }
   
    @SuppressWarnings("unchecked")
    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        vertex = Integer.parseInt(st.nextToken());
        edges = Integer.parseInt(st.nextToken());
        visited = new boolean[vertex];
        cost = new int[vertex];
        parent = new int[vertex];
        graph = new ArrayList[vertex];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i < edges; i++) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                break;
            }
            int a = Integer.parseInt(st.nextToken()) ;
            int b = Integer.parseInt(st.nextToken()) ;
            int c = Integer.parseInt(st.nextToken());
   
            graph[a].add(obj.new Edge(a, b, c));
   
        }
        for (int i = 0; i < cost.length; i++) {
            cost[i] = INFINITY;
        }
   
    }
   
    public static void prim() {
   
        int added = 1;
        int sum = 0;
        visited[0] = true;
        cost[0] = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
        for (Edge e : graph[0]) {
            pq.offer(e);
        }
        while (!pq.isEmpty()) {
            Edge e = pq.poll();
            if (visited[e.to]) {
                continue;
            }
   
            sum += e.weight;
            added++;
            cost[e.to] = e.weight + cost[e.from];
            parent[e.to] = e.from;
            visited[e.to] = true;
   
            if (added == vertex) {
                break;
            }
            for (Edge q : graph[e.to]) {
                if (visited[q.to]) {
                    continue;
                } else {
                    pq.offer(q);
                }
            }
   
        }
        for (int i = 0; i < vertex; i++) {
            if(cost[i]==Integer.MAX_VALUE){System.out.println("INF")}else{System.out.println(cost[i]);}
        }
   
    }
   
}