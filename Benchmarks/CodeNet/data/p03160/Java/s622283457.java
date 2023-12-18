import java.io.*;
import java.util.*;
import java.math.*;
class Solution{
 	public static void main(String args[])throws IOException{
     	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	 int n = Integer.parseInt(br.readLine());
      	 int[] input = new int[n];
      	 String str = br.readLine();
      	 String[] strs = str.split(" ");
      	 for(int i = 0;i < n;i++){
         	  input[i] = Integer.parseInt(strs[i]);
         }
      	 if(n <= 1)	System.out.print("0");
         else if(n == 2)	System.out.print(Math.abs(input[0] - input[1]));
         else{
          	int[] dp = new int[n];
            dp[0] = 0;
            dp[1] = Math.abs(input[0] - input[1]);
            for(int i = 2;i < n;i++){
            	dp[i] = Integer.MAX_VALUE;
              	for(int j = i-1;j >= i-2;j--){
                	dp[i] = Math.min(dp[j] + Math.abs(input[i] - input[j]),dp[i]);  
                }
            }
           System.out.print(dp[n-1]);
         }
    }
}