import java.util.*;

public class Main {
    public static void main(String args[]) {
 		Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int [][] input = new int[n][3];
      	for(int i = 0; i < n; i++){ 
          input[i] = new int[3];
          for(int j = 0; j < 3; j++)
          input[i][j] = scan.nextInt();
        }
      	scan.close();
      	System.out.println(solve( input));
	}
  
  	private static int solve(int[][] input){
    	if(input.length == 0) return 0;
        int[][] memo = new int[input.length][3];
        memo[0] = input[0];
        for(int i = 1; i < input.length; i++){
          memo[i] = new int[3];
          memo[i][0] = Math.max(memo[i-1][1], memo[i-1][2]) + input[i][0];
          memo[i][1] = Math.max(memo[i-1][0], memo[i-1][2]) + input[i][1];
          memo[i][2] = Math.max(memo[i-1][0], memo[i-1][1]) + input[i][2];
          
        }
      	int n = input.length - 1;
        return Math.max(memo[n][0], Math.max(memo[n][1], memo[n][2]));
  	}
}