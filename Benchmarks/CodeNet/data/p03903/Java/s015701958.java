import java.util.*;

public class Main{
    
    static List<Edge>[] edge;
    static int[][] vmax;
    static int n,m;
    
    static ArrayDeque<Integer> q = new ArrayDeque<>();
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int inf = (int)1e9;
        
        n = Integer.parseInt(sc.next());
        m = Integer.parseInt(sc.next());
        
        Prim pr = new Prim(n);
        for(int i=0; i<m; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            int c = Integer.parseInt(sc.next());
            pr.addEdge(a, b, c);
        }
        
        //ここから引く
        long all = pr.prim();
        //System.out.println(all);
        
        edge = pr.newEdge;
        vmax = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(vmax[i], -1);
        }
        
        vmax = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(vmax[i],-1);
        }
        
        int q = Integer.parseInt(sc.next());
        for(int i=0; i<q; i++){
            int s = Integer.parseInt(sc.next())-1;
            int t = Integer.parseInt(sc.next())-1;
            System.out.println(all - maxv(s,t));
        }
    }
    
    public static int maxv(int s, int t){
        int max = 0;
        q.clear();
        q.add(s);
        boolean[] used = new boolean[n];
        while(q.size() != 0){
            int now = q.pollFirst();
            used[now] = true;
            for(int i=0; i<edge[now].size(); i++){
                Edge e = edge[now].get(i);
                vmax[s][e.to] = Math.max(vmax[s][now], e.cost);
                
                if(vmax[s][e.to] == -1){
                    vmax[s][e.to] = max;
                    vmax[e.to][s] = max;
                }
                if(vmax[s][t] != -1){
                    return vmax[s][t];
                }
                if(!used[e.to]){
                    q.add(e.to);
                }
            }
        }
        
        return vmax[s][t];
    }
}


class Prim{
    
    public static int n;
    private static List<Edge>[] edge;
    public static List<Edge>[] newEdge;
    
    public static final int inf = (int)10e9;
    
    public Prim(int n){
        this.n = n;
        
        edge = new List[n];
        newEdge = new List[n];
        for(int i=0; i<n; i++){
            edge[i] = new ArrayList<>();
            newEdge[i] = new ArrayList<>();
        }
    }
    
    public long prim(){
        boolean[] check = new boolean[n];
        Queue<Edge> q = new PriorityQueue<>();
        q.add(new Edge(0,0,0));//だみー
        
        long res = 0;
        
        while(!q.isEmpty()){
            Edge e = q.poll();
            if(check[e.to]){
                continue;
            }
            
            check[e.to] = true;
            res += e.cost;
            
            //newEdgeに追加
            addNewEdge(e.from, e.to, e.cost);
            
            q.addAll(edge[e.to]);
        }
        
        return res;
    }
    
    public void addEdge(int from, int to, int cost){
        edge[from].add(new Edge(from, to, cost));
        edge[to].add(new Edge(to, from, cost));
    }
    
    private void addNewEdge(int from, int to, int cost){
        newEdge[from].add(new Edge(from, to, cost));
        newEdge[to].add(new Edge(to, from, cost));
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
