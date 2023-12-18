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
			final int K = sc.nextInt();
			
			int[][] map = new int[H][W];
			
			{
				int id = 1;
				for(int i = 0; i < H; i++) {
					char[] chs = sc.next().toCharArray();
					for(int j = 0; j < W; j++) {
						map[i][j] = chs[j] == '#' ? id++ : 0;
					}
				}
			}
			
			for(int i = 0; i < H; i++) {
				for(int j = 1; j < W; j++) {
					if(map[i][j] != 0) { continue; }
					map[i][j] = map[i][j - 1];
					
				}
				for(int j = W - 2; j >= 0; j--) {
					if(map[i][j] != 0) { continue; }
					map[i][j] = map[i][j + 1];
				}
			}
			
			for(int j = 0; j < W; j++) {
				for(int i = 0; i < H - 1; i++) {
					if(map[i + 1][j] != 0) { continue; }
					map[i + 1][j] = map[i][j];
				}
				for(int i = H - 1; i >= 1; i--) {
					if(map[i - 1][j] != 0) { continue; }
					map[i - 1][j] = map[i][j];
				}

			}
			
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					System.out.print((j == 0 ? "" : " ") + map[i][j]);
				}
				System.out.println();
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