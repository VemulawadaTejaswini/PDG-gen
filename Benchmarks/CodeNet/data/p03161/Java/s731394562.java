import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n; n =in.nextInt();
		int k; k = in.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i++) h[i]=in.nextInt();
		int[] dp = new int[n];
		for(int i=0;i<n;i++) dp[i]=1000000000;
		dp[0]=0;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=k;j++)
			{
				if(i-j>=0) dp[i]=Math.min(dp[i], dp[i-j]+Math.abs(h[i]-h[i-j]));
			}
		}
		//for(int i=0;i<n;++i) System.out.println(dp[i]);
		System.out.print(dp[n-1]);
	}
}
