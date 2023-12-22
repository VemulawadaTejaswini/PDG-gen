import java.util.*;

public class Main {
	
	static int gcd(int x, int y) {
		if(x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		while(y > 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		return x;
	}
	
	static int bipartiteMatching(boolean[][] can) {
		// 0..m-1 blue
		// m..m+n-1 red
		int m = can.length; // number of blue
		int n = can[0].length; // number of red
		int s = n + m, t = s+1;
		initGraph(m+n+2);
		// s to blue
		for(int i=0; i<m; i++) {
			addEdge(s, i, 1);
		}
		// red to t
		for(int i=0; i<n; i++) {
			addEdge(m+i, t, 1);
		}
		// blue to red
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(can[i][j]) {
					addEdge(i, m+j, 1);
				}
			}
		}
		return maxFlow(s, t);
	}
	
	// from MaxFlowFordFulkerson.java
	static int MAX_V = 1000;
	static int INF = 10000000;
	static ArrayList<ArrayList<Edge>> G = new ArrayList<ArrayList<Edge>>(MAX_V);
	static boolean[] used = new boolean[MAX_V];
	
	static void addEdge(int from, int to, int cap) {
		G.get(from).add(new Edge(to, cap, G.get(to).size()));
		G.get(to).add(new Edge(from, 0, G.get(from).size()-1));
	}
	
	static int dfs(int v, int t, int f) {
		if(v==t) return f;
		used[v] = true;
		for(int i=0; i<G.get(v).size(); i++) {
			Edge e = G.get(v).get(i);
			if(!used[e.to] && e.cap > 0) {
				int d = dfs(e.to, t, Math.min(f, e.cap));
				if(d>0) {
					e.cap -= d;
					G.get(e.to).get(e.rev).cap += d;
					return d;
				}
			}
		}
		return 0;
	}
	
	static int maxFlow(int s, int t) {
		int flow = 0;
		for(;;) {
			Arrays.fill(used, false);
			int f = dfs(s, t, INF);
			if(f==0) return flow;
			flow += f;
		}
	}
	
	static void initGraph(int maxV) {
		for(int i=0; i<maxV; i++) {
			G.add(new ArrayList<Edge>());
		}
	}
	
	static void resetGraph() {
		G = new ArrayList<ArrayList<Edge>>(MAX_V);
		used = new boolean[MAX_V];
	}
	
	static class Edge {
		int to, cap, rev;
		Edge(int to, int cap, int rev) {
			this.to = to; this.cap = cap; this.rev = rev;
		}
	}
	
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		String ans = "";
		while(!(n==0 && m==0)) {
			boolean[][] can = new boolean[m][n];
			int[] b = new int[m];
			int[] r = new int[n];
			for(int i=0; i<m; i++) b[i] = sc.nextInt();
			for(int i=0; i<n; i++) r[i] = sc.nextInt();
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(gcd(b[i], r[j]) > 1) can[i][j] = true;
					else can[i][j] = false;
				}
			}
			ans += (bipartiteMatching(can)) + "\n";
			resetGraph();
			m = sc.nextInt(); n = sc.nextInt();
		}
		System.out.println(ans);
	}
}

