import java.util.Scanner;

class Main{
   
 public static void main(String... args){
      final int (int)(10e9 + 7);
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int W = sc.nextInt();

   	  int V = 1000*100;
      //dp[i] = minimum weight by having exact value of i.
      //since here value <= 10^3 so dp[] dimension is taken as value
      //and not weight because weight <= 10^9
      int[] dp = new int[1000*100+1]; //if all N<= 100 items are of value 1000.
      for(int i = 0; i < N; i++){
        int weight = sc.nextInt();
        int value = sc.nextInt();
        for(int existing_val = value; existing_value <= V; existing_value++){
          if(existing_value >= value){
          	dp[existing_val] = Math.min(dp[existing_value], dp[existing_val - value] + weight);
          }
        }
      }
   
   	  int ans = 0;
      for(int i = 0; i <= V; i++){
      	ans = Math.min(ans, dp[i]);
      }
      System.out.println(ans);
   
      if(sc != null)
        sc.close();
  }
}
