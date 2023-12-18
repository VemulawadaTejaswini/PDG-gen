import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static List<Integer> adj[];
	static int[] dist;
	
	static void calc(int node, int parent) {
		for (int neigh : adj[node]) if (neigh != parent) {
			dist[neigh] = dist[node] + 1;
			calc(neigh, node);
		}
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		N = sc.nextInt();
		adj = new List[N];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<>();
		}
		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			adj[a].add(b);
			adj[b].add(a);
		}
		dist = new int[N];
		dist[0] = 0;
		calc(0, -1);
		int bestI = -1;
		for (int i = 0; i < N; i++) {
			if (bestI == -1 || dist[bestI] < dist[i]) {
				bestI = i;
			}
		}
		dist[bestI] = 0;
		calc(bestI, -1);
		int diameter = Arrays.stream(dist).max().getAsInt() + 1;
		out.println(diameter % 3 == 2 ? "Second" : "First");
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
