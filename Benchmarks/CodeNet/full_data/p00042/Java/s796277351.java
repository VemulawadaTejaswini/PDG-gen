import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		String tmp="";
		String[] product=new String[2];
		int cn=1;
		while(true) {
			int W=sc.nextInt();
			if(W==0) {
				break;
			}
			else {
				int N=sc.nextInt();
				int[][] dp=new int[N+1][W+1];
				int[][] sina=new int[N][2];
				for(int i=0; i<=N; i++) {
					for(int j=0; j<=W; j++) {
						dp[i][j]=0;
					}
				}
				for(int i=0; i<N; i++) {
					tmp=sc.nextLine();
					product=tmp.split(",");
					sina[i][0]=Integer.parseInt(product[1]);
					sina[i][1]=Integer.parseInt(product[0]);
				}
				for(int i=0; i<N; i++) {
					for(int j=0; j<=W; j++) {
						if(j-sina[i][0]<0) {
							dp[i+1][j]=dp[i][j];
						}
						else {
							dp[i+1][j]=Math.max(dp[i][j], dp[i][j-sina[i][0]]+sina[i][1]);
						}
					}
				}
				int min=W;
				int kt=dp[N][W];
				for(int j=W; j>=0; j--) {
					if(kt==dp[N][j]) {
						min=Math.min(min, j);
					}
					else {
						break;
					}
				}
				pl("Case "+cn+":");
				pl(dp[N][W]);
				pl(min);
			}
			cn++;
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

