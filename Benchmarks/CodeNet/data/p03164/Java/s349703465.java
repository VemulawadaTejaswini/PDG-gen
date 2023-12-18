import java.util.*;
import java.io.*;

class Item{
   long val, weight;
   public Item(long weight, long val){
      this.weight = weight;
      this.val = val;
   }
   
}
public class Main {
   public static void main(String[]abc) {
      Main ans = new Main();
      long solution = ans.solve();
      System.out.println(solution);
   }
   private long solve() {
      Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      long maxWeight = sc.nextLong();
      // max value of an item is 10000
      long maxValue = N*1000;
      Item [] array = new Item[N];
      for(int i=0;i<N;i++){
         array[i] = new Item(sc.nextLong(),sc.nextLong());
      }
      long [][] dp = new long[N+1][maxValue+1];
      long INF = (long) 1e9+1;
	  for(int val=1;val<=maxValue;val++){
         dp[1][val] = INF;
      }
      dp[1][array[0].val]= array[0].weight;
      dp[1][0] = 0;
      for(int val=2;val<=maxValue;val++){
         for(int i=1;i<=N;i++){
            dp[i][val] = dp[i-1][val];
            if (array[i].val>val) continue;
            dp[i][val] = Math.min(dp[i][val], dp[i-1][val-array[i].val]);
         }
      }
      long bestVal=0;
      for(int val=1;val<=maxValue;val++){
         if (dp[N][val]>maxWeight) continue;
         bestVal = Math.max(bestVal, dp[N][val]);
      }
      return bestVal;
	       
   }
}
