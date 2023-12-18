import java.util.*;
public class Main {

	static class Edge{
		int x, y, c;
		Edge(int x, int y, int c){
			this.x = x;
			this.y = y;
			this.c = c;
		}
	}
	
	public static class unionfind{
		int[] parent;
		int[] rank;
		public unionfind(int n){
			this.parent = new int[n+1];
			this.rank = new int[n+1];
			for(int i = 1; i <= n; i++) set(i);
		}
		public void set(int i) {
			parent[i] = i;
			rank[i] = 0;
		}
		public int find(int i) {
			if (i == parent[i])
				return parent[i];
			else
				return parent[i] = find(parent[i]);
			
		}
		public boolean same(int x, int y){
			return find(x) == find(y);
		}
		public void unite(int x, int y) {
			int xroot = find(x);
			int yroot = find(y);
			if(xroot == yroot)
				return;
			if(rank[xroot] > rank[yroot])
				parent[yroot] = xroot;
			else if(rank[xroot] < rank[yroot])
				parent[xroot] = yroot;
			else {
				parent[yroot] = xroot;
				rank[xroot]++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] c = new int[N][3];
		for(int i = 0; i < N; i++) {
			c[i][0] = i;
			c[i][1] = sc.nextInt();
			c[i][2] = sc.nextInt();
		}
		PriorityQueue<Edge> pq = new PriorityQueue<>((p1,p2)->Integer.compare(p1.c,p2.c));
		Arrays.sort(c, (x, y) -> x[1] - y[1]);
		for(int i = 1; i < N; i++)
			pq.add(new Edge(c[i][0], c[i-1][0], c[i][1]-c[i-1][1]));
		Arrays.sort(c, (x, y) -> x[2] - y[2]);
		for(int i = 1; i < N; i++)
			pq.add(new Edge(c[i][0], c[i-1][0], c[i][2]-c[i-1][2]));
		long ans = 0;
		unionfind u = new unionfind(N);
		while(pq.size() > 0) {
			Edge e = pq.poll();
			if(!u.same(e.x, e.y)) {
				u.unite(e.x, e.y);
				ans += e.c;
			}
		}
		System.out.println(ans);
	}

}