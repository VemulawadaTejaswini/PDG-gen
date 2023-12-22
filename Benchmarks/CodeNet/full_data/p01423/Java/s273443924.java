import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// the number of rabbits
		int m = sc.nextInt();//
		long[][] g = new long[n][n];

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			long f = sc.nextLong();// the friendliness between u and v.
			g[u][v] = f;
			g[v][u] = f;
		}
		for(int i=0;i<n;i++){
			ArrayList<Integer> used=new ArrayList<>();
			used.add(i);
			dfs(used,g);
		}
		System.out.println(ans);
	}

	static long ans = 0;

	void dfs(ArrayList<Integer> used, long[][] g) {
		int n = g.length;
		if (used.size() > 1) {
			long tmp = 0;
			for (int v : used) {
				long min = 1L << 60;
				for (int u : used) {
					if (u == v)
						continue;
					min=Math.min(min, g[u][v]);
				}
				tmp+=min;
			}
			ans=Math.max(tmp, ans);
		}
		for (int i = used.get(used.size() - 1); i < n; i++) {
			int v = i;
			boolean f = true;
			for (int u : used) {
				if (g[u][v] == 0) {
					f = false;
					break;
				}
			}
			if (f) {
				used.add(v);
				dfs(used, g);
				used.remove(used.size() - 1);
			}
		}
	}

	class Edge {
		int from;
		int to;
		long friendliness;

		Edge(int from, int to, long friendliness) {
			this.from = from;
			this.to = to;
			this.friendliness = friendliness;
		}
	}
}