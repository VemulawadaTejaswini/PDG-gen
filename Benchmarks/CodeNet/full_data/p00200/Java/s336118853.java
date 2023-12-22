import java.util.*;


public class Main {
	
	int n, m, k, start, goal, r;
	int[] a, b, cost, time;
	
	final int INF = Integer.MAX_VALUE;
	List<Pair>[] G;
	int[] min;
	
	int dijkstra() {
		PriorityQueue<Pair> que = new PriorityQueue<Pair>();
		min[start] = 0;
		que.offer(new Pair(0, start)); // m:cost, n:station
		
		while (!que.isEmpty()) {
			Pair p = que.poll();
			int from = p.n;
			if (min[from] < p.m || from == goal) continue;
			for (int i = 0; i < G[from].size(); i++) {
				Pair n = G[from].get(i);
				int cost = n.m;
				int to = n.n;
				int total = min[from] + cost;
				if (total < min[to]) {
					min[to] = total;
					que.offer(new Pair(total, to));
				}
			}
		}
		return min[goal];
	}
	
	@SuppressWarnings("unchecked")
	int solve() {
		min = new int[m + 1];
		for (int i = 1; i < min.length; i++) {
			min[i] = INF;
		}
		
		G = new ArrayList[m + 1]; 
		for (int i = 1; i < G.length; i++) {
			G[i] = new ArrayList<Pair>();
		}
		
		if (r == 0) {
			for (int i = 0; i < G.length; i++) {
				G[a[i]].add(new Pair(cost[i], b[i]));
				G[b[i]].add(new Pair(cost[i], a[i]));
			}
			return dijkstra();
		} else {
			for (int i = 0; i < G.length; i++) {
				G[a[i]].add(new Pair(time[i], b[i]));
				G[b[i]].add(new Pair(time[i], a[i]));
			}
			return dijkstra();
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
	
	class Pair implements Comparable<Pair> {
		
		int m, n;
		
		Pair(int m, int n) {
			this.m = m;
			this.n = n;
		}

		@Override
		public int compareTo(Pair arg0) {
			return this.m - arg0.m;
		}
		
	}

}