import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
	
	public static boolean dfs(int deep, int node, int parent, int[] ps, ArrayList<HashSet<Integer>> adj) {
		if(deep >= 3 && ps[node] % 3 != 0) {
			return true;
		}
		
		for(final int next: adj.get(node)) {
			if(next == parent) { continue; }
			
			if(dfs(deep + 1, next, node, ps, adj)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			ArrayList<HashSet<Integer>> adj = new ArrayList<HashSet<Integer>>();
			for(int i = 0; i < N; i++) { adj.add(new HashSet<Integer>()); }
			
			for(int i = 0; i < N - 1; i++) {
				final int a = sc.nextInt() - 1;
				final int b = sc.nextInt() - 1;
				
				adj.get(a).add(b);
				adj.get(b).add(a);
			}
			
			int[] ps = new int[N];
			Arrays.fill(ps, -1);
			
			int p = 3;
			
			for(int node = 0; node < N; node++) {
				if(dfs(0, node, -1, ps, adj)) {
					ps[node] = p;
					p += 3;
				}
			}
			
			for(int i = 0, j = 1; i < N; i++) {
				if(ps[i] < 0) { 
					ps[i] = j;
					j++;
					while(j % 3 == 0) { j++; }
				}
			}
			//System.out.println(Arrays.toString(ps));
			
			for(int i = 0; i < N; i++) {
				System.out.print((i == 0 ? "" : " ") + ps[i]);
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