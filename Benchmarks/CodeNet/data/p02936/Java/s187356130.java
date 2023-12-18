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
			final int Q = sc.nextInt();
			
			ArrayList<HashSet<Integer>> tree = new ArrayList<HashSet<Integer>>();
			for(int i = 0; i < N; i++) { tree.add(new HashSet<Integer>()); }
			
			int[] in_degs = new int[N];
			for(int i = 0; i < N - 1; i++) {
				final int a = sc.nextInt() - 1;
				final int b = sc.nextInt() - 1;
				
				tree.get(a).add(b);
				in_degs[b] += 1;
			}
			
			long[] value = new long[N];
			for(int i = 0; i < Q; i++) {
				final int p = sc.nextInt() - 1;
				final long x = sc.nextLong();
				value[p] += x;
			}
			
			
			LinkedList<Integer> queue = new LinkedList<Integer>();
			for(int node = 0; node < N; node++) {
				if(in_degs[node] == 0) { queue.add(node); }
			}
			
			while(!queue.isEmpty()) {
				final int node = queue.poll();
				
				for(final int next : tree.get(node)) {
					value[next] += value[node];

					in_degs[next] -= 1;
					if(in_degs[next] == 0) { queue.add(next); }
				}
			}
			
			
			for(int i = 0; i < N; i++) {
				System.out.print((i == 0 ? "" : " ") + value[i]);
			}
			System.out.println();
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