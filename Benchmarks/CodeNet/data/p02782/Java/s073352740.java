//package AtCoder;
import java.util.*;
public class Main {
	static long m=(long)1e9+7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		long[][] ans=cal(r2,c2);
		long sum=0;
		for(int i=r1;i<=r2;i++)
		{
			for(int j=c1;j<=c2;j++)
			{
				sum+=ans[i][j];
				sum=sum%m;
			}
		}
		System.out.println(sum);

	}
	static long[][] cal(int r,int c)
	{
		long[][] dp=new long[r+1][c+1];
		for(int i=0;i<=r;i++)
			dp[i][0]=1;
		for(int j=0;j<=c;j++)
			dp[0][j]=1;
		dp[0][0]=0;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				dp[i][j]=(dp[i-1][j]+dp[i][j-1])%m;
			}
		}
		
		return dp;
	}

}
