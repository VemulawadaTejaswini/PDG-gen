import java.util.*;

public class Main {

	static class Unionfind{
		private int par[];
		private int rank[];
		private int size[];
		
		public Unionfind(int n) {
			par = new int[n + 1];
			rank = new int[n + 1];
			size = new int[n + 1];
			for (int i = 0; i <= n; ++i) {
				par[i] = i;
				rank[i] = 0;
				size[i] = 1;
			}
		}

		public int size(int x){
			int rx = root(x);
			return size[x] = size[rx];
		}

		public int root(int x) {
			if (par[x] != x)
				par[x] = root(par[x]);
			return par[x];
		}
	
		public void unite(int x, int y) {
			int rx = root(x);
			int ry = root(y);
			int sx = size[rx];
			int sy = size[ry];
			if (rank[rx] < rank[ry]){
				par[rx] = ry;
				size[ry] = sx + sy;
			}
			else if (rank[ry] < rank[rx]) {
				par[ry] = rx;
				size[rx] = sx + sy;
			} else if (rx != ry) {
				par[ry] = rx;
				size[rx] = sx + sy;
				rank[rx]++;
			}
		}
	
		public boolean isSame(int x, int y) {
			int rx = root(x);
			int ry = root(y);
			return rx == ry;
		}
	}

	static Unionfind uniontree;

	public static class Graph {
		List<Integer> friend = new ArrayList<Integer>();
		List<Integer> block = new ArrayList<Integer>();
		int number;

		public Graph(int num){
			number = num;
		}

		public void addfriend(int b) {
			friend.add(b);
		}

		public void addblock(int b) {
			if(uniontree.isSame(number, b))
			block.add(b);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		Graph graph[] = new Graph[n + 1];
		uniontree = new Unionfind(n);
		for (int i = 0; i <= n; ++i)
			graph[i] = new Graph(i);
		for (int i = 0; i < m; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].addfriend(b);
			graph[b].addfriend(a);
			uniontree.unite(a, b);
		}
		for (int i = 0; i < k; ++i) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			graph[c].addblock(d);
			graph[d].addblock(c);
		}
		sc.close();
		for (int i = 1; i <= n; ++i) {
			int num = uniontree.size(i) - (graph[i].friend.size() + graph[i].block.size()) - 1;
			// int num = uniontree.size(i);
			System.out.print(num + " ");
		}
	}
}
