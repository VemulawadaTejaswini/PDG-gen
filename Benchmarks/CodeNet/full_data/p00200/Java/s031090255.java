import java.util.*;


public class Main {
	
	int n, m, k, start, goal, r;
	int[] a, b, cost, time;
	
	final int INF = Integer.MAX_VALUE;
	Edge[] esc, est;
	int[] min;
	
	int shortestPath(Edge[] es) {
		min[start] = 0;
		
		while (true) {
			boolean update = false;
			for (int i = 0; i < n * 2; i++) {
				Edge e = es[i];
				int cost = min[e.from] + e.cost;
				if (min[e.from] != INF && cost < min[e.to]) {
					min[e.to] = cost;
					update = true;
				}
			}
			if (!update) break;
		}
		return min[goal];
	}
	
	int solve() {
		min = new int[m + 1];
		Arrays.fill(min, INF);
		if (r == 0) {
			return shortestPath(esc);
		} else {
			return shortestPath(est);
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
				a = new int[n];
				b = new int[n];
				cost = new int[n];
				time = new int[n];
				for (int i = 0; i < n; i++) {
					a[i] = sc.nextInt();
					b[i] = sc.nextInt();
					cost[i] = sc.nextInt();
					time[i] = sc.nextInt();
				}
				esc = new Edge[n * 2];
				est = new Edge[n * 2];
				for (int i = 0; i < n; i++) { 
					esc[i] = new Edge(a[i], b[i], cost[i]);
					est[i] = new Edge(a[i], b[i], time[i]);
				}
				for (int i = n; i < n * 2; i++) { 
					esc[i] = new Edge(b[i - n], a[i - n], cost[i - n]);
					est[i] = new Edge(b[i - n], a[i - n], time[i - n]);
				}
				k = sc.nextInt();
				for (int i = 0; i < k; i++) {
					start = sc.nextInt();
					goal = sc.nextInt();
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
	
	class Edge {
		
		int from, to, cost;
		
		Edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
		
	}

}