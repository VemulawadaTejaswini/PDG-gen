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
			final int SIZE = 1 << N;
			
			long[] as = new long[SIZE];
			for(int i = 0; i < SIZE; i++) {
				as[i] = -sc.nextLong();
			}
			
			Arrays.sort(as);
			
			for(int i = 0; i < SIZE; i++) {
				as[i] = -as[i];
			}
			
			
			//System.out.println(Arrays.toString(as));
			PriorityQueue<Long> already = new PriorityQueue<Long>(Collections.reverseOrder());
			PriorityQueue<Long> remains = new PriorityQueue<Long>(Collections.reverseOrder());
			LinkedList<Long> next_already = new LinkedList<Long>();
			LinkedList<Long> remains_removed = new LinkedList<Long>();
			
			already.add(as[0]);
			for(int i = 1; i < SIZE; i++) {
				remains.add(as[i]);
			}
			
			boolean flag = false;
			while(!remains.isEmpty()) {
				next_already.clear();
				remains_removed.clear();
				
				while(!already.isEmpty()) {
					final long value = already.poll();
					
					while(!remains.isEmpty() && remains.peek() >= value) {
						remains_removed.add(remains.poll());
					}
					if(remains.isEmpty()) { flag = true; break; }
				
					next_already.add(remains.poll());
					next_already.add(value);
				}				
				if(flag) { break; }
				
				already.addAll(next_already);
				remains.addAll(remains_removed);
			}
				
			
			//System.out.println(Arrays.toString(as));
			System.out.println(flag ? "No" : "Yes");
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