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
	
	public static long naive_solve(long A, long B, long N) {
		long answer = Long.MIN_VALUE;
		
		for(int x = 1; x <= N; x++) {
			final long upper = (A * x) / B;
			final long lower = A * (x / B);
			
			answer = Math.max(answer, upper - lower);
		}
		
		return answer;
	}
	
	public static long smart_solve(long A, long B, long N) {
		final long x = Math.min(N, B - 1);
		final long upper = (A * x) / B;
		final long lower = A * (x / B);
		
		return upper - lower;
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final long A = sc.nextLong();
			final long B = sc.nextLong();
			final long N = sc.nextLong();
			
			/*
			for(int i = 0; i < 1000; i++) {
				final long a = (long)(1 + Math.random() * 1000l);
				final long b = (long)(1 + Math.random() * 1000l);
				final long n = (long)(1 + Math.random() * 1000l);
				
				if(naive_solve(a, b, n) != smart_solve(a, b, n)) {
					System.out.println("ng");
				}
			}
			*/
			
			System.out.println(smart_solve(A, B, N));
			
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
