import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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
			final int K = sc.nextInt();
			
			int[] array = new int[N];
			for(int i = 0; i < N; i++) {
				array[i] = sc.nextInt();
			}
			
			int answer = 1;
			for(int average = 1; average <= 100; average++) {
				int minus = 0;
				
				for(int i = 0; i < N; i++) {
					minus += array[i] - (array[i] / average * average);
				}
				
				if(minus % average != 0) { continue; }
				
				for(int i = 0; i < N; i++) {
					final int ceil_diff = array[i] - (array[i] / average * average);
					final int floor_diff = array[i] - ((array[i] + average - 1) / average * average);
					
					if(Math.abs(ceil_diff) > Math.abs(floor_diff)) {
						minus -= Math.abs(ceil_diff);
						minus += Math.abs(floor_diff);
					}
				}
				
				//System.out.println(average + " : " + minus);
				
				if(minus / 2 > K) { continue; }
				
				answer = Math.max(answer, average);
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