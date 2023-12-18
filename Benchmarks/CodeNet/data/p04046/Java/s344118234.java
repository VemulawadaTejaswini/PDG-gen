import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        long dp[][] = new long[m][n];

        for(int i = m-1 ; i >= m-a ;i--){
            for(int j = 0; j < b;j++){

                dp[i][j] = Long.MAX_VALUE;
            }
        }

        for(int i = m-2 ; i >= 0 ; i--){
            if(dp[i][n-1] != Long.MAX_VALUE ) {
                dp[i][n - 1] = 1;
            }else{
                break;
            }
        }

        for(int i = n-2 ; i >= 0 ; i--){

            if(dp[m-1][i] != Long.MAX_VALUE ) {
                dp[m - 1][i] = 1;
            }else{
                break;
            }
        }

        for(int i = m-2; i >= 0 ;i--){
            for(int j = n-2 ; j >= 0 ; j--){

                if(dp[i][j] == Long.MAX_VALUE){
                    continue;
                }

                if(dp[i+1][j] == Long.MAX_VALUE){
                    dp[i][j] = dp[i][j+1];
                    continue;
                }

                dp[i][j] = dp[i][j+1] + dp[i+1][j];
            }
        }

        System.out.println(dp[0][0]);
    }
}
