import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		int[] rs = new int[n];
		int[] cs = new int[n];
		
		for(int i = 0; i < n; i++){
			rs[i] = sc.nextInt();
			cs[i] = sc.nextInt();
		}
		
		int[][] DP = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == j){
					DP[i][j] = 0;
				}else{
					DP[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		
		for(int space = 1; space < n; space++){
			for(int start = 0; start < (n - space); start++){
				final int last = start + space;
				
				for(int sep = start; sep < last; sep++){
					DP[start][last] = Math.min(DP[start][last], DP[start][sep] + DP[sep + 1][last] + rs[start] * cs[sep] * cs[last]);
				}
			}
		}
		
		System.out.println(DP[0][n-1]);
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