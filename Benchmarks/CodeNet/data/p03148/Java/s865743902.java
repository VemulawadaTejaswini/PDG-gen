import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[][] dp = new long[n+1][k+1];
		long[] t1= new long[n];
		long[] d1=new long[n];
		for(int i = 0; i < n; i++){
			int t = sc.nextInt();
			long d = sc.nextLong();
			t1[i]=t;
			d1[i]=d;
		}
		for(int i = 0; i<k+1; i++){
			dp[0][i]=0;
		}
		for(int i = 1; i<n+1; i++){
			dp[i][0]=0;
			for(int j=1; j<k+1; j++){
				if(i>=j){
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]+t1[i-1]*t1[i-1]+d1[i-1]);
				}else{
					dp[i][j]=dp[i][j-1];
				}
			}
		}
		System.out.println(dp[n][k]);
	}
}