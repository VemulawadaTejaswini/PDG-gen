package asample;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){


			int n =sc.nextInt();
			int m =sc.nextInt();
			if(n+m==0)break;
			long[][]dp=new long[n][m];
			int k = sc.nextInt();
			for(int i=0;i<k;i++){
				dp[sc.nextInt()-1][sc.nextInt()-1]=-1;
			}
			dp[0][0]=1;
			for (int i = 0; i < dp.length; i++) {
				for (int j = 0; j < dp[i].length; j++) {
					if(dp[i][j]==-1)continue;
					if(i-1>=0){
						if(dp[i-1][j]!=-1){
							dp[i][j]+=dp[i-1][j];
						}
					}
					if(j-1>=0){
						if(dp[i][j-1]!=-1){
							dp[i][j]+=dp[i][j-1];
						}
					}
				}
			}
			System.out.println(dp[n-1][m-1]);
		}
	}

}