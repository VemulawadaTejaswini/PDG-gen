import java.util.Arrays;
import java.util.Scanner;

public final class Frog1{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stone = new int[n];
        int diff2 = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
          	stone[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        for(int i=0; i<n; i++){
            if(i>0){
                if(i>1){
                    diff2 = dp[i-2]+Math.abs(stone[i]-stone[i-2]); 
                    // System.out.println(dp[i-1]+" "+dp[i-2]);
                }
                int diff = dp[i-1]+Math.abs(stone[i]-stone[i-1]);
                dp[i] = Math.min(diff,diff2);
            }
        }
        System.out.println(dp[n-1]);
        // for(int i=0; i<n; i++){
        //     System.out.print(dp[i]+" ");
        // }
        sc.close(); 
    }
}