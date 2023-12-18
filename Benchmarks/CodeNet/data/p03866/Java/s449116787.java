import java.util.*;

public class Main{
    
    static int[] x;
    static int[] y;
    static int[] r;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int sx = Integer.parseInt(sc.next());
        int sy = Integer.parseInt(sc.next());
        int gx = Integer.parseInt(sc.next());
        int gy = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        x = new int[n+2];
        y = new int[n+2];
        r = new int[n+2];
        x[0] = sx;
        y[0] = sy;
        x[n+1] = gx;
        y[n+1] = gy;
        for(int i=0; i<n; i++){
            x[i+1] = Integer.parseInt(sc.next());
            y[i+1] = Integer.parseInt(sc.next());
            r[i+1] = Integer.parseInt(sc.next());
        }
        
        Dijkstra dj = new Dijkstra(n+2);
        UnionFind uf = new UnionFind(n+2);
        for(int i=0; i<n+2; i++){
            Vertex[] vc = new Vertex[n+2];
            for(int j=0; j<n+2; j++){
                long difx = Math.abs(x[i]-x[j]);
                long dify = Math.abs(y[i]-y[j]);
                double dis = Math.sqrt(difx*difx + dify*dify);
                double cost = Math.max(0, dis-(r[i]+r[j]));
                vc[j] = new Vertex(j, cost);
            }
            Arrays.sort(vc);
            for(int j=0; j<n+2; j++){
                int v = vc[j].ver;
                if(i==v){
                    continue;
                }
                double cost = vc[j].cost;
                dj.addEdge(i, v, cost);
                uf.unite(i, v);
                if(uf.same(0, i)){
                    break;
                }
            }
        }
        
        double[] dist = dj.dijkstra(0);
        System.out.println(dist[n+1]);
        
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
    
    public void addEdge(int from, int to, double cost){
        edge[from].add(new Edge(from, to, cost));
        edge[to].add(new Edge(to, from, cost));
    }
    
    public double[] dijkstra(int from){
        double[] dist = new double[n];
        Arrays.fill(dist, INF);
        dist[from] = 0;
        
        PriorityQueue<Vertex> q = new PriorityQueue<>();
        q.add(new Vertex(from, 0));
        while(q.size() != 0){
            int u = q.poll().ver;
            
            for(Edge ne : edge[u]){
                int v = ne.to;
                double weight = ne.cost;
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
    public double cost = 0;
    
    public Edge(int from, int to, double cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
    
    @Override
    public int compareTo(Edge o) {
        double tmp = this.cost - o.cost;
        if(tmp == 0.0) return 0;
        return (int)(tmp/Math.abs(tmp));
    }
}

class Vertex implements Comparable<Vertex>{
    public int ver = 0;
    public double cost = 0;
    
    public Vertex(int ver, double cost) {
        this.ver = ver;
        this.cost = cost;
    }
    
    @Override
    public int compareTo(Vertex o) {
        double tmp = this.cost - o.cost;
        if(tmp == 0.0) return 0;
        return (int)(tmp/Math.abs(tmp));
    }
}


class UnionFind{
    static int[] par;
    static int[] rank;
    
    public UnionFind(int n){
        par = new int[n];
        rank = new int[n];
    }
    
    public static int find(int x){
        if(par[x] == x){
            return x;
        }else{
            par[x] = find(par[x]);
            return par[x];
        }
    }
    
    public static boolean unite(int x, int y){
        x = find(x);
        y = find(y);
        if(x==y) return false;
        
        if(rank[x]<rank[y]){
            par[x] = y;
        }else{
            par[y] = x;
            if(rank[x]==rank[y]) rank[x]++;
        }
        
        return true;
    }
    
    public static boolean same(int x, int y){
        return find(x)==find(y);
    }
}
