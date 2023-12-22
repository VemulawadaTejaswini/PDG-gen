import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int n=in.nextInt(),max=-10000000;
			if(n==0)break;
			
			int dp[]=new int[n];
			for(int i=0;i<n;i++)dp[i]=in.nextInt();
			
			for(int i=0;i<n-1;i++) {
				if(dp[i]+dp[i+1]>dp[i+1]) dp[i+1]=dp[i]+dp[i+1];
				max=Math.max(max,dp[i+1]);
			}
			
			System.out.println(max);
		}
	}

}
