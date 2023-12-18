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
		int K=sc.nextInt();
		int INF=1000000007;
		int[] dp=new int[N];
		int[] cost=new int[N];
		for(int i=0; i<N; i++) {
			cost[i]=sc.nextInt();
			dp[i]=INF;
		}
		dp[0]=0;
		if(N>=K) {
			for(int i=1; i<K; i++) {
				for(int j=0; j<i; j++) {
					dp[i]=Math.min(dp[i], dp[j]+Math.abs(cost[i]-cost[j]));
				}
			}
			for(int i=K; i<N; i++) {
				for(int j=i-K; j<i; j++) {
					dp[i]=Math.min(dp[i], dp[j]+Math.abs(cost[i]-cost[j]));
				}
			}
		}
		else {
			for(int i=1; i<N; i++) {
				for(int j=0; j<i; j++) {
					dp[i]=Math.min(dp[i], dp[j]+Math.abs(cost[i]-cost[j]));
				}
			}
		}
		pl(dp[N-1]);
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