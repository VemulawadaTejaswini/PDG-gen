
import java.util.*;
public class Main {
	int INF = 1 << 24;
	class MCF{
		ArrayList<ArrayList<Edge>> G;
		
		class Edge {
			int to, cap, cost;
			int rev;

			public Edge(int to, int cap, int cost, int rev) {
				this.to = to;this.cap = cap;this.cost = cost; this.rev = rev;
			}
		}
		MCF(int v){
			G = new ArrayList<ArrayList<Edge>>();
			for(int i = 0; i < v; i++){
				G.add(new ArrayList<Edge>());
			}
		}
		
		private void addEdge(int from, int to, int cap, int cost){
			G.get(from).add(new Edge(to, cap, cost, G.get(to).size()));
			G.get(to).add(new Edge(from, 0, -cost, G.get(from).size() - 1));
		}

		private int minCostFlow(int s, int t, int f) {
			int V = G.size();
			int [] dist = new int[V], prevv = new int[V], preve = new int[V];
			int res = 0;
			while(f > 0){
				Arrays.fill(dist, INF);
				dist[s] = 0;
				boolean update = true;
				while(update) {
					update = false;
					for(int v = 0; v < V; v++){
						if(dist[v] == INF) continue;
						for(int i = 0 ; i < G.get(v).size(); i++){
							Edge  e = G.get(v).get(i);
							if(e.cap > 0 && dist[e.to]> dist[v] + e.cost ){
								dist[e.to] = dist[v] + e.cost;
								prevv[e.to] = v;
								preve[e.to] = i; 
								update = true;
							}
						}
					}
				}
				if(dist[t] == INF) return -1;
				
				int d = f;
				for(int v = t; v != s; v = prevv[v]){
					d = Math.min(d, G.get(prevv[v]).get(preve[v]).cap);
				}
				f -= d;
				res += d * dist[t];
				for(int v = t; v!= s; v = prevv[v]){
					Edge e =G.get(prevv[v]).get(preve[v]);
					e.cap -= d;
					G.get(v).get(e.rev).cap += d;
				}
			}
			return res;
		}
	}

	
	private void doit(){
		Scanner sc =new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] start = new int[n];
			int [] end = new int[n];
			int [] cost = new int[n];
			for(int i = 0; i < n; i++){
				start[i] = sc.nextInt() - 1;
				end[i] = sc.nextInt();
				cost[i] = sc.nextInt();
			}
			
			int v = 366;
			MCF mcf = new MCF(v);
			for(int i = 0 ; i < n; i++){
				mcf.addEdge(start[i], end[i], 1, -cost[i]);
			}
			
			for(int i = 0; i < v-1; i++){
				mcf.addEdge(i, i + 1, 2, 0);
			}
			
			int res = mcf.minCostFlow(0,v-1, 2);
			System.out.println(-res);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}