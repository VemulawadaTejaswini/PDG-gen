import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.*;

public class Main {

	List<Integer>[] graph;
	int[] col;
	boolean fail = false;
	
	void dfs(int u, int c){ 
		col[u] = c;
		for (int v : graph[u]) {
			if (col[v] == -1) {
				dfs(v, 1 - c);
			} else if (col[v] == col[u]) {
				fail = true;
			}
		}
	}
	
	void solve() {
		int n = in.nextInt();
		graph = new List[n];
		for (int i  =0; i < n; i++) {
			graph[i] = new ArrayList<>();
		}
		int m = in.nextInt();
		for (int  i= 0; i < m; i++) {
			int from = in.nextInt() - 1, to = in.nextInt() - 1;
			graph[from].add(to);
			graph[to].add(from);
		}
		col = new int[n];
		Arrays.fill(col, -1);
		dfs(0, 0);
		if (fail) {
			out.println(1L * n * (n - 1) / 2 - m);
		} else {
			long c = IntStream.of(col).filter(x -> (x == 0)).count();
			out.println(1L * c * (n - c) - m);
		}
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
