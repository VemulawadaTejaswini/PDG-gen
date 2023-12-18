import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next())-1;
        int b = Integer.parseInt(sc.next())-1;
        
        Dijkstra dij = new Dijkstra(n);
        
        for(int i=0; i<n-1; i++){
            int u = Integer.parseInt(sc.next())-1;
            int v = Integer.parseInt(sc.next())-1;
            dij.addEdge(u,v,1);
        }
        
        long[] adist = dij.dijkstra(a);
        long[] bdist = dij.dijkstra(b);
        
        long firstDist = adist[b];
        
        long max = 0;
        for(int i=0; i<n; i++){
            if(adist[i] < bdist[i]){
                max = Math.max(max, adist[i]);
            }
            //System.out.println("a " + adist[i] + " ; b " + bdist[i]);
        }
        
        System.out.println(Math.max(max, firstDist/2));
    }
}

class Dijkstra{
    
    public final long INF = (long)1e18;
    private int n;
    private List<Edge>[] edge;
    
    public Dijkstra(int n){
        this.n = n;
        edge = new List[n];
        for(int i=0; i<n; i++){
            edge[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int from, int to, int cost){
        edge[from].add(new Edge(from, to, cost));
        edge[to].add(new Edge(to, from, cost));
    }
    
    public long[] dijkstra(int from){
        long[] dist = new long[n];
        Arrays.fill(dist, INF);
        dist[from] = 0;
        
        PriorityQueue<Vertex> q = new PriorityQueue<>();
        q.add(new Vertex(from, 0));
        while(q.size() != 0){
            int u = q.poll().ver;
            
            for(Edge ne : edge[u]){
                int v = ne.to;
                long weight = ne.cost;
                if(dist[v] > dist[u]+weight){
                    dist[v] = dist[u]+weight;
                    q.add(new Vertex(v, dist[v]));
                }
            }
        }
        
        return dist;
    }
}

class Edge implements Comparable<Edge>{
    public int from = 0;
    public int to = 0;
    public int cost = 0;
    
    public Edge(int from, int to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
    
    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

class Vertex implements Comparable<Vertex>{
    public int ver = 0;
    public long cost = 0;
    
    public Vertex(int ver, long cost) {
        this.ver = ver;
        this.cost = cost;
    }
    
    @Override
    public int compareTo(Vertex o) {
        long tmp = this.cost - o.cost;
        if(tmp == 0) return 0;
        return (int)(tmp/Math.abs(tmp));
    }
}