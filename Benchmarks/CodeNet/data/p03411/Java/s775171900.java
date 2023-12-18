import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static boolean augment(boolean[][] adj, int node, int[] n_to_m, int[] m_to_n, boolean[] visited){
		final int n = adj.length;
		final int m = adj[0].length;
		
		if(node < 0){ return true; }
		for(int match = 0; match < m; match++){
			if(!adj[node][match]){ continue; }
			if(visited[match]){ continue; }
			
			visited[match] = true;
			if(augment(adj, m_to_n[match], n_to_m, m_to_n, visited)){
				n_to_m[node] = match;
				m_to_n[match] = node;
				return true;
			}
		}
		
		return false;
	}	
	
	public static int matching(boolean[][] adj){
		final int n = adj.length;
		final int m = adj[0].length;
		
		int[] n_to_m = new int[n];
		int[] m_to_n = new int[m];
		Arrays.fill(n_to_m, -1);
		Arrays.fill(m_to_n, -1);
		
		int match = 0;
		for(int node = 0; node < n; node++){
			boolean[] visited = new boolean[m];
			
			if(augment(adj, node, n_to_m, m_to_n, visited)){
				match++;
			}
		}
		
		return match;
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			int[] as = new int[N];
			int[] bs = new int[N];
			int[] cs =  new int[N];
			int[] ds = new int[N];
			for(int i = 0; i < N; i++){
				as[i] = sc.nextInt();
				bs[i] = sc.nextInt();
			}
			for(int i = 0; i < N; i++){
				cs[i] = sc.nextInt();
				ds[i] = sc.nextInt();
			}
			
			boolean[][] adj = new boolean[N][N];
			for(int r = 0; r < N; r++){
				for(int b = 0; b < N; b++){
					adj[r][b] = (as[r] < cs[b] && bs[r] < ds[b]) ? true : false;
				}
			}
			
			try(final PrintWriter pw = new PrintWriter(System.out)){
				pw.println(matching(adj));
			}
		}
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
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}