import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;


class Main{
	//今回は、価値は低くて、重さが大きいもののナップサック。
	//いままでは、価値をテーブルに格納していたが、今回は、同じ価値をできるだけ少ない重さで実現しようという計画。
	//その為、dpにminを使う
	public static void main(String[] args){
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int W=sc.nextInt();
		int[][] dp=new int[N+1][N*100+1];	//品物の番号、価値
		int INF=2000000014;
		for(int i=0; i<=N; i++){
			for(int j=0; j<=N*100; j++){
				dp[i][j]=INF;
			}
		}
		dp[0][0]=0;
		int[][] products=new int[N][2];
		for(int i=0; i<N; i++){
			products[i][1]=sc.nextInt();		//重さ
			products[i][0]=sc.nextInt();		//価値
		}

		for(int i=0; i<N; i++){
			for(int j=0; j<=N*100; j++){
				if(j-products[i][0]<0){
					dp[i+1][j]=dp[i][j];		//品物が買えないとき
				}
				else if(j-products[i][0]>=0 && dp[i][j-products[i][0]]+products[i][1]<=W){
					dp[i+1][j]=Math.min(dp[i][j], dp[i][j-products[i][0]]+products[i][1]);
				}
				else{
					dp[i+1][j]=dp[i][j];
				}
			}
		}
		int valmax=0;
		for(int i=0; i<=N*100; i++){
			if(dp[N][i]<=W){
				valmax=i;
			}
		}
		pl(valmax);
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