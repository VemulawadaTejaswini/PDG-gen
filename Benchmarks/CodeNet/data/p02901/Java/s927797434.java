import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static int n, m;

	static int[] mask = new int[12];
	static long[] dp = new long[4096];
	static int fullmask = 0;
	static ArrayList<Integer> reachablestates = new ArrayList<Integer>();
	static long INF = 1000000000000l;
	
	public static void main(String[] args) 
	{
		for(int i = 0; i < 4096; i++)
			dp[i] = INF;
		int curm = 1;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = 0; i < 12; i++)
		{
			if(i<n)fullmask += curm;
			mask[i] = curm;
			curm *= 2;
		}
//		dp[fullmask] = 0;
		
		reachablestates.add(0);
		dp[0] = 0;
		
		for(int i = 0; i < m; i++)
		{
			long price = sc.nextLong();
			int opens = sc.nextInt();
			int masker = 0;
			for(int j = 0; j < opens; j++)
			{
				int ch = sc.nextInt()-1;
				masker = masker | mask[ch];
			}
			
			ArrayList<Integer> toadd = new ArrayList<>();
			for(Integer s : reachablestates)
			{
				int after = masker | s;
				if(after != s)
				{
					//update cost
					if(dp[after] == INF)
					{
						toadd.add(after);
					}
					dp[after] = Math.min(dp[after], dp[s] + price);
				}
			}
			for(Integer s : toadd)
				reachablestates.add(s);
			

		}
		if(dp[fullmask]==INF)System.out.println(-1);
		else System.out.println(dp[fullmask]);
		

	}

}
