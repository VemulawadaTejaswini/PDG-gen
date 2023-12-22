import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);

	int N, M;
	int[][] edge;
	
	int INF = 100000000;
	
	class Island implements Comparable<Island> {
		int sink, id;
		Island(int id, int sink) {
			this.id = id;
			this.sink = sink;
		}
		
		public int compareTo(Island island) {
			int c1 = sink, c2 = island.sink;
			return c2 - c1;
		}
	}
	
	class Edge implements Comparable<Edge> {
		int x, y;
		Edge(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int compareTo(Edge e) {
			int c1 = edge[x][y], c2 = edge[e.x][e.y];
			return c1 - c2;
		}
	}
	
	UnionFindTree uft;
	ArrayList<Integer> iList = new ArrayList<Integer>();
	long res = 0;
	
	void prim() {
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		for (int i = 0; i < iList.size(); i++) {
			for (int j = i+1; j < iList.size(); j++) {
				int x = iList.get(i), y = iList.get(j);
				pq.add(new Edge(x, y));
			}
		}
		
		while (!pq.isEmpty()) {
			Edge e = pq.poll();
			if (edge[e.x][e.y] != INF && !uft.same(e.x, e.y)) {
				uft.unite(e.x, e.y);
				res += edge[e.x][e.y];
			}
		}
	}

	class UnionFindTree {
		int[] parent;
		
		public UnionFindTree(int n) {
			parent = new int[n];
			init();
		}
		
		void init() {
			for (int i = 0; i < parent.length; i++)
				parent[i] = i;	
		}
		
		public int find(int x) {
			if (parent[x] == x) return x;
			return parent[x] = find(parent[x]);
		}
		
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
		
		public void unite(int x, int y) {
			int xx = find(x), yy = find(y);
			if (xx == yy) return;
			parent[xx] = yy;
		}
	}
	
	public void run() {
		while (true) {
			iList.clear();
			N = in.nextInt(); M = in.nextInt();
			if (N == 0) break;
			
			Island[] islands = new Island[N];
			for (int i = 0; i < N; i++) {
				int sink = in.nextInt();
				islands[i] = new Island(i, sink);
			}
			
			edge = new int[N][N];
			for (int i = 0; i < N; i++) Arrays.fill(edge[i], INF);
			
			for (int i = 0; i < M; i++) {
				int a = in.nextInt() - 1, b = in.nextInt() - 1, c = in.nextInt();
				edge[a][b] = edge[b][a] = c;
			}
			
			Arrays.sort(islands);
			
			int idx = 0, sink = -1;
			res = 0;
			uft = new UnionFindTree(N);
			
			while (idx < N) {
				Island il = islands[idx++];
				if (sink != -1 && sink != il.sink) {
					prim();
					for (int i = 1; i < iList.size(); i++) {
						int z = iList.get(0);
						if (!uft.same(z, iList.get(i))) {
							res = 0;
							uft.init();
							break;
						}
					}
				}
				sink = il.sink; iList.add(il.id);
			}
			prim();
			for (int i = 1; i < iList.size(); i++) {
				int z = iList.get(0);
				if (!uft.same(z, iList.get(i))) {
					res = 0;
					uft.init();
					break;
				}
			}
			
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}