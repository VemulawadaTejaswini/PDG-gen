
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Edge{
		int from;
		int to;
		public Edge(int from, int to) {
			this.from=from;
			this.to=to;
		}
	}
	ArrayList<ArrayList<Integer>> g = new ArrayList<>();
	ArrayList<Edge> es = new ArrayList<>();
	boolean used[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0; i<n; i++) {
			g.add(new ArrayList<>());
		}
		used = new boolean[n];
		for(int i=0; i<m ;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			a--; b--;
			g.get(a).add(b);
			g.get(b).add(a);
			es.add(new Edge(a,b));
		}

		int ans = 0;
		for(Edge e : es) {
			int a =e.from;
			int b =e.to;
			for(int i=0 ;i<n; i++) {
				used[i]=false;
			}
			int cnt = dfs(0, a, b);
			if(cnt != n) {
				ans++;
			}

		}
		System.out.println(ans);

		sc.close();
	}

	private int dfs(int p, int a, int b) {
		used[p]=true;
		int cnt = 1;
		for(int v : g.get(p)) {
			if((p==a && v==b) || (p==b && v==a)) continue;
			if(!used[v]) {
				cnt += dfs(v,a,b);
			}
		}
		return cnt;
	}
}
