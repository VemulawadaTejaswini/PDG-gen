import java.util.Scanner;

public class Main 
{
	static long[][] dp;
	
	static long[] gc;
	static long[] cg;
	static long[] ggc;
	static long[] tgc;
	static long[] gtc;
	static long[] ac;
	static int n;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		dp = new long[n+4][4]; //A C G T
		
		gc = new long[n+4];
		cg = new long[n+4];
		ggc = new long[n+4];
		tgc = new long[n+4];
		gtc = new long[n+4];
		ac = new long[n+4];
		
		
		
		long MOD = 1000000007;
		
		for(int i = n-1; i >= 0; i--)
		{
			if(i==n-1)
			{
				for(int j = 0; j < 4; j++)
					dp[i][j] = 1;
			}
			
			//A
			else
			{
				gc[i] = dp[i+1][1];
				cg[i] = dp[i+1][2];
				ac[i] = dp[i+1][1] - cg[i+1]; //ac minus! acg shouldn't be counted.
				
				ggc[i] = gc[i+1];
				tgc[i] = gc[i+1];
				gtc[i] = gc[i+1]; //tc = gc?
				for(int l = 0; l < 4; l++)
				{
					for(int k = 0; k < 4; k++)
					{
						dp[i][l] = (dp[i][l] + dp[i+1][k])%MOD;
					} //A C G T
					 //gc cg ggc tgc gtc ac
					if(l == 0)
					{
						dp[i][l] = (dp[i][l] - gc[i+1] - cg[i+1] - ggc[i+1] - tgc[i+1] - gtc[i+1])%MOD;

					}
					else if(l == 2)
						dp[i][l] = (dp[i][l] - ac[i+1])%MOD;
						
					while(dp[i][l]<0)dp[i][l]+=MOD;
				}
			}
		}
		
		
		long sum = 0;
		for(int i = 0; i < 4; i++)
		{
			sum = (sum + dp[0][i])%MOD;
		}
		
		System.out.println(sum);

	}

}
