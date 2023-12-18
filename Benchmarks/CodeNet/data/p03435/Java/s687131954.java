import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {

	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final int size = 3;
			
			int[][] board = new int[size][size];
			for(int i = 0; i < size; i++){
				for(int j = 0; j < size; j++){
					board[i][j] = sc.nextInt();
				}
			}
			
			for(int a1 = -200; a1 <= 200; a1++){
				for(int a2 = -200; a2 <= 200; a2++){
					for(int a3 = -200; a3 <= 200; a3++){
						final int b1 = board[0][0] - a1;
						final int b2 = board[0][1] - a1;
						final int b3 = board[0][2] - a1;
						
						if(board[1][0] - a2 != b1){ continue; }
						if(board[1][1] - a2 != b2){ continue; }
						if(board[1][2] - a2 != b3){ continue; }
						if(board[2][0] - a3 != b1){ continue; }
						if(board[2][1] - a3 != b2){ continue; }
						if(board[2][2] - a3 != b3){ continue; }
						
						System.out.println("Yes");
						return;
					}
				}
			}
			
			System.out.println("No");
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
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextInt();
			}
			return ret;
		}
 
		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextLong();
			}
			return ret;
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}