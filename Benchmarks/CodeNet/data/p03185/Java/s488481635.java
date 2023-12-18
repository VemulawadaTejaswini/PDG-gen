import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long c = in.nextLong();
        
        long dp[] = new long[n];
        long arr[] = new long[n];
        
        for(int i=0; i<n; i++){
         arr[i] = in.nextLong();    
        }
        dp[0] = 0;
        dp[1] = (long)Math.pow(arr[1]-arr[0],2)+c;
   
        for(int i=2; i<arr.length; i++){
            long min = Long.MAX_VALUE;
            for(int j=0; j<i;j++){
                long temp = dp[j]+(long)Math.pow(arr[i]-arr[j],2)+c;
                min = Math.min(min,temp);
                dp[i]= min;
            }
        }
        
        System.out.println(dp[n-1]);
      
        
        
  
    }
}