import java.util.Scanner;
public class Main
{
	int N,M;
	int[] C,x;
	int[][] dp;
	public void solve()
	{
		Scanner cin = new Scanner(System.in);
		while(true)
		{
			N = cin.nextInt();
			M = cin.nextInt();
			if(N == 0 && M == 0)break;
			C = new int[M];
			x = new int[N];
			dp = new int[N + 1][600];
			for(int i = 0;i < M;i++)C[i] = cin.nextInt();
			for(int i = 0;i < N;i++)x[i] = cin.nextInt();
			for(int i = 0;i < N + 1;i++)
			{
				for(int j =0;j < 600;j++)
				{
					if(i == 0)
					{
						dp[i][j] = 0;
						continue;
					}
					dp[i][j] = Integer.MAX_VALUE;
				}
			}
			for(int i = 0;i < N;i++)
			{
				if(i == 0)
				{
					for(int k = 0;k < M;k++)
					{
						int next = 128 + C[k];
						if(128 + C[k] <= 0)next = 0;
						else if(128 + C[k] >= 255)next = 255;
						dp[i + 1][next] = 
							Math.min(dp[i + 1][next],dp[i][128] + (x[i] - next) * (x[i] - next));
					}
				}else
				{
					for(int j = 0; j<= 255;j++)
					{
						if(dp[i][j] == Integer.MAX_VALUE)continue;
						for(int k = 0;k < M;k++)
						{
							int next = j + C[k];
							if(next <= 0) next = 0;
							else if(next >= 255) next = 255;
							dp[i + 1][next] = 
								Math.min(dp[i + 1][next],dp[i][j] + (x[i] - next) * (x[i] - next));
						}
					}
				}
			}
			int ans = Integer.MAX_VALUE;
			for(int i = 0;i <= 255;i++)
			{
				//System.out.println(i + " : " + dp[N][i]);
				ans = Math.min(ans,dp[N][i]);
			}
			System.out.println(ans);
			//System.out.println(dfs(0,128));
		}
		
		
	}
	public static void main(String[] args)
	{
		new Main().solve();
	}
}