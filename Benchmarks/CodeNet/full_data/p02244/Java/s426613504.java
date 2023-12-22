import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static boolean eight(final int c, final int deep, boolean[][] board,boolean[][] queens, Map<Integer, Integer> already) {

		if (deep >= c) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					System.out.print(queens[i][j] ? "Q" : ".");
				}
				System.out.println();
			}

			return true;
		} else {
			if(already.containsKey(deep)){
				final int pos = already.get(deep);
				
				if(board[deep][pos]){
					return false;
				}
				
				boolean[][] copy = new boolean[8][8];
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						copy[i][j] = board[i][j];
					}
				}
				queens[deep][pos] = true;
				
				for (int dx = -1; dx <= 1; dx++) {
					final int dy = 1;
					int y = deep, x = pos;

					while (y >= 0 && y < 8 && x >= 0 && x < 8) {
						board[y][x] = true;

						x += dx; y += dy;
					}
				}
				
				if (eight(c, deep + 1, board, queens, already)) {
					return true;
				}
				
				queens[deep][pos] = false;
				
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						board[i][j] = copy[i][j];
					}
				}
			}else{
				for(int pos = 0; pos < 8; pos++){
					if(board[deep][pos]){
						continue;
					}
					
					boolean[][] copy = new boolean[8][8];
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 8; j++) {
							copy[i][j] = board[i][j];
						}
					}
					queens[deep][pos] = true;
					
					for (int dx = -1; dx <= 1; dx++) {
						final int dy = 1;
						int y = deep, x = pos;

						while (y >= 0 && y < 8 && x >= 0 && x < 8) {
							board[y][x] = true;

							x += dx; y += dy;
						}
					}
					
					if (eight(c, deep + 1, board, queens, already)) {
						return true;
					}
					
					queens[deep][pos] = false;
					
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 8; j++) {
							board[i][j] = copy[i][j];
						}
					}
				}
			}
		}

		return false;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		boolean[][] board = new boolean[8][8];
		boolean[][] queens = new boolean[8][8];

		HashMap<Integer, Integer> already = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			final int r = sc.nextInt();
			final int c = sc.nextInt();
			
			already.put(r, c);
		}

		eight(8, 0, board, queens, already);

	}

	public static class Scanner {
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

		public void close() throws IOException {
			br.close();
		}
	}

}