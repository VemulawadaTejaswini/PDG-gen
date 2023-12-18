import java.util.*;




public class Main{
	public static long[][] weight_value,dp;
	public static int i,j,W;


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		W=sc.nextInt();
		long ans=0;


		weight_value=new long[N+1][3];
		dp=new long[N+1][W+1];

		//weight_valueの読み込み
		for(int i=1;i<=N;i++){
			for (int k=1;k<=2;k++){
			weight_value[i][k]=sc.nextInt();
			}
		}

		//dpの初期化
		for(int i=0;i<=N;i++){
			for (int k=0;k<=2;k++){
			dp[i][k]=Long.MIN_VALUE;
			}
		}

		dp[1][0]=0;
		dp[1][(int) weight_value[1][1]]=weight_value[1][2];


		//dp_change
		for (i=1;i<=N-1;i++) {
			for (j=0;j<=W;j++) {
			chmax(i,j);
			}
		}
		for(i=0;i<=W;i++){
		ans=Math.max(dp[N][i],ans);
		}
		System.out.println(ans);
	}

	//dp更新用の関する定義
	public static void chmax(int i,int j){
		dp[i+1][j]=Math.max(dp[i+1][j],dp[i][j]);
		if(j+weight_value[i+1][1]<=W){
			dp[i+1][(int) (j+weight_value[i+1][1])]=Math.max(dp[i+1][(int) (j+weight_value[i+1][1])],dp[i][j]+weight_value[i+1][2]);
		}

	}
}