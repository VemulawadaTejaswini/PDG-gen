import java.util.Scanner;

class Main{
   
 public static void main(String... args){
      final int INF = (int)(10e9 + 7);
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int W = sc.nextInt();

      int[] weight = new int[N];
      int[] value = new int[N];
      
      int sum_value = 0;
      for(int i = 0; i < N; i++){
        weight[i] = sc.nextInt();
        value[i] = sc.nextInt();
        sum_value += value[i];
      }
   
      //dp[i] = minimum weight by having exact value of i.
      //since here value <= 10^3 so dp[] dimension is taken as value
      //and not weight because weight <= 10^9
      long[] dp = new long[sum_value+1]; //if all N items are of value 1000.
      for(int i=0; i <= sum_value; i++){
      	dp[i] = INF;
      }
        
      dp[0] = 0;
      for(int i = 0; i < N; i++){
        for(int existing_val = 0; existing_val <= sum_value; existing_val++){
          if(existing_val >= value[i]){
          	dp[existing_val] = Math.min(dp[existing_val], 
                                        dp[existing_val - value[i]] + weight[i]);
          }
        }
      }
   
   	  long ans = 0;
      for(int i = 0; i <= sum_value; i++){
      	ans = Math.min(ans, dp[i]);
      }
      System.out.println(ans);
   
      if(sc != null)
        sc.close();
  }
}
