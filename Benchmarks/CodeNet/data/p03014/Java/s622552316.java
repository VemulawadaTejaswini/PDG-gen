import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			
			boolean[][] isBlock = new boolean[H][W];
			for(int i = 0; i < H; i++) {
				final char[] chs = sc.next().toCharArray();
				
				for(int j = 0; j < W; j++) {
					isBlock[i][j] = chs[j] == '#';
				}
			}
			
			int[][] LS = new int[H][W];
			int[][] RS = new int[H][W];
			int[][] US = new int[H][W];
			int[][] DS = new int[H][W];
			
			for(int i = 0; i < H; i++) {
				for(int j = 1; j < W; j++) {
					LS[i][j] = (isBlock[i][j] ? 0 : LS[i][j - 1] + 1); 
				}
				for(int j = W - 2; j >= 0; j--) {
					RS[i][j] = (isBlock[i][j] ? 0 : RS[i][j + 1] + 1); 
				}
			}
			
			for(int j = 0; j < W; j++) {
				for(int i = 1; i < H; i++) {
					US[i][j] = (isBlock[i][j] ? 0 : US[i - 1][j] + 1);
				}
				for(int i = H - 2; i >= 0; i--) {
					DS[i][j] = (isBlock[i][j] ? 0  :DS[i + 1][j] + 1);
				}
			}
			
			int answer = 0;
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(isBlock[i][j]) { continue; }
					answer = Math.max(answer, US[i][j] + LS[i][j] + DS[i][j] + RS[i][j]);
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