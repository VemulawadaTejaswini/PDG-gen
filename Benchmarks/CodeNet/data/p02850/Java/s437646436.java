import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void coloring(final int N, int curr, int parent, int parent_color, ArrayList<HashSet<Edge>> adj, int[] color) {
		int use_color = 0;

		for(final Edge edge : adj.get(curr)) {
			final int next = (edge.from == curr) ? edge.to : edge.from;

			if(next == parent) { continue; }
			if(parent_color == use_color) { use_color++; }
			
			color[edge.index] = use_color;
			coloring(N, next, curr, use_color, adj, color);
			use_color++;
		}
	}
	
	public static class Edge {
		int from, to, index;
		
		public Edge(int from, int to, int index) {
			this.from = from;
			this.to = to;
			this.index = index;
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			ArrayList<HashSet<Edge>> adj = new ArrayList<HashSet<Edge>>();
			for(int i = 0; i < N; i++) { adj.add(new HashSet<Edge>()); }
			for(int i = 0; i < N - 1; i++) {
				final int a = sc.nextInt() - 1;
				final int b = sc.nextInt() - 1;
				
				Edge fwd_edge = new Edge(a, b, i);
				Edge rev_edge = new Edge(b, a, i);
				
				adj.get(a).add(fwd_edge);
				adj.get(b).add(rev_edge);
			}
			
			int[] color = new int[N - 1];
			coloring(N, 0, -1, -1, adj, color);
			
			System.out.println(Arrays.stream(color).max().getAsInt() + 1);
			for(int i = 0; i < N - 1; i++) {
				System.out.println(color[i] + 1);
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