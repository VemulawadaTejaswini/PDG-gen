
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static List<List<Integer>> graph;
	static boolean[] visited;
	static int count;
	
	public static void main(String args[]) throws Exception {

		PrintWriter pr = new PrintWriter(System.out);
		MyScanner sc = new MyScanner();

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		graph = new ArrayList<>(n + 1);
		visited = new boolean[n + 1];
		
		for(int i = 0; i <= n; i++)
			graph.add(new ArrayList<>());
		
		for(int i = 0; i < m; i++) {
			
			int u = sc.nextInt();
			int v = sc.nextInt();
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		int ans = Integer.MIN_VALUE;
		
		for(int i = 1; i <= n; i++) {
			
			if(!visited[i]) {
				
				count = 0;
				dfs(i);
				ans = Math.max(ans, count);
			}
		}
		
		pr.print(ans);
		pr.close();
	}

	private static void dfs(int i) {
		
		visited[i] = true;
		count++;
		
		for(int neighbour : graph.get(i)) {
			
			if(!visited[neighbour])
				dfs(neighbour);
		}
		
	}

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}