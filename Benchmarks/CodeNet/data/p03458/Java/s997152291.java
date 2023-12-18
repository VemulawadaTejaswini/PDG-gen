import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[][] dp=new long[2*k][2*k];
		for(int i = 0; i<n; i++){
			long x = sc.nextLong();
			long y = sc.nextLong();
			String c = sc.next();
			if(c.charAt(0)=='W'){
				x+=k;
			}
			x%=2*k;
			y%=2*k;
			dp[(int)y][(int)x]++;
		}
		for(int i = 0; i<2*k; i++){
			for(int j = 1; j<2*k; j++){
				dp[i][j]+=dp[i][j-1];
			}
		}
		for(int i = 0; i<2*k; i++){
			for(int j = 1; j<2*k; j++){
				dp[j][i]+=dp[j-1][i];
			}
		}
		long ans = 0;
		for(int i = 0; i<k; i++){
			for(int j = 0; j<k; j++){
				long an=0;
				an+=dp[i][j];
				an+=dp[i+k][j+k]-dp[i][j+k]-dp[i+k][j]+dp[i][j];
				an+=dp[i][2*k-1]-dp[i][j+k];
				an+=dp[2*k-1][j]-dp[i+k][j];
				an+=dp[2*k-1][2*k-1]-dp[i+k][2*k-1]-dp[2*k-1][j+k]+dp[i+k][j+k];
				ans=Math.max(ans,Math.max(an,n-an));
			}
		}
		System.out.println(ans);
	}
}
