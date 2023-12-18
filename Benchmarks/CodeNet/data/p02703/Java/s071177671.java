import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		Graph g = new Graph(n, false);
		int max = 0;
		for(int i = 0; i < m; i++){
		    int from = sc.nextInt()-1;
		    int to = sc.nextInt()-1;
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    g.add(from, to, a, b);
		    max = max(max, a);
		}
		for(int i = 0; i < n; i++){
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    g.addCD(i, c, d);
		}
		
		// 計算
		//long result = 0;
		long[] result = g.dijkstra(0, min(s, max*n), max);
		
		// 出力
		for(int i = 1; i < n; i++){
		    System.out.println(result[i]);
		}
		//System.out.println(result);
	}
}

class Graph {
	int n;
	boolean directed;
	ArrayList<Edge>[] adjList;
	int m;
	long[][] dist;
	int start;
	int[] prev;
	long INF = 1001001001001001001L;
	int[] c;
	int[] d;

	public Graph (int n, boolean directed) {
		this.n = n;
		this.m = 0;
		this.directed = directed;
		this.adjList = new ArrayList[n];
		for(int i = 0; i < n; i++){
			adjList[i] = new ArrayList<Edge>();
		}
		this.c = new int[n];
		this.d = new int[n];
	}

	public void add(int from, int to, int a, int w) {
		adjList[from].add(new Edge(from, to, a, w));
		this.m++;
		if(!directed){
			adjList[to].add(new Edge(to, from, a, w));
			this.m++;
		}
	}
	
	public void addCD(int id, int c, int d) {
		this.c[id] = c;
		this.d[id] = d;
	}
	
	public long[] dijkstra(int start, int s, int max) { // O(MlogM)
		this.start = start;
		this.prev = new int[n];
		Arrays.fill(prev, -1);
		prev[start] = start;
		this.dist = new long[n][max*n+1];
		for(int i = 0; i < n; i++){
		    Arrays.fill(dist[i], INF);
		}
		dist[start][s] = 0;
		PriorityQueue<Vertex> q = new PriorityQueue<Vertex>((x, y) -> Long.compare(x.distance, y.distance));
		q.add(new Vertex(start, s, 0));
		while(!q.isEmpty()){
			Vertex now = q.poll();
			if(now.distance != dist[now.id][now.a]) continue;
			
			int charge = min(max*n, now.a + c[now.id]);
			if(dist[now.id][charge] > now.distance + d[now.id]){
			    dist[now.id][charge] = now.distance + d[now.id];
			    q.add(new Vertex(now.id, charge, now.distance + d[now.id]));
			}
			
			for(Edge e : adjList[now.id]){
			    int newA = now.a - e.cost;
			    if(newA < 0) continue;
				long newDist = now.distance + e.w;
				if(dist[e.to][newA] <= newDist) continue;
				dist[e.to][newA] = newDist;
				prev[e.to] = now.id;
				q.add(new Vertex(e.to, newA, newDist));
			}
		}
		return minDist();
	}
	
	public long[] minDist(){
		long[] minDist = new long[n];
		Arrays.fill(minDist, INF);
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < dist[0].length; j++){
		        minDist[i] = min(minDist[i], dist[i][j]);
		    }
		}
		return minDist;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(ArrayList<Edge> list : adjList){
			for(Edge e : list){
				sb.append(e.toString());
				sb.append("\n");
			}
		}
		return sb.toString();
	}
	
	class Edge {
		int from;
		int to;
		int cost;
		int w;
		
		Edge(int from, int to, int cost, int w){
			this.from = from;
			this.to = to;
			this.cost = cost;
			this.w = w;
		}
		
		public String toString(){
			return "from:" + from + " to:" + to + " cost:" + cost + " w:" + w;
		}
	}
	
	class Vertex {
		int id;
		int a;
		long distance;
		
		Vertex(int id, int a, long distance){
			this.id = id;
			this.a = a;
			this.distance = distance;
		}
		
		public String toString(){
			return "id:" + id + " a:" + a + " distance:" + distance;
		}
	}
}


