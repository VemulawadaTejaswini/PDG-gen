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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.text.Segment;

public class Main {
	
	public static final long INF = Long.MAX_VALUE / 2 - 1;
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			final int R = sc.nextInt();
			
			int[] rs = sc.nextIntArray(R);
			
			int[][] adj = new int[N][N];
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					adj[i][j] = i == j ? 0 : Integer.MAX_VALUE / 2 - 1;
				}
			}
			
			for(int i = 0; i < M; i++){
				final int a = sc.nextInt() - 1;
				final int b = sc.nextInt() - 1;
				final int c = sc.nextInt();
				
				adj[a][b] = adj[b][a] = c;
			}
			
			for(int k = 0; k < N; k++){
				for(int i = 0; i < N; i++){
					for(int j = 0; j < N; j++){
						adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
					}
				}
			}
			
			long[][] DP = new long[1 << R][R];
			for(final long[] arr : DP){ Arrays.fill(arr, INF); }
			for(int i = 0; i < R; i++){
				DP[1 << i][i] = 0;
			}
			
			for(int bit = 1; bit < (1 << R); bit++){
				for(int curr = 0; curr < R; curr++){
					if((bit & (1 << curr)) == 0){ continue; }
					if(DP[bit][curr] >= INF){ continue; }
					
					for(int next = 0; next < R; next++){
						if((bit & (1 << next)) != 0){ continue; }
						
						final int next_bit = bit | (1 << next);
						final long next_cost = DP[bit][curr] + adj[rs[curr] - 1][rs[next] - 1];
						
						DP[next_bit][next] = Math.min(DP[next_bit][next], next_cost);
					}
				}
			}
			
			long answer = INF;
			for(int i = 0; i < R; i++){
				answer = Math.min(answer, DP[(1 << R) - 1][i]);
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
			while (!hasNext()) {
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