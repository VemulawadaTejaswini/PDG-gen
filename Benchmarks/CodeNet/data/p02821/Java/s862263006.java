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
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){	
			final int N = sc.nextInt();
			final long M = sc.nextLong();
			
			long[] as = new long[N];
			for(int i = 0; i < N; i++) { as[i] = -sc.nextLong(); }
			Arrays.sort(as);
			for(int i = 0; i < N; i++) { as[i] = -as[i]; }

			long[] prefix_sums = new long[2 * N + 1];
			for(int i = 0; i < N; i++) {
				prefix_sums[2 * i + 1] += prefix_sums[2 * i + 0] + as[i];
				prefix_sums[2 * i + 2] += prefix_sums[2 * i + 1] + as[i];
			}
			/*
			System.out.println(Arrays.toString(prefix_sums));
			for(int i = 1; i < 2 * N + 1; i++) {
				System.out.print(prefix_sums[i] - prefix_sums[i - 1] + " ");
			}
			System.out.println();
			*/

			long answer = 0;
			int glob_count = 0;
			
			for(int begin = 0; begin < N; begin++) {
				final int s_begin = begin * 2 + 1;
				final int s_size = Math.min(M - glob_count, prefix_sums.length - (s_begin + 1));
				//System.out.println(s_size + " " + prefix_sums.length);
				if(s_size <= 0) { break; }
				
				final int s_end = s_begin + s_size;
				
				answer += (as[begin] * s_size) + (prefix_sums[s_end] - prefix_sums[s_begin]);
				glob_count += s_size;
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