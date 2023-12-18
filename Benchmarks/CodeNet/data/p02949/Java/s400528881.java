import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			final int T = sc.nextInt();
			
			ArrayList<HashMap<Integer, Long>> adj = new ArrayList<HashMap<Integer, Long>>();
			for(int i = 0; i < N; i++) { adj.add(new HashMap<Integer, Long>()); }
			
			for(int i = 0; i < M; i++) {
				final int a = sc.nextInt() - 1;
				final int b = sc.nextInt() - 1;
				final long c = sc.nextLong();
				
				if(!adj.get(a).containsKey(b)) { adj.get(a).put(b, 0l); }
				adj.get(a).put(b, Math.max(adj.get(a).get(b), c));
			}
			
			long[] costs = new long[N];
			boolean[] visited = new boolean[N];
			costs[0] = 0;
			visited[0] = true;
			
			boolean infinite = false;
			
			for(int times = 0; times < 2 * N; times++) {
				for(int node = 0; node < N; node++) {
					if(!visited[node]) { continue; }
					
					for(final Entry<Integer, Long> edge : adj.get(node).entrySet()) {
						final int next_index = edge.getKey();
						final long next_cost = costs[node] + edge.getValue() - T;
						
						if(!visited[next_index]) {
							visited[next_index] = true;
							costs[next_index] = next_cost;
						}else if(costs[next_index] < next_cost){
							if(times >= N) { infinite = true; break; }
							costs[next_index] = next_cost;
						}
					}
				}
			}
			
			System.out.println(infinite ? -1 : Math.max(0, costs[N - 1]));
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