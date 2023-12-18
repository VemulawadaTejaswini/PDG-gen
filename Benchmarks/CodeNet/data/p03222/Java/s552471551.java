import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int K=sc.nextInt()-1;
		long MOD=1_000_000_007;
		long[][] dp=new long[H+1][W+2];
		for(int i=0; i<=H; i++) {
			Arrays.fill(dp[i],0);
		}
		dp[0][1]=1;
		for(int h=0; h<H; h++) {
			for(int b=0; b<(1<<(W-1)); b++) {	//bit全探索
				boolean judge=true;
				for(int i=0; i<W-2; i++) {
					if((b>>i)%4==3) {
						judge=false;
					}
				}
				if(!judge) {
					continue;
				}
				int[] perm=new int[W];
				for(int i=0; i<W; i++) {
					perm[i]=i;
				}
				for(int i=0; i<W-1; i++) {
					if(((b>>i) & 1)==1) {
						int tmp=perm[i];
						perm[i]=perm[i+1];
						perm[i+1]=tmp;
					}
				}
				for(int i=0; i<W; i++) {
					dp[h+1][perm[i]]+=dp[h][i];
					dp[h+1][perm[i]]%=MOD;
				}
			}
		}
		pl(dp[H][K]);
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
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
}