import java.util.Scanner;
import java.lang.Math;

class apples {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n; n =in.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i++) h[i]=in.nextInt();
		int[] dp = new int[n];
		for(int i=0;i<n;i++) dp[i]=1000000000;
		dp[0]=0;
		for(int i=1;i<n;i++)
		{
			if(i>=2) dp[i]=Math.min(dp[i-1]+Math.abs(h[i]-h[i-1]), dp[i-2]+Math.abs(h[i]-h[i-2]));
			else dp[i]=dp[i-1]+Math.abs(h[1]-h[0]);
		}
		//for(int i=0;i<n;++i) System.out.println(dp[i]);
		System.out.print(dp[n-1]);
	}
}
