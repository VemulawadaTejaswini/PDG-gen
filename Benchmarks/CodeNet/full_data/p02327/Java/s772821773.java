import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
//http://www.ipsj.or.jp/07editj/promenade/4304.pdf
//http://algorithms.blog55.fc2.com/blog-entry-131.html
//http://algorithms.blog55.fc2.com/blog-entry-132.html
//http://algorithms.blog55.fc2.com/blog-entry-133.html
//最大正方形の問題はDPだったけど最大長方形は累積和とスタックを組み合わせてる
public class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		/*while(true) {*/
			int h=sc.nextInt();
			int w=sc.nextInt();
			/*if(h*w==0) {
				break;
			}
			else {*/
				int[][] plate=new int[h][w];
				int[][] dp=new int[h][w];
				long[] stacks=new long[w+1];
				int counter=0;
				long mltp=100000000000L;	//スタックで幅と高さを同時に保存する
				long now_h=0;
				long max=0;		//最大長方形の面積
				stacks[0]=0;
				counter++;
				for(int i=0; i<h; i++) {
					for(int j=0; j<w; j++) {
						plate[i][j]=0;
						dp[i][j]=0;
					}
				}
				String s="";
				for(int i=0; i<h; i++) {
					s=sc.nextLine();
					for(int j=0; j<w; j++) {
						if(s.charAt(j*2)=='0') {
							plate[i][j]=0;
						}
						else {
							plate[i][j]=1;
						}
					}
				}

				for(int i=0; i<h; i++) {
					for(int j=0; j<w; j++) {
						if(i==0) {
							if(plate[i][j]==1) {
								dp[i][j]=0;
							}
							else {
								dp[i][j]=1;
							}
						}
						else {
							if(plate[i][j]==1) {
								dp[i][j]=0;
							}
							else {
								dp[i][j]=dp[i-1][j]+1;
							}
						}
					}
				}

				for(int i=0; i<h; i++) {
					stacks=new long[w+1];
					stacks[0]=0;
					counter=0;
					now_h=0;
					counter++;
					for(int j=0; j<w; j++) {
						if(j==0) {	//スタックが空なら追加
							stacks[counter]=((long)j)*mltp+dp[i][j];
							counter++;
						}
						else {
							if(now_h<dp[i][j]) {		//今のほうが高いならスタックに追加
								stacks[counter]=((long)j)*mltp+dp[i][j];
								counter++;
							}
							else if(now_h==dp[i][j]) {	//同じなら何もしない
								//
							}
							else if(now_h>dp[i][j]) {
								while(counter-1>=0 && stacks[counter-1]%mltp>=dp[i][j]) {//例えば今高さが2,3,5,8とはいっていて、いま3が入った時、長方形が維持できるのはさいしょの2,3のみ
									max=Math.max(max,(j-stacks[counter-1]/mltp)*(stacks[counter-1]%mltp));
									//pl(max);
									counter--;
								}
								stacks[counter]=(stacks[counter]/mltp)*mltp+dp[i][j];
								//pl(stacks[counter]);
								counter++;
							}
						}
						now_h=dp[i][j];
					}
					for(int j=counter-1; j>=0; j--) {
						max=Math.max(max, (w-stacks[j]/mltp)*(stacks[j]%mltp));
					}
				}
				pl(max);
			/*}
		}*/
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
