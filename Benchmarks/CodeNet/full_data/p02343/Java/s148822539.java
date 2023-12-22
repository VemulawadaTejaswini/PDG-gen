import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	class Node {
		int parent;
		public Node(int x) {
			this.parent = x;
		}
	}
	
	class DisjointSet {
		Node[] p;
		int[] rank;
		
		public DisjointSet(int size) {
			p = new Node[size];
			rank = new int[size];
			for (int i = 0; i < size; i++) {
				makeSet(i);
			}
		}

		private void makeSet(int x) {
			p[x] = new Node(x);
			rank[x] = 0;
		}
		
		private int findSet(int x) {
			while (x != p[x].parent) {
				x = p[x].parent;
			}
			return x;
		}
		
		public boolean same(int x, int y) {
			return findSet(x) == findSet(y);
		}
		
		public void unite(int x, int y) {
			link(findSet(x), findSet(y));
		}

		private void link(int x, int y) {
			if (rank[x] > rank[y]) {
				p[y].parent = x;
			} else {
				p[x].parent = y;
				if (rank[x] == rank[y]) {
					rank[x]++;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		DisjointSet ds = new DisjointSet(n);
		int q = Integer.parseInt(st.nextToken());
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(reader.readLine());
			int c = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if (c == 0) {
				ds.unite(x, y);
			} else {
				System.out.println(ds.same(x, y)?"1":"0");
			}
		}
		reader.close();
	}
}
