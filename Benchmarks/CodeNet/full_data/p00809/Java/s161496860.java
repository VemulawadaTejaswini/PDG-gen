import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static boolean doNim(final int all, int player, int[] M, int S, boolean[][] is_memo, boolean[][] memo){
		//System.out.println((player % 2 == 0 ? "Your  Team" : "Enemy Team") + " : " + (player / 2 + 1) + "th" + " => "+ S);
		if(is_memo[S][player]){
			return memo[S][player];
		}else if(S == 0){
			is_memo[S][player] = true;
			return memo[S][player] = true;
		}
		
		boolean can_win = false;
		for(int use = M[player]; use >= 1; use--){
			if(!doNim(all, (player + 1) % all, M, Math.max(0, S - use), is_memo, memo)){
				can_win = true;
				break;
			}
		}
		
		is_memo[S][player] = true;
		return memo[S][player] = can_win;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int all = n * 2;
			
			if(n == 0){
				break;
			}
			
			final int S = sc.nextInt();
			int[] M = new int[all];
			for(int i = 0; i < all; i++){
				M[i] = sc.nextInt();
			}
			
			boolean[][] is_memo = new boolean[S + 1][all];
			boolean[][] memo = new boolean[S + 1][all];
			System.out.println(doNim(all, 0, M, S, is_memo, memo) ? 1 : 0);
			
			System.gc();
		}
		
		
		sc.close();
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
			if (tok == null) {
				return false;
			} else {
				return tok.hasMoreTokens();
			}
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

		public void close() throws IOException {
			br.close();
		}
	}

}