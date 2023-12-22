import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		boolean[][] adj = new boolean[n][n];
		
		for(int i = 0; i < n; i++){
			final int u = sc.nextInt() - 1;
			final int k = sc.nextInt();
			
			for(int j = 0; j < k; j++){
				final int v = sc.nextInt() - 1;
				
				adj[u][v] = true;
			}
		}
		
		LinkedList<Integer> node_queue = new LinkedList<Integer>();
		node_queue.add(0);
		int[] times = new int[n];
		Arrays.fill(times, Integer.MAX_VALUE);
		times[0] = 0;
		
		while(!node_queue.isEmpty()){
			final int node = node_queue.poll();
			
			for(int next = 0; next < n; next++){
				if(!adj[node][next]){
					continue;
				}else if(times[next] <= times[node] + 1){
					continue;
				}
				
				times[next] = times[node] + 1;
				node_queue.add(next);
			}
		}
		
		
		
		for(int i = 0; i < n; i++){
			System.out.println((i + 1) + " " + (times[i] == Integer.MAX_VALUE ? "-1" : times[i]));
		}
	}

	public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}

}