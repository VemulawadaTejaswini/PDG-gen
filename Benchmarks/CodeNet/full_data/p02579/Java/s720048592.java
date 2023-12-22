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
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
	
	public static boolean in_range(int x, int y, int W, int H) {
		return 0 <= x && x < W && 0 <= y && y < H;
	}
	
	public static final int[][] move_dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; 
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			
			final int ch = sc.nextInt() - 1;
			final int cw = sc.nextInt() - 1;
			
			final int dh = sc.nextInt() - 1;
			final int dw = sc.nextInt() - 1;
			
			char[][] board = new char[H][];
			for(int i = 0; i < H; i++) {
				board[i] = sc.next().toCharArray();
			}
			
			int[][] costs = new int[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					costs[i][j] = Integer.MAX_VALUE;
				}
			}
			
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.add(cw); queue.add(ch); queue.add(0);
			costs[ch][cw] = 0;
			
			while(!queue.isEmpty()) {
				final int x = queue.poll();
				final int y = queue.poll();
				final int cost = queue.poll();
				
				if(costs[y][x] < cost) { continue; }
				
				for(final int[] moves : move_dirs) {
					final int nx = x + moves[0];
					final int ny = y + moves[1];
					
					if(!in_range(nx, ny, W, H)) { continue; }
					if(board[ny][nx] != '.') { continue; }
					
					if(costs[ny][nx] <= cost) { continue; }
					costs[ny][nx] = cost;
					queue.addFirst(cost); queue.addFirst(ny); queue.addFirst(nx);
				}
				
				for(int ny = y - 2; ny <= y + 2; ny++) {
					for(int nx = x - 2; nx <= x + 2; nx++) {
						if(!in_range(nx, ny, W, H)) { continue; }
						if(board[ny][nx] != '.') { continue; }
						
						final int next_cost = cost + 1;
						if(costs[ny][nx] <= next_cost) { continue; }
						costs[ny][nx] = next_cost;
						queue.add(nx); queue.add(ny); queue.add(next_cost);
					}
				}
			}
			
			System.out.println(costs[dh][dw] == Integer.MAX_VALUE ? -1 : costs[dh][dw]);
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
