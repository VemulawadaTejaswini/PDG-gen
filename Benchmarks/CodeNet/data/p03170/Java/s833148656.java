import java.util.*;
import java.io.*;
public class Main {
    public static int arr[];
    public static int dp[] ;
    public static int solve(int k){
        
        dp = new int[k+1];
        for(int i = 0 ; i <= k ; i++){
            dp[i] = -1;
        }

        if(k < 0){
            return 0;
        }
        
        dp[0] = 0;
        
        for(int i = 1 ; i <= k ; i++){
            dp[i] = 0;
            for(int j = 0 ; j < arr.length ; j++){
                if(i-arr[j] >= 0 && dp[i - arr[j]] == 0){
                    dp[i] = 1;
                }
            } 
        }

        return dp[k];
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt();
        }

        int ans = solve(k);

        if(ans == 1) System.out.println("First");
        else System.out.println("Second");
    }
}