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
			final int S = sc.nextInt();
			final long MOD = 998244353;
			
			int[] A = new int[N];
			for(int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			
			long[] prefix_sum = new long[N + 1];
			for(int i = 1; i <= N; i++) {
				prefix_sum[i] = A[i - 1] + prefix_sum[i - 1];
			}
			
			long[][] own_DP = new long[N][N + 1];
			long[][] drv_DP = new long[N][N + 1];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= N; j++) {
					own_DP[i][j] = 0;
					drv_DP[i][j] = 0;
				}
			}
			
			for(int len = 1; len <= N; len++) {
				for(int begin = 0; begin + len <= N; begin++) {
					final int end = begin + len;
					final long sum = prefix_sum[end] - prefix_sum[begin];
					
					if(len >= 2) {
						drv_DP[begin][end] += own_DP[begin + 1][end];
						drv_DP[begin][end] %= MOD;
						drv_DP[begin][end] += own_DP[begin][end - 1];
						drv_DP[begin][end] %= MOD;
						
						drv_DP[begin][end] += drv_DP[begin + 1][end];
						drv_DP[begin][end] %= MOD;
						drv_DP[begin][end] += drv_DP[begin][end - 1];
						drv_DP[begin][end] %= MOD;
						//System.out.println(drv_DP[begin][end]);
					}
					
					if(sum == S) { 
						own_DP[begin][end] += 1;
						own_DP[begin][end] %= MOD;
					}
				}
			}
			
			long sum = 0;
			for(int len = 1; len <= N; len++) {
				for(int begin = 0; begin + len <= N; begin++) {
					final int end = begin + len;
					sum += own_DP[begin][end] + drv_DP[begin][end];
				}
			}
			
			System.out.println(sum);
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
