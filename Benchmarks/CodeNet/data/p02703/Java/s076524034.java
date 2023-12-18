import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
	
	public static class Edge {
		int from, to;
		int a;
		long b;
		
		public Edge(int from, int to, int a, long b) {
			this.from = from;
			this.to = to;
			this.a = a;
			this.b = b;
		}
	}
	
	public static class Walk implements Comparable<Walk> {
		int node;
		long time;
		long S;
		
		public Walk(int node, long time, long S) {
			this.node = node;
			this.time = time;
			this.S = S;
		}

		@Override
		public int compareTo(Walk o) {
			return Long.compare(this.time, o.time);
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			final int S = sc.nextInt();
			
			ArrayList<HashMap<Integer, Edge>> adj = new ArrayList<HashMap<Integer, Edge>>();
			for(int i = 0; i < N; i++) { adj.add(new HashMap<Integer, Edge>()); }
			for(int i = 0; i < M; i++) {
				final int U = sc.nextInt() - 1;
				final int V = sc.nextInt() - 1;
				final int A = sc.nextInt();
				final long B = sc.nextLong();
				
				adj.get(U).put(V, new Edge(U, V, A, B));
				adj.get(V).put(U, new Edge(V, U, A, B));
			}
			
			long[] cs = new long[N];
			long[] ds = new long[N];
			
			for(int i = 0; i < N; i++) {
				cs[i] = sc.nextLong();
				ds[i] = sc.nextLong();
			}
			
			final int S_limit = N * 50;
			long[][] min_times = new long[N][S_limit + 1];
			for(int i = 0; i < N; i++) { Arrays.fill(min_times[i], Long.MAX_VALUE); }
			
			PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
			queue.add(new Walk(0, 0, S));
			
			while(!queue.isEmpty()) {
				final Walk walk = queue.poll();
				
				final int estimate_S = (int)(Math.min(walk.S, S_limit));
				if(min_times[walk.node][estimate_S] <= walk.time) { continue; }
				min_times[walk.node][estimate_S] = walk.time;
				
				if(walk.S <= S_limit) {
					queue.add(new Walk(walk.node, walk.time + ds[walk.node], walk.S + cs[walk.node]));
				}
				
				for(final Entry<Integer, Edge> entry : adj.get(walk.node).entrySet()) {
					final Edge edge = entry.getValue();
					final int to = edge.to;
						
					final long next_time = walk.time + edge.b;
					final long next_S = walk.S - edge.a;
					if(next_S >= 0) { queue.add(new Walk(to, next_time, next_S)); }
				}
			}
			
			for(int i = 1; i < N; i++) {
				System.out.println(Arrays.stream(min_times[i]).min().getAsLong());
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
