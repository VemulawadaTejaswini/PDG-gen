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
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			ArrayList<HashSet<Integer>> adj = new ArrayList<HashSet<Integer>>();
			for(int i = 0; i < N; i++) { adj.add(new HashSet<Integer>()); }
			
			for(int i = 0; i < M; i++) {
				final int A = sc.nextInt() - 1;
				final int B = sc.nextInt() - 1;
				
				adj.get(A).add(B);
				adj.get(B).add(A);
			}
			
			
			int[] come_from = new int[N];
			Arrays.fill(come_from, -1);
			come_from[0] = 0;
			
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.add(0);
			while(!queue.isEmpty()) {
				final int node = queue.poll();
				
				for(final int next: adj.get(node)) {
					if(come_from[next] >= 0) { continue; }
					
					come_from[next] = node;
					queue.add(next);
				}
			}
			
			System.out.println("Yes");
			for(int i = 1; i < N; i++) {
				System.out.println(come_from[i] + 1);
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
