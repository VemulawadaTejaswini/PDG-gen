import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int W=sc.nextInt();
		int[][] prods=new int[N][2];
		for(int i=0; i<N; i++) {
			prods[i][0]=sc.nextInt();//重さ
			prods[i][1]=sc.nextInt();//価値
		}
		long[][] dp=new long[N+1][W+1];
		for(int i=0; i<=W; i++) {
			dp[0][i]=0;
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<=W; j++) {
				if(j<prods[i][0]) {
					dp[i+1][j]=dp[i][j];
				}
				else {
					dp[i+1][j]=Math.max(dp[i][j], dp[i][j-prods[i][0]]+prods[i][1]);
				}
			}
		}
		pl(dp[N][W]);
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
}