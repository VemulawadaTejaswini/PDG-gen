import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		long L=sc.nextLong();
		int N=sc.nextInt();
		long[] migi=new long[N+1];
		long[] hidari=new long[N+1];
		long[][] dp=new long[N+1][4];
		long tmp;
		for(int i=0; i<N; i++) {
			tmp=sc.nextLong();
			migi[1+i]=tmp;
			hidari[N-i]=L-tmp;
			dp[i][0]=0;
			dp[i][1]=0;
			dp[i][2]=0;
			dp[i][3]=0;
		}
		migi[0]=0;
		hidari[0]=0;
		dp[N][0]=0;
		dp[N][1]=0;	// 左の木*10000000+右の木
		dp[N][2]=0;
		dp[N][3]=0;// 左の木*10000000+右の木
		dp[0][0]=0;
		dp[0][1]=10000001;	// 左の木*10000000+右の木
		dp[0][2]=0;
		dp[0][3]=10000001;// 左の木*10000000+右の木
		for(int i=0; i<N; i++) {
			long h1=dp[i][1]/10000000;
			long m1=dp[i][1]%10000000;
			long h2=dp[i][3]/10000000;
			long m2=dp[i][3]%10000000;
			boolean a1=false;
			boolean a2=false;
			dp[i+1][0]=Math.max(dp[i][0]+(migi[(int) m1]-migi[(int) m1-1]), dp[i][2]+(migi[(int) m2]+hidari[(int) h2-1]));
			if(dp[i+1][0]==dp[i][0]+(migi[(int) m1]-migi[(int) m1-1])) {
				a1=true;
			}
			else if(dp[i+1][0]==dp[i][2]+(migi[(int) m2]+hidari[(int) h2-1])) {
				a1=false;
			}
			dp[i+1][2]=Math.max(dp[i][0]+(hidari[(int) h1]+migi[(int) m1-1]), dp[i][2]+(hidari[(int) h2]-hidari[(int) h2-1]));
			if(dp[i+1][2]==dp[i][0]+(hidari[(int) h1]+migi[(int) m1-1])) {
				a2=true;
			}
			else if(dp[i+1][2]==dp[i][2]+(hidari[(int) h2]-hidari[(int) h2-1])) {
				a2=false;
			}
			if(a1) {
				dp[i+1][1]=h1*10000000+(m1+1);
			}
			else if(!a1){
				dp[i+1][1]=h2*10000000+(m2+1);
			}
			if(a2) {
				dp[i+1][3]=(h1+1)*10000000+m1;
			}
			else if(!a2){
				dp[i+1][3]=(h2+1)*10000000+m2;
			}
		}
		pl(Math.max(dp[N][0], dp[N][2]));
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
	public static void p(Object o) {
		System.out.print(o);
	}
}

