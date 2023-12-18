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
	
	public static long count = 0;
	public static long answer = 0;
	public static long dfs(final int limit, final int deep, int prev, long number) {
		if(deep >= limit) {
			if(number == 0) { return 0; }
			count--;
			if(count == 0) {
				answer = number;
			}
			return 1;
		}
		
		long ret = 0;
		if(deep == 0) {
			for(int digit = 1; digit <= 9; digit++) {
				ret += dfs(limit, deep + 1, digit, number * 10 + digit);
			}
		}else {
			for(int digit = Math.max(0, prev - 1); digit <= Math.min(9, prev + 1); digit++) {
				ret += dfs(limit, deep + 1, digit, number * 10 + digit);
			}
		}
		
		return ret;
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int K = sc.nextInt();
			
			long rest = K;
			count = K;
			for(int limit = 1; ; limit++) {
				final long ret = dfs(limit, 0, -1, 0);
				if(rest <= ret) {
					break;
				}

				rest -= ret;
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
