
import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m=in.nextInt();
	        int x=in.nextInt();
	        long c=in.nextLong();
	        long max = 0;
	        int[][] dp = new int[n][m];
	        int num = 0;
	        dp[0][0] = in.nextInt();
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j <= m; j++) {
	                 num= in.nextInt();
	            }
	        }
	                for(int i=1;i<n;i++) {
	                	for(int j=0;j<i;i++) {
	                		if (j == 0)
	    	                    dp[i][j] = dp[i - 1][j] + num;
	    	                else
	    	                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + num;
	    	                max = Math.max(dp[i][j], max);
	    	            }
	    	        }
	    	        System.out.println(max);
	                	}
	                		
	              
	                
	        }
	


