import java.util.*;
import java.io.*;

public class Main {
  
   public static void main(String[]abc){
      Main ans = new Main();
      int sol = ans.solve();
      System.out.println(sol);
   }
  
   private int solve() {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      int [] array = new int[N+1];
      for(int i=1;i<=N;i++) {
         array[i] = sc.nextInt();        
      }
      int [] dp = new int[N+1];
      Arrays.fill(dp, Integer.MAX_VALUE);
      dp[1]=0;
      dp[0]=0;
      for(int i=2;i<=N;i++){
         for(int j=0;j<=K;j++){
            if (i-j>=1 && i+j<=N){
                int diff = Math.abs(array[i+j]-array[i]);
            	dp[i] = Math.min(dp[i], dp[i-j]+ diff);
 			}
         }
      }
     return dp[N];
      
      
   }
}
