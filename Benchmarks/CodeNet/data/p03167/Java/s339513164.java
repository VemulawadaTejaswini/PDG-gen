import java.util.*;
import java.io.*;
public class Main {
    public static int solve(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int dp[][] = new int[n][m];
        dp[0][0] = 1;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                int ans = 0;
                if(i-1 >= 0 && arr[i-1][j] != 1){
                    ans = dp[i-1][j];
                }
                if(j-1 >= 0 && arr[i][j-1] != 1){
                    ans += dp[i][j-1];
                }
                dp[i][j] += ans % 1000000007;
            }
        }
        return dp[n-1][m-1];
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m =s.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            String str = s.next();
            for(int j = 0 ; j < str.length() ; j++){
                char a = str.charAt(j);
                if(a == '#'){
                    arr[i][j] = 1;
                }
            }
        }        
        System.out.println(solve(arr));
    }
}