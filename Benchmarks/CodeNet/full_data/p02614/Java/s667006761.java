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
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			final int K = sc.nextInt();
			
			char[][] board = new char[H][W];
			for(int i = 0; i < H; i++) {
				final char[] chs = sc.next().toCharArray();
				for(int j = 0; j < W; j++) {
					board[i][j] = chs[j];
				}
			}
			
			char[][] mod = new char[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					mod[i][j] = board[i][j];
				}
			}
			
			int answer = 0;
			
			for(int row_bit = 0; row_bit < (1 << H); row_bit++) {
				for(int col_bit = 0; col_bit < (1 << W); col_bit++) {
					
					for(int row = 0; row < H; row++) {
						if((row_bit & (1 << row)) != 0) { continue; }
						
						for(int j = 0; j < W; j++) {
							mod[row][j] = 'X';
						}
					}
					for(int col = 0; col < W; col++) {
						if((col_bit & (1 << col)) != 0) { continue; }
						
						for(int i = 0; i < H; i++) {
							mod[i][col] = 'X';
						}
					}

					int count = 0;
					for(int i = 0; i < H; i++) {
						for(int j = 0; j < W; j++) {
							if(mod[i][j] == '#') { count++; }
						}
					}
					
					if(count == K) { answer++; }
					
					for(int i = 0; i < H; i++) {
						for(int j = 0; j < W; j++) {
							mod[i][j] = board[i][j];
						}
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
