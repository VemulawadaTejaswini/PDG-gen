import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		boolean[][] adj = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			char[] tmp = sc.next().toCharArray();
			for (int j = 0; j < N; j++) {
				adj[i][j] = tmp[j] == '1';
			}
		}
		int ans = -1;
		for (int i = 0; i < N; i++) {
			int[] dist = new int[N];
			Arrays.fill(dist, -1);
			Deque<Integer> queue = new ArrayDeque<>();
			dist[i] = 0;
			queue.addLast(i);
			int max = 0;
			while (!queue.isEmpty() && max >= 0) {
				int cur = queue.pollFirst();
				for (int j = 0; j < N; j++) {
					if (adj[cur][j]){
						if (dist[j] == -1) {
							max = dist[j] = dist[cur] + 1;
							queue.addLast(j);
						} else if (dist[j] == dist[cur]) {
							max = -2;
							break;
						}
					}
				}
			}
			ans = Math.max(ans, max + 1);
		}
		out.println(ans);
		
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
