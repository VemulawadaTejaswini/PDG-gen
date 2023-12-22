import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	
	int n, m, p, a, b;
	double[] t;
	double[][] edge;
	double[][] minCost;
	
	int INF = 100000000;
	
	class State implements Comparable<State> {
		int chicket, node;
		
		State(int c, int n) {
			chicket = c;
			node = n;
		}
	
		public int compareTo(State s) {
			double c1 = minCost[chicket][node], c2 = minCost[s.chicket][s.node];
			if (c1 > c2) return 1;
			else if (c1 < c2) return -1;
			else return 0;
		}
	}
	
	void dijkstra(int start) {
		minCost = new double[(1<<n)][m];
		for (int i = 0; i < (1<<n); i++) 
			Arrays.fill(minCost[i], INF);
		minCost[(1<<n)-1][start] = 0;
		
		PriorityQueue<State> pq = new PriorityQueue<State>();
		pq.add(new State((1<<n) - 1, start));
		
		while (!pq.isEmpty()) {
			State s = pq.poll();
			for (int i = 0; i < m; i++) {
				if (edge[i][s.node] == INF) continue;
				for (int j = 0; j < n; j++) {
					if (((s.chicket >> j) & 1) == 1) {
						int x = ((1 << n) - 1) ^ (1 << j);
						int newChicket = s.chicket & x;
						if (minCost[newChicket][i] > minCost[s.chicket][s.node] + (double)edge[i][s.node] / t[j]) {
							minCost[newChicket][i] = minCost[s.chicket][s.node] + (double)edge[i][s.node] / t[j];
							pq.add(new State(newChicket, i));
						}
					}
				}
			}
		}
		
	}
	
	void run() {
		while (true) {
			n = in.nextInt(); m = in.nextInt(); p = in.nextInt(); a = in.nextInt() - 1; b = in.nextInt() - 1;
			if (n == 0) break;
			
			t = new double[n];
			for (int i = 0; i < n; i++)
				t[i] = in.nextInt();
			
			edge = new double[m][m];
			for (int i = 0; i < m; i++)
				Arrays.fill(edge[i], INF);
			for (int i = 0; i < p; i++) {
				int x = in.nextInt() - 1, y = in.nextInt() - 1, z = in.nextInt();
				edge[x][y] = edge[y][x] = z;
			}
			
			dijkstra(a);
			
			double res = INF;
			for (int i = 0; i < (1<<n); i++) {
				res = Math.min(res, minCost[i][b]);
			}
			System.out.println(res == INF ? "Impossible" : res);
		}
	}
	
	public static void main(String args[]) {
		new Main().run();
	}
}