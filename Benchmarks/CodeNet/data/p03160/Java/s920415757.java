import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
      for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();
      
        int[] dp = new int[n + 1];
        dp[n - 2] = Math.abs(arr[n - 2] - arr[n - 1]);
        for (int i = n - 3; i >= 0; i--) {
            int op1 = Math.abs(arr[i] - arr[i + 1]) + dp[i + 1];
            int op2 = Math.abs(arr[i] - arr[i + 2]) + dp[i + 2];

            dp[i] = Math.min(op1, op2);
          
        }
      
        System.out.println(dp[0]);
    }
}