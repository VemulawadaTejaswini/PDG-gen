
import java.util.*;

public class Main {// Main
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] dp = new int[n+1];
     for(int i = 0 ; i < n-1 ; i++) {
    	 dp[sc.nextInt()]++;
     }
     for(int i = 1 ; i <= n ; i++) {
    	System.out.println(dp[i]);
     }
	}

	
}