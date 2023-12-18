import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int K = sc.nextInt();
			
			int[] arr = new int[N];
			for(int i = 0; i < N; i++) { arr[i] = sc.nextInt(); }
			
			int min = Integer.MAX_VALUE;
			int min_pos = -1;
			
			for(int i = 0; i < N; i++) {
				if(arr[i] < min) { min = arr[i]; min_pos = i; }
			}
			
			int answer = Integer.MAX_VALUE;
			for(int left = Math.max(0, min_pos - (K - 1)); (left + K) <= N; left++) {
				final int right = left + K;
				
				final int left_count  = (left + (K - 2)) / (K - 1);
				final int right_count = ((N - right) + (K - 2)) / (K - 1);
				
				//System.out.println(left_count + " " + right_count);
				answer = Math.min(answer, left_count + right_count + 1);
				//System.out.println("(" + left + ")" + " " + "("  + right + ")");
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