import java.util.*;
public class Main 
{
	static int[] dp = new int[32];
	static void DPCalc()
	{
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 0; i < 28; ++i)
		{
			dp[i + 3] = dp[i] + dp[i + 1] + dp[i + 2];
		}
	}
	
	public static void main(String[] args) 
	{
		DPCalc();
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int num = stdIn.nextInt();
			if(num == 0)
			{
				break;
			}
			System.out.println(dp[num] / 365 / 10 + 1);
		}
	}
}