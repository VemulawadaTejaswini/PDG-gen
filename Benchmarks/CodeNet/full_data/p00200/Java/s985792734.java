import java.util.*;

public class Main {

	int n, m, k, start, goal, r;
	int[][] cost, time;
	
	final int INF = Integer.MAX_VALUE;
	
	void warshall(int[][] wf) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < m; k++) {
					if (wf[i][k] != INF && wf[k][j] != INF && wf[i][j] > wf[i][k] + wf[k][j]) {
						wf[i][j] = wf[i][k] + wf[k][j];
//					if (wf[j][i] != INF && wf[i][k] != INF && wf[j][k] > wf[j][i] + wf[i][k]) {
//						wf[j][k] = wf[j][i] + wf[i][k];
					}
				}
			}
		}
	}
	
	int solve() {
		if (r == 0) {
			return cost[start][goal];
		} else {
			return time[start][goal];
		}
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		String output = "";
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n == 0 && m == 0) {
				break;
			} else {
				cost = new int[m][m];
				time = new int[m][m];
				for (int i = 0; i < m; i++) {
					Arrays.fill(cost[i], INF);
					Arrays.fill(time[i], INF);
				}
				for (int i = 0; i < n; i++) {
					int a = sc.nextInt() - 1;
					int b = sc.nextInt() - 1;
					cost[a][b] = cost[b][a] = sc.nextInt();
					time[a][b] = time[b][a] = sc.nextInt();
				}
				for (int i = 0; i < m; i++) cost[i][i] = time[i][i] = 0;
				
				warshall(cost);
				warshall(time);
				
				k = sc.nextInt();
				for (int i = 0; i < k; i++) {
					start = sc.nextInt() - 1;
					goal = sc.nextInt() - 1;
 					r = sc.nextInt();
					output += solve() + "\n";
				}
			}
		}
		sc.close();
		System.out.print(output);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}