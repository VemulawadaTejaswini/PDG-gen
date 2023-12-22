import java.util.*;
class Main{
	public static final int INF=10000000;
	public static void main(String[] args){
		Scanner stdin=new Scanner(System.in);
		int coin[]=new int [1000];
		int dp[][]=new int[21][50001]; // m,n;
		int n=stdin.nextInt();
		int m=stdin.nextInt();
		for(int i=1;i<=m;i++) coin[i]=stdin.nextInt();

		for(int i=0;i<=n;i++){
			for(int j=0;j<=m;j++){
				dp[j][i]=INF;
			}
		}
		for(int j=0;j<=m;j++) dp[j][0]=0;

		//    ??????
		// ??¨ 0 M M M
		// ??? 0 M M M
		// ??? 0 M M M
		
		for(int i=1;i<=m;i++){
			for(int j=coin[i];j<=n;j++){
					if(dp[i][j-coin[i]]+1<dp[i-1][j]){
						for(int k=i;k<=m;k++) dp[k][j]=dp[i][j-coin[i]]+1;
					}
					else{
						for(int k=i;k<=m;k++) dp[k][j]=dp[i-1][j];
					}
			}
		}
		/*
		for(int i=0;i<=m;i++){
			System.out.print("col:");
			for(int j=0;j<=n;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println("");
		}
		*/
		//System.out.println("answer:"+m+" "+n+" "+dp[m][n]);
		System.out.println(dp[m][n]);
	}
}