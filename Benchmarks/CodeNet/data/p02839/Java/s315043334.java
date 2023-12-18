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
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			
			final int GAP = (100 + 1) * 2;
			
			int[][] as = new int[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					as[i][j] = sc.nextInt();
				}
			}
			
			int[][] bs = new int[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					bs[i][j] = sc.nextInt();
				}
			}
			
			boolean[][][][] DP = new boolean[H][W][GAP][GAP];
			DP[0][0][0][0] = true;
			
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					
					for(int r = 0; r < GAP; r++) {
						for(int b = 0; b < GAP; b++) {
							if(!DP[i][j][r][b]) { continue; }
							
							{
								int next_r = r + as[i][j];
								int next_b = b + bs[i][j];
								final int common = Math.min(next_r, next_b);
								next_r -= common; next_b -= common;
								
								if(next_r < GAP & next_b < GAP) {
									if(i < H - 1) { DP[i + 1][j][next_r][next_b] = true; }
									if(j < W - 1) { DP[i][j + 1][next_r][next_b] = true; }
								}
							}
							{
								int next_r = r + bs[i][j];
								int next_b = b + as[i][j];
								final int common = Math.min(next_r, next_b);
								next_r -= common; next_b -= common;
								
								if(next_r < GAP & next_b < GAP) {
									if(i < H - 1) { DP[i + 1][j][next_r][next_b] = true; }
									if(j < W - 1) { DP[i][j + 1][next_r][next_b] = true; }
								}
							}
						}
					}
				}
			}

			int answer = Integer.MAX_VALUE;
			for(int r = 0; r < GAP; r++) {
				for(int b = 0; b < GAP; b++) {
					if(!DP[H - 1][W - 1][r][b]) { continue; }
					
					System.out.println(r + " " + b);
					
					{
						int next_r = r + as[H - 1][W - 1];
						int next_b = b + bs[H - 1][W - 1];
						final int common = Math.min(next_r, next_b);
						next_r -= common; next_b -= common;
						
						answer = Math.min(answer, Math.abs(next_r - next_b));
					}
					{
						int next_r = r + bs[H - 1][W - 1];
						int next_b = b + as[H - 1][W - 1];
						final int common = Math.min(next_r, next_b);
						next_r -= common; next_b -= common;
						
						answer = Math.min(answer, Math.abs(next_r - next_b));
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