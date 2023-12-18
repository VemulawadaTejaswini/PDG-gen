import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.text.Segment;

public class Main {
	
	public static final long INF = Long.MAX_VALUE / 2 - 1;
	
	public static class State implements Comparable<State> {
		int curr;
		int prev;
		long cost;
		
		public State(int curr, int prev, long cost){
			this.curr = curr;
			this.prev = prev;
			this.cost = cost;
		}
		
		public int compareTo(State arg0){
			return Long.compare(this.cost, arg0.cost);
		}
	}
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			ArrayList<HashMap<Integer, Long>> adj = new ArrayList<HashMap<Integer, Long>>();
			for(int i = 0; i < N; i++){ adj.add(new HashMap<Integer, Long>()); }
			
			for(int i = 0; i < N - 1; i++){
				final int a = sc.nextInt() - 1;
				final int b = sc.nextInt() - 1;
				final long c = sc.nextLong();
				
				adj.get(a).put(b, c);
				adj.get(b).put(a, c);
			}
			
			final int Q = sc.nextInt();
			final int K = sc.nextInt() - 1;
			long[] dist_from_k = new long[N];
			Arrays.fill(dist_from_k, INF);
			dist_from_k[K] = 0;
			
			PriorityQueue<State> queue = new PriorityQueue<State>();
			queue.add(new State(K, -1, 0));

			while(!queue.isEmpty()){
				final State state = queue.poll();
				final int node = state.curr;
				final int prev = state.prev;
				
				if(dist_from_k[node] < state.cost){ continue; }
				
				//System.out.println(node + " " + prev);
				for(final int next : adj.get(node).keySet()){
					if(next == prev){ continue; }
					
					final long next_dist = dist_from_k[node] + adj.get(node).get(next);
					if(next_dist < dist_from_k[next]){
						dist_from_k[next] = next_dist;
						
						queue.add(new State(next, node, next_dist));
					}
				}
			}
			
			for(int i = 0; i < Q; i++){
				final int x = sc.nextInt() - 1;
				final int y = sc.nextInt() - 1;
				
				System.out.println(dist_from_k[x] + dist_from_k[y]);
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