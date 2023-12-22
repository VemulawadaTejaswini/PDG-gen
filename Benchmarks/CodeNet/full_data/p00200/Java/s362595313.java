import java.util.*;


public class Main {
	
	int n, m, k, start, goal, r;
	int[] a, b, cost, time;
	
	final int INF = Integer.MAX_VALUE;
	List<int[]>[] G, H;
	int[] min;
	
	int dijkstra(List<int[]>[] pos) {
		Queue<int[]> que = new LinkedList<int[]>();
		min[start] = 0;
		que.offer(new int[]{start, 0});
		
		while (!que.isEmpty()) {
			int[] p = que.poll();
			int from = p[0];
			if (min[from] < p[1]) continue;
			for (int[] e : pos[from]) {
				int to = e[0];
				int total = min[from] + e[1];
				if (total < min[to]) {
					min[to] = total;
					que.offer(new int[]{to, total});
				}
			}
		}
		return min[goal];
	}
	
	int solve() {
		min = new int[m + 1];
		Arrays.fill(min, INF);
		if (r == 0) {
			return dijkstra(G);
		} else {
			return dijkstra(H);
		}
	}
	
	@SuppressWarnings("unchecked")
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
				
				G = new ArrayList[m + 1]; 
				H = new ArrayList[m + 1];
				for (int i = 1; i < m + 1; i++) {
					G[i] = new ArrayList<int[]>();
					H[i] = new ArrayList<int[]>();
				}
				for (int i = 0; i < m + 1; i++) {
					G[a[i]].add(new int[] {b[i], cost[i]});
					G[b[i]].add(new int[] {a[i], cost[i]});
					H[a[i]].add(new int[] {b[i], time[i]});
					H[b[i]].add(new int[] {a[i], time[i]});
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

}