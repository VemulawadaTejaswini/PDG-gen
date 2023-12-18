import java.util.*;
 
public class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int t = sc.nextInt();
      int[] arr = new int[t];
      for(int i =0;i<t;i++){
        arr[i]= sc.nextInt();
      }
      int[] dp = new int[t];
      dp[0] = 0;
      dp[1]= Math.abs(arr[0]-arr[1]);
      for(int i =2;i<t;i++){
        int f = dp[i-1]+ Math.abs(arr[i]-arr[i-1]);
        int s = dp[i-2]+ Math.abs(arr[i]-arr[i-2]);
        dp[i]= Math.min(f,s);
      }
      System.out.println(dp[dp.length-1]);
    }
  
}
