import java.util.*;
import java.io.*;


public class prop {
	static Scanner sc;
	static PrintWriter pw;
	static final int INF = (int) 1e9; // don't increase, avoid overflow
	static ArrayList<Edge>[] adjList;
	static int V, n, m, k;
	static char c[][];
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	
	static int dijkstra(pair S, pair T) // O(E log E)
	{
		int[][][] dist = new int[4][n][m];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dist[0][i], INF);
			Arrays.fill(dist[1][i], INF);
			Arrays.fill(dist[2][i], INF);
			Arrays.fill(dist[3][i], INF);
		}
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		dist[0][S.x][S.y] = 0;
		dist[1][S.x][S.y] = 0;
		dist[2][S.x][S.y] = 0;
		dist[3][S.x][S.y] = 0;
		pq.add(new Edge(S, 0, 0, -1)); // may add more in case of MSSP (Mult-Source)
		while (!pq.isEmpty()) {
			Edge cur = pq.remove();
			if (cur.node.x == T.x && cur.node.y == T.y) { // remove if all computations are needed
				return cur.cost;

			}
			for (int i = 0; i < 4; i++) {
				int x = cur.node.x + dx[i];
				int y = cur.node.y + dy[i];
				if (valid(x, y)) {
					if (cur.w == i && cur.c < k) {
						if (cur.cost < dist[i][x][y])
							pq.add(new Edge(new pair(x, y), dist[i][x][y] = cur.cost, cur.c + 1, i));
					} else {
						if (cur.cost + 1 < dist[i][x][y])
							pq.add(new Edge(new pair(x, y), dist[i][x][y] = cur.cost + 1, 1, i));
					}
				}
			}

		}
		return -1;
	}

//	/*
//	 * 1. Dijkstra's Algorithm for SSSP on weighted graphs
//	 */
//	static int dijkstra(pair S, pair T) // O(E log E)
//	{
//		int[][] dist = new int[n][m];
//		for (int i = 0; i < n; i++) {
//			Arrays.fill(dist[i], INF);
//		}
//		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
//		dist[S.x][S.y] = 0;
//		pq.add(new Edge(S, 0, 0, -1)); // may add more in case of MSSP (Mult-Source)
//		while (!pq.isEmpty()) {
//			Edge cur = pq.remove();
//			if (cur.node.x == T.x && cur.node.y == T.y) { // remove if all computations are needed
//				return cur.cost;
//			}
//			if (cur.cost > dist[cur.node.x][cur.node.y]) // lazy deletion
//				continue;
//			ArrayList<Edge> temp=new ArrayList<>();
//			boolean f = true;
//			for (int i = 0; i < 4; i++) {
//				int x = cur.node.x + dx[i];
//				int y = cur.node.y + dy[i];
//				if (valid(x, y)) {
//					if (cur.w == i && cur.c < k) {
//						if (cur.cost < dist[x][y]) {
//							pq.add(new Edge(new pair(x, y), dist[x][y] = cur.cost, cur.c + 1, i));
//							f = false;
//						}
//						if (cur.cost == dist[x][y])
//							temp.add(new Edge(new pair(x, y), dist[x][y] = cur.cost, cur.c + 1, i));
//
//					} else {
//						if (cur.cost + 1 < dist[x][y]) {
//							f = false;
//							pq.add(new Edge(new pair(x, y), dist[x][y] = cur.cost + 1, 1, i));
//						}
//						if (cur.cost + 1 == dist[x][y])
//							temp.add(new Edge(new pair(x, y), dist[x][y] = cur.cost + 1, 1, i));
//					}
//				}
//			}
//			
//				for(Edge e:temp) {
//				if (e.cost <= dist[e.node.x][e.node.y])
//					pq.add(e);
//			}
//
//		}
//
//		return -1;
//	}

	static class Edge implements Comparable<Edge> {
		pair node;
		int cost, c, w;

		Edge(pair a, int b, int q, int e) {
			node = a;
			cost = b;
			c = q;
			w = e;
		}

		public int compareTo(Edge e) {
			return cost - e.cost;
		}
	}

	static boolean valid(int i, int j) {
		return (i < n && i >= 0 && j >= 0 && j < m && c[i][j] == '.');
	}

	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);
		pw = new PrintWriter(System.out);
		n = sc.nextInt();
		m = sc.nextInt();
		V = n * m;
		k = sc.nextInt();

		int is = sc.nextInt() - 1;
		int js = sc.nextInt() - 1;
		int it = sc.nextInt() - 1;
		int jt = sc.nextInt() - 1;
		c = new char[n][m];
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().toCharArray();
		}

		pw.print(dijkstra(new pair(is, js), new pair(it, jt)));
		pw.flush();
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////
	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}

	public static int log(int n, int base) {
		int ans = 0;
		while (n + 1 > base) {
			ans++;
			n /= base;
		}
		return ans;
	}

	static int pow(int b, long e) {
		int ans = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				ans = (int) ((ans * 1l * b));
			e >>= 1;
			{

			}
			b = (int) ((b * 1l * b));
		}
		return ans;
	}

	static int powmod(int b, long e, int mod) {
		int ans = 1;
		b %= mod;
		while (e > 0) {
			if ((e & 1) == 1)
				ans = (int) ((ans * 1l * b) % mod);
			e >>= 1;
			b = (int) ((b * 1l * b) % mod);
		}
		return ans;
	}

	static class pair implements Comparable<pair> {
		int x, y;

		pair(int s, int d) {
			x = s;
			y = d;
		}

		@Override
		public int compareTo(pair p) {
			if (x == p.x)
				return y - p.y;
			return x - p.x;
		}

		@Override
		public String toString() {
			return x + " " + y;

		}
	}

	static int ceil(int a, int b) {
		int ans = a / b;
		return a % b == 0 ? ans : ans + 1;
	}

	static long ceil(long a, long b) {
		long ans = a / b;
		return a % b == 0 ? ans : ans + 1;
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public int[] intArr(int n) throws IOException {
			int a[] = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
			}
			return a;
		}

		public long[] longArr(int n) throws IOException {
			long a[] = new long[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
			}
			return a;
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}

	public static void shuffle(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			int tmp = a[i];
			a[i] = a[r];
			a[r] = tmp;
		}
	}

}