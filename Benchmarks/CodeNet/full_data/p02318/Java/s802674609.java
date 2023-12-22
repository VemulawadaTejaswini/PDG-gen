import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		String s=sc.next();
		String t=sc.next();
		int[][] dp=new int[len(s)+1][len(t)+1];
		for(int i=0; i<=len(s); i++) {
			for(int j=0; j<=len(t); j++) {
				dp[i][j]=0;
			}
		}		//クソガバ初期化くん

		for(int i=0; i<=len(t); i++) {
			dp[0][i]=i;		//空文字と文字列とのレイヴェンシュタイン距離はその文字列の大きさだから
		}
		for(int i=0; i<=len(s); i++) {
			dp[i][0]=i;
		}

		for(int i=1; i<=len(s); i++) {
			for(int j=1; j<=len(t); j++) {	//LCS系おなじみの1から始まるカウント　0から始まらないのはからの文字列にも何らかの意味があるからだろう
				if(s.charAt(i-1)==t.charAt(j-1)) {
					dp[i][j]=min(dp[i-1][j-1],dp[i][j-1]+1,dp[i-1][j]+1);
				}
				else if(s.charAt(i-1)!=t.charAt(j-1)) {
					dp[i][j]=min(dp[i-1][j-1]+1,dp[i][j-1]+1,dp[i-1][j]+1);
				}
			}
		}
		//ケツの文字の一致不一致しか見れなかった
		System.out.println(dp[len(s)][len(t)]);
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
	static int len(String a) {	//python-like method
		return a.length();
	}
	static int len(Object[] a) {
		return a.length;
	}
	static int max(int a,int b,int c) {
		return Math.max(Math.max(a,b),c);
	}
	static int max(int a,int b,int c,int d) {
		return Math.max(Math.max(a, b),Math.max(c, d));
	}
	static int min(int a,int b,int c) {
		return Math.min(Math.min(a,b),c);
	}
	static int min(int a,int b,int c,int d) {
		return Math.min(Math.min(a, b),Math.min(c, d));
	}
}
