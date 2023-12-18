import java.util.*;
import java.io.*;

public class Main {
  
   public static void main(String []abc){
      Main sol = new Main();
      long answer = sol.solve();
      System.out.println(answer);
   }
  
  private long solve() {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     long [] array = new long [N];
     for(int i=0;i<N;i++) {
        array[i] = sc.nextLong();
     }
     long dp[] = new long[N+1];
     for(int i=0;i<N;i++) {
       if (i==0) dp[i]=0;
       else if (i==1) dp[i] = Math.abs(array[i]-array[i-1]);
       else {
         dp[i] = Math.min(dp[i-1]+ Math.abs(array[i]-array[i-1]), dp[i-2]+Math.abs(array[i]-array[i-2]));
       }
       //System.out.printf("dp[%d]: %d\n", i, dp[i]);
     }      
     return dp[N-1];
  }
         
}
    
    
