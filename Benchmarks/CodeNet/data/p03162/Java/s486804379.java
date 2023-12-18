import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] points = new int[n+1][3];
		for(int i=1;i<=n;i++){
		    points[i][0] =scn.nextInt();
		    points[i][1] =scn.nextInt();
		    points[i][2] =scn.nextInt();
		}
		// System.out.println(maxHappiness(1,points,-1));
		int[][] memo = new int[n+1][3];
		System.out.println(maxHappiness_dp(1,points));

	}


    public static int maxHappiness_dp(int day, int[][] points) {
		int len = points.length;
		int[][] dp = new int[len][3];
		for (int cday = len - 1; cday > 0; cday--) {
			for (int ca = 0; ca < 3; ca++) {

				if (cday == points.length - 1) {
					dp[cday][ca] = points[cday][ca];
					continue;
				}

				int ans = Integer.MIN_VALUE;
				for (int i = 0; i < 3; i++) {
					if (i != ca) {
						int ch = points[cday][ca] + dp[cday + 1][i];
						//maxHappiness_memoized(day + 1, points, i, memo);
						ans = Math.max(ans, ch);
					}
				}

				dp[cday][ca] = ans;
			}
		}
		return Math.max(dp[1][0], Math.max(dp[1][1], dp[1][2]));
	}
	
}
