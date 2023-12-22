import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
	    for(int i = 0; i < n; ++i)
		{
	        int gx = stdIn.nextInt();
	        int gy = stdIn.nextInt();
	        int p = stdIn.nextInt();
	        boolean[][][][] stage = new boolean[16][16][16][16];
	        for(int a = 0; a < 16; ++a)
	        {
	        	for(int b = 0; b < 16; ++b)
	        	{
	        		for(int c = 0; c < 16; ++c)
	        		{
	        			for(int d = 0; d < 16; ++d)
	        			{
	        				stage[a][b][c][d] = true;
	        			}
	        		}
	        	}
	        }
	        for(int j = 0; j < p; ++j)
			{
	        	int x1 = stdIn.nextInt();
	            int y1 = stdIn.nextInt();
	            int x2 = stdIn.nextInt();
	            int y2 = stdIn.nextInt();
	            stage[x1][y1][x2][y2] = false;
	            stage[x2][y2][x1][y1] = false;
	        }
	        int[][]dp = new int[17][17];
	        dp[0][0] = 1;
	        dp[1][1] = 1;
	        for(int y = 0; y <= gy; ++y)
			{
	            for(int x = 0; x <= gx; ++x)
				{
	                if(x == 0 && y == 0) continue;
	                if(x > 0 && stage[x - 1][y][x][y])
					{
	                    dp[y + 1][x + 1] += dp[y + 1][x];
	                }
	                if(y > 0 && stage[x][y - 1][x][y])
					{
	                    dp[y + 1][x + 1] += dp[y][x + 1];
	                }
	            }
	        }
			if(dp[gy + 1][gx + 1] == 0)
			{
				System.out.println("Miserable Hokusai!");
	        }
	        else
			{
	        	System.out.println(dp[gy + 1][gx + 1]);
	        }
	    }
	}
}