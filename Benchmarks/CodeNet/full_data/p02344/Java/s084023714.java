import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	class DisjointSet {
		
		int[] p, w, r;
		int size;
		
		public DisjointSet(int n) {
			size = n;
			p = new int[size];
			r = new int[size];
			w = new int[size];
			for (int i = 0; i < size; i++) makeSet(i);
		}

		private void makeSet(int x) {
			p[x] = x;
			w[x] = r[x] = 0;
		}
		
		private int findSet(int x) {
			if (p[x] != x) {
				int tmp = findSet(p[x]);
				w[x] += w[p[x]];
				p[x] = tmp;
			}
			return p[x];
		}
		
		public boolean same(int x, int y) {
			return findSet(x) == findSet(y);
		}
		
		public void relate(int x, int y, int z) {
			link(findSet(x), findSet(y), z - w[x] + w[y]);
		}

		private void link(int x, int y, int cost) {
			if (r[x] > r[y]) {
				p[y] = x;
				w[y] -= cost;
			} else {
				p[x] = y;
				w[x] += cost;
				if (r[x] == r[y]) {
					r[y]++;
				}
			}
		}
		
		public int sum(int x) {
			int sum = 0;
			int cur = x;
			while (cur != p[cur]) {
				sum += w[cur];
				cur = p[cur];
			}
			return sum;
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	public void run() throws IOException {
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
				int z = Integer.parseInt(st.nextToken());
				ds.relate(x, y, z);
			} else {
				if (ds.same(x, y)) {
					System.out.println(ds.sum(x) - ds.sum(y));
				} else {
					System.out.println("?");
				}
			}
		}
		reader.close();
	}
}

