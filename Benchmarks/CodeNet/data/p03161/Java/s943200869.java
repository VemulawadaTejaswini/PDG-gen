import java.util.*;

public class Main {
    public static void main(String args[]) {
 		Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int k = scan.nextInt();
      	int [] input = new int[n];
      	for(int i = 0; i < n; i++){ input[i] = scan.nextInt();}
      	scan.close();
      	System.out.println(solve(k, input));
	}
  
  private static int solve(int k, int[] input){
    if(input.length == 0) return 0;
    int[] dp = new int[input.length];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    for(int i = 1; i < dp.length; i++){
    	for(int j = 0; j < k && (j + i < dp.length); j++){
          dp[i + j] = Math.min(dp[i+j], Math.abs(input[i-1] - input[i+j]) + dp[i-1]);
        }      
    }
    return dp[dp.length -1];
  }
}