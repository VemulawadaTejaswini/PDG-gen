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
		long MOD=1_000_000_007;
		long[][][][] dp=new long[101][4][4][4];
		long sum=0;
		for(int i=0; i<=100; i++) {
			for(int j=0; j<4; j++) {
				for(int k=0; k<4; k++) {
					for(int l=0; l<4; l++) {
						dp[i][j][k][l]=0;	//初期化
					}
				}
			}
		}
		/*
		 * 0 A
		 * 1 T
		 * 2 G
		 * 3 C
		 */
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				for(int k=0; k<4; k++) {
					dp[3][i][j][k]=1;
				}
			}
		}
		dp[3][0][2][3]=0;
		dp[3][0][3][2]=0;
		dp[3][2][0][3]=0;
		for(int i=4; i<=100; i++) {
			for(int a=0; a<4; a++) {
				for(int b=0; b<4; b++) {
					for(int c=0; c<4; c++) {
						for(int d=0; d<4; d++) {
							if(b==0 && c==2 && d==3) {
								continue;
							}
							if(b==0 && c==3 && d==2) {
								continue;
							}
							if(b==2 && c==0 && d==3) {
								continue;
							}
							if(a==0 && c==2 && d==3) {
								continue;
							}
							if(a==0 && b==2 && d==3) {
								continue;
							}
							if(a==0 && b==2 && c==3) {
								continue;
							}
							else {
								dp[i][b][c][d]+=dp[i-1][a][b][c];
								dp[i][b][c][d]%=MOD;
							}
						}
					}
				}
			}
		}
		for(int j=0; j<4; j++) {
			for(int k=0; k<4; k++) {
				for(int l=0; l<4; l++) {
					sum+=dp[N][j][k][l];
					sum%=MOD;
				}
			}
		}
		pl(sum);
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
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}