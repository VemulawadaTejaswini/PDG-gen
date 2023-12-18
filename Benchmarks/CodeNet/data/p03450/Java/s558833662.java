
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Edge{
		int to;
		int cost;
		Edge(int to, int cost){
			this.to=to;
			this.cost=cost;
		}
	}
	ArrayList<ArrayList<Edge>> g = new ArrayList<>();
	boolean used[];
	int x[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		used = new boolean[n];
		x = new int[n];
		for(int i=0; i<n; i++) {
			g.add(new ArrayList<>());
		}
		for(int i=0; i<m; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			s--;t--;
			int c = sc.nextInt();
			g.get(s).add(new Edge(t, c));
			g.get(t).add(new Edge(s, -c));
		}

		for(int i=0; i<n; i++) {
			if(!used[i]) {
				dfs(i,0);
			}
		}

		for(int u=0; u<n; u++) {
			for(Edge e : g.get(u)) {
				if(x[e.to] != x[u]+e.cost) {
					System.out.println("No");
					sc.close();
					return;
				}
			}
		}
		System.out.println("Yes");
		sc.close();
	}

	public void dfs(int u, int dist) {
		x[u]=dist;
		used[u]=true;
		for(Edge e : g.get(u)) {
			if(!used[e.to]) {
				dfs(e.to, dist+e.cost);
			}
		}
	}
}
