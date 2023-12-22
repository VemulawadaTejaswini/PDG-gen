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
	public static int upper_bound(long[] array, long key){
		int lower = -1, upper = array.length;
		// keep array[lower] < key && key <= array[upper]
		while(upper - lower > 1){
			final int mid = (lower + upper) / 2;
			final int comp = Long.compare(array[mid], key);

			if(comp <= 0){ lower = mid; }
			else if(comp > 0){ upper = mid;}
		}
		
		return upper;
	}
	
	
	public static void dfs(int node, int parent, final int N, long[] vs, long[] lis, int lis_max, ArrayList<ArrayList<Integer>> adj, int[] answer) {
		final int lis_index = upper_bound(lis, vs[node]);
		
		boolean updated = false;
		long updated_lis = 0;
		if(lis[lis_index] > vs[node] && lis[lis_index - 1] < vs[node]) {
			updated = true;
			updated_lis = lis[lis_index];
			lis[lis_index] = vs[node];
			lis_max = Math.max(lis_max, lis_index);
			//System.out.println(node + " " + Arrays.toString(lis) + " " + lis_index + " " + lis_max);
		}else {
			//System.out.println(lis_max);
		}
		
		answer[node] = lis_max;
		
		for(final int next : adj.get(node)) {
			if(next == parent) { continue; }
			
			dfs(next, node, N, vs, lis, lis_max, adj, answer);
		}
		
		if(updated) {
			lis[lis_index] = updated_lis;
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < N; i++) { adj.add(new ArrayList<Integer>()); }
			
			long[] as = new long[N];
			for(int i = 0; i < N; i++) { as[i] = sc.nextLong(); }
			
			for(int i = 0; i < N - 1; i++) {
				final int u = sc.nextInt() - 1;
				final int v = sc.nextInt() - 1;
				
				adj.get(u).add(v);
				adj.get(v).add(u);
			}
			
			long[] lis = new long[N + 1];
			Arrays.fill(lis, Long.MAX_VALUE);
			lis[0] = 0;
			
			int[] answer = new int[N];
			
			dfs(0, -1, N, as, lis, 0, adj, answer);
			
			for(int i = 0; i < N; i++) {
				System.out.println(answer[i]);
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
