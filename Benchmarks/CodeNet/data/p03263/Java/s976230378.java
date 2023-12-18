import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static class Move {
		int fx, fy, gx, gy;
		
		public Move(int fx, int fy, int gx, int gy) {
			this.fx = fx;
			this.fy = fy;
			this.gx = gx;
			this.gy = gy;
		}
		
		public String toString() {
			return this.fy + " " + this.fx + " " + this.gy + " " + this.gx;
		}
	}
	
	public static int[][] move_dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	public static boolean in_range(int x, int y, int W, int H) {
		return 0 <= x && x < W && 0 <= y && y < H;
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			
			int[][] board = new int[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					board[i][j] = sc.nextInt();
				}
			}
			
			ArrayList<Move> moves = new ArrayList<Move>();
			
			boolean[][] moved = new boolean[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(board[i][j] % 2 == 1) {
						for(final int move[] : move_dirs) {
							final int ni = i + move[0];
							final int nj = j + move[1];
							
							if(!in_range(nj, ni, W, H)) { continue; }
							if(moved[ni][nj]) { continue; }
							if(board[ni][nj] % 2 == 0) { continue; }
							
							moved[ni][nj] = true;
							board[i][j] += 1;
							board[ni][nj] -= 1;
							
							moves.add(new Move(nj + 1, ni + 1, j + 1, i + 1)); break;
						}
					}
				}
			}
			
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(board[i][j] % 2 == 0) {
						int cnt = 0;
						
						for(final int move[] : move_dirs) {
							final int ni = i + move[0];
							final int nj = j + move[1];
							
							if(!in_range(nj, ni, W, H)) { continue; }
							if(moved[ni][nj]) { continue; }
							if(board[ni][nj] % 2 == 0) { continue; }
							
							cnt += 1;
						}
						
						if(cnt == 0 || cnt % 2 != 0) { continue; }
						
						for(final int move[] : move_dirs) {
							final int ni = i + move[0];
							final int nj = j + move[1];
							if(!in_range(nj, ni, W, H)) { continue; }
							if(moved[ni][nj]) { continue; }
							if(board[ni][nj] % 2 == 0) { continue; }
							
							moved[ni][nj] = true;
							board[i][j] += 1;
							board[ni][nj] -= 1;
							
							moves.add(new Move(nj + 1, ni + 1, j + 1, i + 1));
						}
					}
				}
			}
			
			System.out.println(moves.size());
			for(final Move move : moves) {
				System.out.println(move);
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