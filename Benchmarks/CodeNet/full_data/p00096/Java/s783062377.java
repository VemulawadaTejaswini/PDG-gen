
import java.lang.*;
import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {
        int[][] dp = new int[5][4001];
        dp[0][0] = 1;
        
        for(int i = 1; i < 5; i++){
            for(int j = 0; j <= 4000; j++){
                int k;
                if(j == 0) dp[i][j] = dp[i-1][j];
                else{
                    if(j > 1000) k = j - 1000;
                    else k = j;
                    
                    dp[i][k] = dp[i-1][k] + dp[i][k-1];
                }
            }
        }
        
        
        while( sc.hasNext() ){
            System.out.println( dp[4][sc.nextInt()] );
        }
        
    }
}

	    
	    