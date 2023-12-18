import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			Map<Integer, Set<Integer>> adj = new HashMap<Integer, Set<Integer>>();
			for(int i = 0; i < N; i++) { adj.put(i, new HashSet<Integer>()); }
			
			int[] in_degs = new int[N];
			
			for(int i = 0; i < M; i++) {
				final int x = sc.nextInt() - 1;
				final int y = sc.nextInt() - 1;
				
				adj.get(x).add(y);
				in_degs[y]++;
			}
			
			LinkedList<Integer> queue = new LinkedList<Integer>();
			for(int i = 0; i < N; i++) {
				if(in_degs[i] == 0) { queue.add(i); }
			}
			
			int[] DP = new int[N];
			
			while(!queue.isEmpty()) {
				final int node = queue.poll();
				
				for(final int next : adj.get(node)) {
					in_degs[next]--;
					DP[next] = Math.max(DP[next], DP[node] + 1);
					
					if(in_degs[next] == 0) { queue.add(next); }
				}
			}
			
			System.out.println(Arrays.stream(DP).max().getAsInt());
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while(!hasNext()){
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

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}