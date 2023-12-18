import java.util.Arrays;
import java.util.Scanner;

public final class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] stone = new int[n];
        int diff2 = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
          	stone[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1; i<n; i++){
            for(int j=1; j<=k; j++){
                if(i-j>=0)
                    diff2  = dp[i-j] + Math.abs(stone[i]-stone[i-j]);
                else
                    diff2 = Integer.MAX_VALUE;
                // System.out.println(dp[j]+" "+diff2);        
                dp[i] = Math.min(dp[i],diff2);
            }
        }
        // for(int i=0; i<n; i++){
        //     System.out.print(dp[i]+" ");
        // }
        System.out.println(dp[n-1]);
        sc.close(); 
    }
}