import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int[][] cost = new int[100][100];
	boolean[] used = new boolean[100];
	int n;
	int INF = Integer.MAX_VALUE/2;
	void dfs(int k) {
		used[k] = true;
		for (int i = 0; i < n; i++) {
			if (!used[i] && cost[k][i] < INF) {
				dfs(i);
			}
		}
	}
	
	void run() {
		int[] mincost = new int[100];
		int[] prev = new int[100];
		Queue<Integer> que = new LinkedList<Integer>();
		W:while (true) {
			n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++)
					cost[i][j] = INF;
				used[i] = false;
			}
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt()-1, b = sc.nextInt()-1, w = sc.nextInt();
				cost[a][b] = cost[b][a] = w;
			}
			
			dfs(0);
			for (int i = 0; i < n; i++) {
				if (!used[i]) {
					out.println(-1);
					continue W;
				}
			}
			que.clear();
			for (int i = 0; i < n; i++)
				if (cost[0][i] < INF)
					que.add(i);
			
			int res = Integer.MAX_VALUE/2;
			while (!que.isEmpty()) {
				int t = que.poll();
				int max, min;
				max = min = cost[0][t];
				for (int i = 0; i < n; i++) {
					mincost[i] = INF;
					used[i] = false;
				}
				used[0] = used[t] = true;
				for (int i = 0; i < n; i++) {
					if (cost[0][i] < INF) {
						if (mincost[i] > abs(cost[0][i]-max)) {
							prev[i] = 0;
							mincost[i] = abs(cost[0][i]-max);
						}
					}
					if (cost[t][i] < INF) {
						if (mincost[i] > abs(cost[t][i]-max)) {
							prev[i] = t;
							mincost[i] = abs(cost[t][i]-max);
						}
					}
 				}
				
				while (true) {
					int v = -1;
					for (int i = 0; i < n; i++) {
						if (!used[i] && (v == -1 || mincost[i] < mincost[v]))
							v = i;
					}
					
					if (v == -1) break;
					used[v] = true;
					min = min(min, cost[prev[v]][v]);
					max = max(max, cost[prev[v]][v]);
					
					for (int i = 0; i < n; i++) {
						if (used[i]) {
							for (int j = 0; j < n; j++) {
								if (!used[j]) {
									int d = (min <= abs(cost[i][j]) && abs(cost[i][j]) <= max) ? 0 : min(abs(cost[i][j]-min), abs(cost[i][j]-max));
									if (d < mincost[j]) {
										mincost[j] = d;
										prev[j] = i;
									}
								}
							}
						}
					}
				}
				
				res = min(res, max-min);
			}
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}