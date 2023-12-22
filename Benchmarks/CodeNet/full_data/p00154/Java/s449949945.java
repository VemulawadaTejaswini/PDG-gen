import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int m = stdIn.nextInt();
			List<Integer> listA = new ArrayList<Integer>();
			List<Integer> listB = new ArrayList<Integer>();
			for(int i = 0; i < m; ++i)
			{
				int a = stdIn.nextInt();
				int b = stdIn.nextInt();
				listA.add(a);
				listB.add(b);
			}
			int dp[][] = new int[8][1001];
			dp[0][0] = 1;
			for(int i = 0; i < m; ++i)
			{
				for(int j = 0; j < 1001; ++j)
				{
					for(int k = 0; k <= listB.get(i); ++k)
					{
						if(j + k * listA.get(i) > 1000)
						{
							break;
						}
						dp[i + 1][j + k * listA.get(i)] += dp[i][j];
					}
				}
			}
			int g = stdIn.nextInt();
			while(g-- != 0)
			{
				int declare = stdIn.nextInt();
				System.out.println(dp[m][declare]);
			}
		}
	}
}