//  a typical dynamic programming problem
import  java.util.*;
class Main{

    public static void main(String[] args){
    
        Scanner  s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] dp  = new int[12][100001];
        int[] arr = {1,6,9,36,81,216,729,1296,6561,7776,46656,59049};
        
        for(int i = 0;i < 12;i++){
            
            for(int j = 0;j < 100001;j++){
                
                if(i == 0)
                    dp[i][j] = j;
                else{
                    if(j < arr[i])
                        dp[i][j] = dp[i-1][j];
                    else
                        dp[i][j] = Math.min(dp[i-1][j] , dp[i][j-arr[i]] + 1  );
                }
//                     dp[i][j] = Math.min(dp[i-1][j] , );
                
            }
        }
        /*
        for(int i = 0;i < 6;i++){
            for(int j = 0;j < 18;j++)
                System.out.print("  "+dp[i][j]+" ");
            System.out.println();
        }
        */

        System.out.println(dp[11][n]);
    }
}
