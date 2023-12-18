import java.util.*;
public class Main {
    
    static long ks(int weights[], int[] values, int n, int c, long[][] dp){
      
        if(dp[n][c]!=-1) return dp[n][c];
         if(n<=0 || c<=0) return 0;
    
    if(weights[n]>c){
        
         return ks(weights, values, n-1, c, dp);
        
    }
    else{

        long tmp1 = ks(weights, values, n-1, c, dp);
        long tmp2 = values[n] + ks(weights, values, n-1, c-weights[n], dp );
        dp[n][c] = Math.max(tmp1,tmp2);
         return Math.max(tmp1, tmp2);
    }
    
    
    
    }
   
    
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int c = in.nextInt();
     
     int[] values = new int[n+1];
     int[] weights = new int[c+1];
     long dp[][] = new long[n+1][c+1];
     for(int i=0; i<n+1;i++){
         for(int j=0; j<c+1; j++){
             dp[i][j] = -1;
         }
     }
     for(int i=1; i<n+1; i++){
         
         weights[i] = in.nextInt();
         values[i] = in.nextInt();
     }
   
     
     long result = ks(weights, values, n, c, dp);
     System.out.println(result);
    }
}