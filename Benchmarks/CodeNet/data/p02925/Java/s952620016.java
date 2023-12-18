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
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			final int SIZE = N * N;
			ArrayList<HashSet<Integer>> adj = new ArrayList<HashSet<Integer>>();
			for(int i = 0; i < SIZE; i++) {
				adj.add(new HashSet<Integer>());
			}
			
			int[] in_degs = new int[SIZE];
			
			for(int i = 0; i < N; i++) {
				int prev_index = -1;
				
				for(int j = 0; j < N - 1; j++) {
					final int a = sc.nextInt() - 1;
					final int min = Math.min(i, a);
					final int max = Math.max(i, a);
					
					final int index = (min * N) + max;
					if(prev_index >= 0) {
						adj.get(prev_index).add(index);
						in_degs[index] += 1;
					}
					prev_index = index;
				}
			}
			
			int[] depths = new int[SIZE];
			Arrays.fill(depths, -1);
			
			LinkedList<Integer> queue = new LinkedList<Integer>();
			for(int index = 0; index < SIZE; index++) {
				if(in_degs[index] == 0) { queue.add(index); depths[index] = 0; }
			}
			
			while(!queue.isEmpty()) {
				final int node = queue.poll();
				
				for(final int next_node : adj.get(node)) {
					depths[next_node] = Math.max(depths[next_node], depths[node] + 1);
					in_degs[next_node] -= 1;
					if(in_degs[next_node] == 0) { queue.add(next_node); }
				}
			}
			
			for(int i = 0; i < N; i++) {
				if(depths[i] < 0) { 
					System.out.println(-1);
					return;
				}
			}
			
			System.out.println(Arrays.stream(depths).max().getAsInt() + 1);
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