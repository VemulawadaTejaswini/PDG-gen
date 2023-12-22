
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
            for(int j = 0; j <= 1000*i; j++){
                for(int k = Math.max(0, j-1000); k <= j; k++){
                    dp[i][j] += dp[i-1][k];
                }
            }
        }
        
        while( sc.hasNext() ){
            System.out.println( dp[4][sc.nextInt()] );
        }
        
    }
}

	    
	    