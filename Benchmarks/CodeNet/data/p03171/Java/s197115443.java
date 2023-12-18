

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;

    private static int n;
    private static int[] a;
    private static long[][][] dp;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n];
        
        dp = new long[n][n][2];
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		dp[i][j][0]=dp[i][j][1]=-1;
        	}
        }

        for(int i=0; i<n; i++) a[i] = in.nextInt();

        System.out.println(solve(0, n-1, 0));

    }
    
    private static long solve(int left, int right, int who) {
        if (left==right) {
            if (who==0) return a[left];
            else return -1*a[left];
        } 
        
        if (dp[left][right][who]!=-1) return dp[left][right][who];

        if (who==0) {
            return dp[left][right][who]=Math.max(a[left]+solve(left+1, right, 1-who), a[right]+solve(left, right-1, 1-who));
        } else {
            return dp[left][right][who]=Math.min(-1*a[left]+solve(left+1, right, 1-who), -1*a[right]+solve(left, right-1, 1-who));
        }

    }

}
