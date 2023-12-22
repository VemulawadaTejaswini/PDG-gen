import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n+1; i++) {
			G.add(new ArrayList<Edge>());
		}
		used = new boolean[n+1];
		int[] c = new int[n];
		for(int i = 1; i < n; i++) {
			c[i] = sc.nextInt();
			if(c[i] != 0) {
				add_edge(i,n,INF);
			}
		}
		for(int i = 0; i < n-1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int p = sc.nextInt();
			add_edge(u,v,p);
		}
		int ans = max_flow(0,n);
		System.out.println(ans);
		
	}
	static class Edge {
		int to;
		int cap;
		int rev;
		Edge(int a, int b, int c) {
			to = a;
			cap = b;
			rev = c;
		}
	}
	static ArrayList<ArrayList<Edge>> G = new ArrayList<ArrayList<Edge>>();
	static boolean[] used;
	
	static void add_edge(int from, int to, int cap) {
		G.get(from).add(new Edge(to,cap,G.get(to).size()));
		G.get(to).add(new Edge(from,0,G.get(from).size()-1));
	}
	
	static int dfs(int v, int t, int f) {
		if(v == t) return f;
		used[v] = true;
		for(int i = 0; i < G.get(v).size(); i++) {
			Edge e = G.get(v).get(i);
			if(!used[e.to] && e.cap > 0) {
				int d = dfs(e.to,t,Math.min(f,e.cap));
				if(d > 0) {
					e.cap -= d;
					G.get(e.to).get(e.rev).cap += d;
					return d;
				}
			}
		}
		return 0;
	}
	
	static int max_flow(int s, int t) {
		int flow = 0;
		for(;;) {
			Arrays.fill(used, false);
			int f = dfs(s,t,INF);
			if(f == 0) return flow;
			flow += f;
		}
	}
	
	
	
}