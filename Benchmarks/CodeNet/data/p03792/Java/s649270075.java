import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static boolean dfs(final int deep, final int limit, final int n, boolean[][] board){
		//System.out.println(deep + " " + limit + " " + Arrays.deepToString(board));
		if(deep >= limit){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(!board[i][j]){ return false; }
				}
			}
			
			return true;
		}
		

		for(int row = 0; row < n; row++){
			for(int col = 0; col < n; col++){
				
				boolean[] prev_col = new boolean[n];
				boolean[] prev_row = new boolean[n];
				for(int i = 0; i < n; i++){
					prev_col[i] = board[i][col];
					prev_row[i] = board[row][i];
				}
				
				for(int i = 0; i < n; i++){
					board[i][col] = prev_row[i];
				}
				
				if(dfs(deep + 1, limit, n, board)){ return true; }
				
				for(int i = 0; i < n; i++){
					board[i][col] = prev_col[i];
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		if(n > 3){ return; }
		
		boolean[][] board = new boolean[n][n];
		for(int i = 0; i < n; i++){
			final char[] input = sc.next().toCharArray();
			
			for(int j = 0; j < n; j++){
				board[i][j] = input[j] == '#';
			}
		}
		
		boolean flg = false;
		for(int i = 0; i < n; i++){
			if(board[0][i] || board[i][0]){
				flg = true;
				break;
			}
		}
		
		if(flg){
			System.out.println(-1);
			return;
		}
		
		int count = 0;
		while(!dfs(0, count, n, board)){
			count++;
		}
		
		
		System.out.println(count);
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