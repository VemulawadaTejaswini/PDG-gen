import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int m = scn.nextInt();
	int mod=1000000007;
	char[][]board = new char[n][m];
	for(int i=0;i<n;i++)
	{
		String s=scn.next();
		board[i]=s.toCharArray();
		
	}
	int[][]dp = new int[n+1][m+1];
	for(int i=n-1;i>=0;i--)
	{
		for(int j=m-1;j>=0;j--)
		{
			if(i==n-1&&j==m-1)
			{
				dp[i][j]=1;
			}else {
				if(board[i][j]=='.')
					dp[i][j]=((dp[i+1][j])%mod+(dp[i][j+1])%mod)%mod;
			}
		}
	}
	System.out.println(dp[0][0]);
  }
	
}