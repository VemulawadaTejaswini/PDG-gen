import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;

	int N, M;
	ArrayList<Integer>[] link;
	int ans[];
	int cost[];
	void doIt() {
		N = sc.nextInt();
		M = sc.nextInt();
		link = new ArrayList[N];
		ans = new int[N];
		Arrays.fill(ans, N + 1);
		cost = new int[N];
		Arrays.fill(cost, MAX);
		for(int i = 0; i < N; i++)link[i] = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			link[A].add(B);
			link[B].add(A);
		}
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.add(new Edge(0, 0, 0));
		while(!pq.isEmpty()) {
			
			Edge e = pq.poll();
			if(cost[e.to] <= e.cost)continue;
			cost[e.to] = e.cost;
			ans[e.to] = e.cur;
			for(int i : link[e.to]) {
				pq.add(new Edge(e.to, i, e.cost + 1));
			}
		}
		for(int i = 0; i < N; i++) {
			if(ans[i] >= N) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		for(int i = 1; i < N; i++) {
			System.out.println(ans[i] + 1);
		}
		
		
		
	}
	class Edge implements Comparable<Edge>{
		int cur, to;
		int cost;
		Edge(int cu, int t, int c){
			cur = cu; to = t; cost = c;
		}
		
		@Override
		public int compareTo(Edge arg0) {
			return this.cost - arg0.cost;
		}
		
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
