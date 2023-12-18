import java.util.*;

public class Main{
	public static int[][] value,dp;
	public static int i,j;


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		value=new int[N+1][3];
		dp=new int[N+1][3];

		//valueの読み込み
		for(int i=1;i<=N;i++){
			for (int k=0;k<=2;k++){
			value[i][k]=sc.nextInt();
			}
		}
		//dpの初期化
		for(int i=1;i<=N;i++){
			for (int k=0;k<=2;k++){
			dp[i][k]=0;
			}
		}
		for (int i=0;i<=2;i++){
			dp[1][i]=value[1][i];
		}
		//dp_change
		for (i=1;i<=N;i++) {
			for (j=0;j<=2;j++) {
			chmax(i,j);
			}
		}
		System.out.println(Math.max(dp[N][0],Math.max(dp[N][1],dp[N][2])));
}
	//dp更新用の関する定義
	public static void chmax(int i,int j){
		dp[i][j]=Math.max(dp[i-1][(j+1)%3]+value[i][j],dp[i-1][(j+2)%3]+value[i][j]);
	}
}