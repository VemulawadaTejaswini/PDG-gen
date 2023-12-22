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
			long[][]dp=new long[100][100];
			int k = sc.nextInt();
			for(int i=0;i<k;i++){
				dp[sc.nextInt()][sc.nextInt()]=-1;
			}
			dp[1][1]=1;
			for (int i = 1; i < dp.length; i++) {
				for (int j = 1; j < dp[i].length; j++) {
					if(dp[i][j]==-1)continue;
					if(dp[i-1][j]!=-1){
						dp[i][j]+=dp[i-1][j];
					}
					if(dp[i][j-1]!=-1){
						dp[i][j]+=dp[i][j-1];
					}
				}
			}
			System.out.println(dp[n][m]);
		}
	}

}