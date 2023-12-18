import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		new Main().run();
	}
	
	public void run()
	{
		Scanner file = new Scanner(System.in);
		int R = file.nextInt();
		int G = file.nextInt();
		int B = file.nextInt();
		int[] ints = new int[]{R,G,B};
		int N = file.nextInt();
		int[][] dp = new int[4][N+1];
		dp[0][0] = 1;
		for(int i = 1;i<dp.length;i++)
		{
			for(int j = 0;j<dp[i].length;j++)
			{
				dp[i][j] = dp[i-1][j];
				if(ints[i-1]<=j)
					dp[i][j] += dp[i][j-ints[i-1]];
			}
		}
		System.out.println(dp[3][N]);
	}
	
}
