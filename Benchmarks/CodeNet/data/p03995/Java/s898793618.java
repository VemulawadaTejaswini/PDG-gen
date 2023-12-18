import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;
	
	static class Edge {
		int to, val;

		public Edge(int to, int val) {
			this.to = to;
			this.val = val;
		}
	}
	
	List<Edge>[] g;
	
	static final long INF = Long.MAX_VALUE / 10;
	
	long minD1;
	long minD2;
	
	
	int[] base;
	long[] delta;
	
	boolean dfs(int v, int root, long rootDelta) {
		
		if (v < r) {
			minD1 = Math.min(minD1, rootDelta);
		} else {
			minD2 = Math.min(minD2, rootDelta);
		}
		
		base[v] = root;
		delta[v] = rootDelta;
		for (Edge e : g[v]) {
			if (base[e.to] == -1) {
				if (!dfs(e.to, root, e.val - rootDelta)) {
					return false;
				}
			} else {
				if (rootDelta + delta[e.to] != e.val) {
					return false;
				}
			}	
		}
		return true;
	}
	
	int r, c;

	void solve() throws IOException {
		r = nextInt();
		c = nextInt();
		int n = nextInt();
		
		g = new List[r + c];
		for (int i = 0; i < r + c; i++) {
			g[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < n; i++) {
			int x = nextInt() - 1;
			int y = nextInt() - 1;
			int val = nextInt();
			g[x].add(new Edge(y + r, val));
			g[y + r].add(new Edge(x, val));
		}
		
		base = new int[r + c];
		delta = new long[r + c];
		
		Arrays.fill(base, -1);
		
		for (int i = 0; i < r + c; i++) {
			if (base[i] == -1) {
				minD1 = INF;
				minD2 = INF;
				if (!dfs(i, i, 0)) {
					out.println("No");
					return;
				}
				if (minD1 + minD2 < 0) {
					out.println("No");
					return;
				}
			}
		}
		
		out.println("Yes");
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		
		Thread t = new Thread(null, new Runnable() {

			@Override
			public void run() {
				try {
					solve();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "pls", 1 << 26);
		
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}