import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Vector;


public class Main {

	static final int INF = 10000000;
	/**
	 * @param args
	 * @throws IOException 
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");

		int v = Integer.parseInt(tmpArray[0]);
		int e = Integer.parseInt(tmpArray[1]);
		int f = Integer.parseInt(tmpArray[2]);
		
		V = v;
		G = new Vector[V];

		for(int i = 0; i < G.length; i++){
			G[i] = new Vector<Edge>();
		}
		dist = new int[V];
		prevv = new int[V];
		preve = new int[V];
		h = new int[V];
		
		for(int i = 0; i < e; i++){
			tmpArray = br.readLine().split(" ");
			int from = Integer.parseInt(tmpArray[0]);
			int to = Integer.parseInt(tmpArray[1]);
			int c = Integer.parseInt(tmpArray[2]);
			int d = Integer.parseInt(tmpArray[3]);
			
			addEdge(from, to, c, d);
			
		}

		int result = minCostFlow(0, V - 1, f);

		System.out.println(result);
			
	}
	
	static int V;
	static Vector<Edge> G[];
	static int dist[];
	static int prevv[];
	static int preve[];
	static int h[];

	static void addEdge(int from, int to, int cap, int cost){
		G[from].add(new Edge(to, cap, cost, G[to].size()));
		G[to].add(new Edge(from, 0, -cost, G[from].size() - 1));
	}

	static int minCostFlow(int s, int t, int f){
		int res = 0;

		Arrays.fill(h, 0);
		
		while(f > 0){
			//dijkstra
			PriorityQueue<Dist> que = new PriorityQueue<Dist>();
			
			Arrays.fill(dist, INF);
			dist[s] = 0;
			que.add(new Dist(0, s));
			while(!que.isEmpty()){
				Dist p = que.remove();
				int v = p.v;
				if(dist[v] < p.dist){
					continue;
				}


				for(int i = 0; i < G[v].size() ;i++){
					Edge e = G[v].get(i);

					if(e.cap > 0 && dist[e.to] > dist[v] + e.cost + h[v] - h[e.to]){
						dist[e.to] = dist[v] + e.cost + h[v] - h[e.to];
						prevv[e.to] = v;
						preve[e.to] = i;
						que.add(new Dist(dist[e.to], e.to));
					}
				}
			}
			
			if(dist[t] == INF){
				return -1;
			}
			for(int v=0; v < V; v++){
				h[v] += dist[v];
			}

			//s-t間経路に沿って目一杯流す
			int d = f;
			for(int v = t; v != s; v = prevv[v]){
				d = Math.min(d, G[prevv[v]].get(preve[v]).cap);
			}
			f -= d;
			res += d * h[t];
			for(int v = t; v != s; v = prevv[v]){
				Edge e = G[prevv[v]].get(preve[v]);
				e.cap -= d;
				G[v].get(e.rev).cap += d;
			}
			
		}
		return res;
	}
}
class Edge {
	int to, cap, cost, rev;

	Edge(int to, int cap, int cost, int rev){
		this.to = to;
		this.cap = cap;
		this.cost = cost;
		this.rev = rev;
	}
}

class Dist implements Comparable<Dist>{
	int dist;
	int v;
	
	Dist(int dist, int v){
		this.dist = dist;
		this.v = v;
	}

	//近い順に並べる
	@Override
	public int compareTo(Dist d) {
		return this.dist - d.dist;
	}
}
