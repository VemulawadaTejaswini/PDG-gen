import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	
	int n, m;
	
	int[][] edge;
	double[][][] minCost;
	int[][] maxSpeed;	
	
	double INF = 100000000;
	
	class State implements Comparable<State> {
		int n, speed, prev;

		State(int n, int speed, int prev) {
			this.n = n;
			this.speed = speed;
			this.prev = prev;
		}
		
		@Override
		public int compareTo(State arg0) {
			double c1 = minCost[n][prev][speed], c2 = minCost[arg0.n][arg0.prev][arg0.speed];
			if (c1 > c2) return 1;
			else if (c1 < c2) return -1;
			else return 0;
		}
	}
	
	void dijkstra(int start) {
		minCost = new double[n][n][31];
		for (int i = 0; i < n; i++) for (int j = 0; j < n; j++)
			Arrays.fill(minCost[i][j], INF);
		
		minCost[start][start][0] = 0;
		PriorityQueue<State> pq = new PriorityQueue<State>();
		pq.add(new State(start, 0, start));
		
		while (!pq.isEmpty()) {
			State s = pq.poll();
			for (int i = 0; i < n; i++) {
				if (edge[s.n][i] == INF) continue;
				if (s.prev == i) continue;
				int c = s.speed;
				for (int v = -1; v <= 1; v++) {
					if (c+v > 0 && c+v <= maxSpeed[i][s.n] && minCost[i][s.n][c+v] > minCost[s.n][s.prev][c] + (double)edge[i][s.n] / (c+v)) {
						minCost[i][s.n][c+v] = minCost[s.n][s.prev][c] + (double)edge[i][s.n] / (c+v);
						pq.add(new State(i, c+v, s.n));
					}
				}
			}
		}
		
		
	}
	
	void run() {
		while (true) {
			n = in.nextInt(); m = in.nextInt();
			if (n == 0) break;
			
			int s = in.nextInt() - 1, g = in.nextInt() - 1;

			maxSpeed = new int[n][n];
			edge = new int[n][n];
			
			for (int i = 0; i < m; i++) {
				int x = in.nextInt() - 1, y = in.nextInt() - 1, d = in.nextInt(), c = in.nextInt();
				edge[x][y] = edge[y][x] = d;
				maxSpeed[x][y] = maxSpeed[y][x] = c;
			}
			
			dijkstra(s);
			
			double res = INF;
			for (int i = 0; i < n; i++)
				res = Math.min(minCost[g][i][1], res);
			
			/*
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < 5; j++)
					System.out.print(minCost[i][j] + " ");
				System.out.println();
			}
			*/
			
			System.out.println(res == INF ? "unreachable" : res);
		}
	}
	
	public static void main(String args[]) {
		new Main().run();
	}
}