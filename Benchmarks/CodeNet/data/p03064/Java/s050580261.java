import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int[] ary=new int[N];
		long MOD=998244353L;
		int sum=0;
		long ans=1L;
		for(int i=0; i<N; i++) {
			ary[i]=sc.nextInt();
			sum+=ary[i];
		}
		for(int i=0; i<N; i++) {
			ans*=3L;
			ans%=MOD;
		}
		long[][] dp=new long[N+1][sum+1];
		for(int i=0; i<=N; i++) {
			Arrays.fill(dp[i],0);
		}
		dp[0][0]=1L;
		for(int i=0; i<N; i++) {
			for(int j=0; j<=sum; j++) {
				if(dp[i][j]>0) {
					dp[i+1][j]+=dp[i][j]*2;
					dp[i+1][j+ary[i]]+=dp[i][j];
					dp[i+1][j]%=MOD;
					dp[i+1][j+ary[i]]%=MOD;
				}
			}
		}
		long biggest=0;
		for(int i=0; i<=sum; i++) {
			if(i>=(sum+1)/2) {
				biggest+=dp[N][i]*3;
				biggest%=MOD;
			}
		}
		long[][] kasanari=new long[N+1][sum+1];
		for(int i=0; i<=N; i++) {
			Arrays.fill(kasanari[i],0);
		}
		kasanari[0][0]=1L;
		for(int i=0; i<N; i++) {
			for(int j=0; j<=sum; j++) {
				if(kasanari[i][j]>0) {
					kasanari[i+1][j]+=kasanari[i][j];
					kasanari[i+1][j+ary[i]]+=kasanari[i][j];
					kasanari[i+1][j]%=MOD;
					kasanari[i+1][j+ary[i]]%=MOD;
				}
			}
		}
		long kaburi=0;
		if(sum%2==0) {
			kaburi=kasanari[N][sum/2]*3;
			kaburi%=MOD;
		}
		else {
			kaburi=0;
		}
		ans-=biggest;
		if(ans<0) {
			ans+=MOD;
		}
		ans+=kaburi;
		pl(ans%MOD);
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
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}