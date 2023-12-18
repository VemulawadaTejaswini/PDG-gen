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
			final int X = sc.nextInt();
			final int Y = sc.nextInt();
			final int A = sc.nextInt();
			final int B = sc.nextInt();
			final int C = sc.nextInt();
			
			PriorityQueue<Long> p_queue = new PriorityQueue<Long>(Collections.reverseOrder());
			PriorityQueue<Long> q_queue = new PriorityQueue<Long>(Collections.reverseOrder());
			PriorityQueue<Long> r_queue = new PriorityQueue<Long>(Collections.reverseOrder());
			for(int i = 0; i < A; i++) { p_queue.add(sc.nextLong()); }
			for(int i = 0; i < B; i++) { q_queue.add(sc.nextLong()); }
			for(int i = 0; i < C; i++) { r_queue.add(sc.nextLong()); } 
			
			long answer = 0;
			int rest_X = X, rest_Y = Y;
			while(rest_X > 0 || rest_Y > 0) {
				final long P = p_queue.isEmpty() ? Long.MIN_VALUE : p_queue.peek();
				final long Q = q_queue.isEmpty() ? Long.MIN_VALUE : q_queue.peek();
				final long R = r_queue.isEmpty() ? Long.MIN_VALUE : r_queue.peek();
				
				//System.out.println(P + " " + Q + " " + R + " " + rest_X + " " + rest_Y);

				if(P >= Q && P >= R) {
					if(rest_X > 0) {
						rest_X--;
						answer += p_queue.poll();
					}else {
						p_queue.poll();
					}
				}else if(Q >= P && Q >= R) {
					if(rest_Y > 0) {
						rest_Y--;
						answer += q_queue.poll();
					}else {
						q_queue.poll();
					}
				}else {
					if(rest_X <= 0) {
						rest_Y--;
						answer += r_queue.poll();
					}else if(rest_Y <= 0) {
						rest_X--;
						answer += r_queue.poll();
					}else if(P >= Q) {
						rest_Y--;
						answer += r_queue.poll();
					}else{
						rest_X--;
						answer += r_queue.poll();
					}
				}
			}
			
			System.out.println(answer);
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
