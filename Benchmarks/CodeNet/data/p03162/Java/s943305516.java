import java.util.Scanner;
import java.util.*;
public class Main {
	
	
	
	public static int Vacation(int n, int h[][]) {
		int dp[][] = new int[n][3];
		
		dp[0][0] = h[0][0];
		dp[0][1] = h[0][1];
		dp[0][2] = h[0][2];
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<3;j++) {
				if(j == 0) {
					dp[i][j] = Math.max(h[i][j] + dp[i-1][1],h[i][j] + dp[i-1][2] );
				}
				else if(j == 1) {
					dp[i][j] = Math.max(h[i][j] + dp[i-1][0],h[i][j] + dp[i-1][2] );
				}
				else if(j == 2) {
					dp[i][j] = Math.max(h[i][j] + dp[i-1][0],h[i][j] + dp[i-1][1] );
				}
			}
		}
		
		int max = Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
		return max;
		
		
	}
    
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int h[][] = new int[n][3];
        for(int i=0;i<n;i++) {
        	int s1 = s.nextInt();
        	int s2 = s.nextInt();
        	int s3 = s.nextInt();
        	h[i][0] =s1;
        	h[i][1] =s2;
        	h[i][2] =s3;
        }
        System.out.println(Vacation(n,h));
    }
}