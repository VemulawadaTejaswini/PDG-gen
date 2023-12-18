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
			final int M = sc.nextInt();
			final long L = sc.nextLong();
			
			final long INF = Long.MAX_VALUE / 2 - 1;
			
			long[][] adj = new long[N][N];
			int[][] next = new int[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					adj[i][j] = i == j ? 0 : INF;
					next[i][j] = j;
				}
			}
			
			
			for(int i = 0; i < M; i++) {
				final int A = sc.nextInt() - 1;
				final int B = sc.nextInt() - 1;
				final long C = sc.nextLong();
				
				adj[A][B] = adj[B][A] = C <= L ? C : INF; 
			}
			
			for(int k = 0; k < N; k++) {
				for(int i = 0; i < N; i++) {
					for(int j = 0; j < N; j++) {
						
						if(adj[i][j] > adj[i][k] + adj[k][j] ) {
							adj[i][j] = adj[i][k] + adj[k][j]; 
							next[i][j] = next[i][k];
						}
					}
				}
			}
			
			final int Q = sc.nextInt();
			for(int i = 0; i < Q; i++) {
				final int s = sc.nextInt() - 1;
				final int t = sc.nextInt() - 1;
				
				final long C = adj[s][t];
				if(C >= INF) {
					System.out.println("-1");
				}else {
					long l = L, answer = 0;
					
					for(int cur = s; cur != t; cur = next[cur][t]) {
						//System.out.println(s + " "  + cur + " : " + l + " " + t);
						final int nxt = next[cur][t];
						if(l < adj[cur][nxt]) {
							l = L - adj[cur][nxt]; answer += 1;
						}else {
							l -= adj[cur][nxt];
						}
					}

					System.out.println(answer);
				}
			}
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