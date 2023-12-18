import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			
			int[][] DP = new int[H][W];
			for(int i = 0; i < H; i++) {
				final char[] chs = sc.next().toCharArray();
				for(int j = 0; j < W; j++) {
					DP[i][j] = chs[j] == '#' ? 0 : Integer.MAX_VALUE / 2;
				}
			}
			
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(i != 0) { DP[i][j] = Math.min(DP[i][j], DP[i - 1][j] + 1); }
					if(j != 0) { DP[i][j] = Math.min(DP[i][j], DP[i][j - 1] + 1); }
				}
			}
			
			for(int i = H - 1; i >= 0; i--) {
				for(int j = W - 1; j >= 0; j--) {
					if(i != H - 1) { DP[i][j] = Math.min(DP[i][j], DP[i + 1][j] + 1); }
					if(j != W - 1) { DP[i][j] = Math.min(DP[i][j], DP[i][j + 1] + 1); }
				}
			}
			
			int answer = 0;
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					answer = Math.max(answer, DP[i][j]);
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