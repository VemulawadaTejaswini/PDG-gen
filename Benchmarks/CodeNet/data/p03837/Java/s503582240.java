import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		int[] from = new int[m];
		int[] to = new int[m];
		int[] cost = new int[m];
		for(int i = 0; i < m; i++){
			final int f = sc.nextInt() - 1;
			final int t = sc.nextInt() - 1;
			final int c = sc.nextInt();
			
			from[i] = f;
			to[i] = t;
			cost[i] = c;
		}
		
		long[][] adj = new long[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				adj[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i = 0; i < m; i++){
			adj[from[i]][to[i]] = adj[to[i]][from[i]] = 1;
		}
		
		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
				}
			}
		}
		
		int count = 0;
		for(int i = 0; i < m; i++){
			final int f = from[i];
			final int t = to[i];
			final int c = cost[i];
			
			if(adj[f][t] < c){
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static class Scanner implements Closeable {
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
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		
		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}