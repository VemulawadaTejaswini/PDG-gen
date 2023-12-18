
import java.util.*;


public class Main{ 


    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int k=s.nextInt();
	int arr[]=new int[n+1];
	
	for(int i=1;i<=n;i++) {
		arr[i]=s.nextInt();
	}
	
	long dp[][]=new long[n+1][k+1];
	int mod=1000000007;
	
	//aapke paas j candies hai and i persons hai
	
	for(int j=0;j<=k;j++) {
		if(j<=arr[1])
		dp[1][j]=1;
		else
		dp[1][j]=0;
	}
	
	for(int i=2;i<=n;i++) {
		for(int j=0;j<=k;j++) {
			if(j==0)
				dp[i][j]=dp[i-1][j];
			else
				dp[i][j]=(mod+dp[i][j-1]+dp[i-1][j]- ((j-1-arr[i]>=0)?dp[i-1][j-1-arr[i]]:0)) % mod;
		}
	}
	
	
	System.out.println(dp[n][k]);
   }
}