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
	boolean used[];
	boolean ans=true;
	int d[];
	int INF = 10000*2000000+1;
	ArrayList<ArrayList<Edge>> g = new ArrayList<ArrayList<Edge>>();
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		d = new int[n];
		used = new boolean[n];
		for(int i=0; i<n; i++) g.add(new ArrayList<Edge>());
		for(int i=0; i<n; i++) d[i]=INF;
		for(int i=0; i<m; i++) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int d=sc.nextInt();
			l--;r--;
			g.get(l).add(new Edge(r,d));
			g.get(r).add(new Edge(l,-d));
		}
		for(int i=0; i<n; i++) {
			if(!used[i]) {
				dfs(i);
			}
		}
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		sc.close();
	}

	private void dfs(int r) {
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(r);
		while(!stack.isEmpty()) {
			int u=stack.pop();
			for(Edge e : g.get(u)) {
				if(!used[e.to]) {
					d[e.to] = d[u]+e.cost;
					used[e.to]=true;
					stack.push(e.to);
				}else {
					if(d[e.to] != d[u]+e.cost) {
						ans = false;
					}
				}
			}
		}
	}
}
