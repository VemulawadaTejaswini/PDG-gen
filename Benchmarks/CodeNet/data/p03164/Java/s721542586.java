import java.util.Scanner;

class Main{
   
 public static void main(String... args){
      final int INF = -(int)(10e9 + 7);
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int W = sc.nextInt();

   	  int V = 1000*100;
      //dp[i] = minimum weight by having exact value of i.
      //since here value <= 10^3 so dp[] dimension is taken as value
      //and not weight because weight <= 10^9
      long[] dp = new long[V+1]; //if all N<= 100 items are of value 1000.
      for(int i = 0; i < N; i++){
        int weight = sc.nextInt();
        int value = sc.nextInt();
        for(int existing_val = value; existing_val <= V; existing_val++){
          if(existing_val >= value){
          	dp[existing_val] = Math.min(dp[existing_val], dp[existing_val - value] + weight);
          }
        }
      }
   
   	  long ans = 0;
      for(int i = 0; i <= V; i++){
      	ans = Math.min(ans, dp[i]);
      }
      System.out.println(ans);
   
      if(sc != null)
        sc.close();
  }
}
