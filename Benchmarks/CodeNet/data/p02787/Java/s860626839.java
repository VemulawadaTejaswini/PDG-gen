import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] dp = new int[h+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		dp[0] = 0;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			for(int j=1;j<=h;j++) {
				if(0<=j-a)
					dp[j] = Math.min(dp[j], dp[j-a]+b);
				else
					dp[j] = Math.min(dp[j], b);
			}
		}
		
		System.out.println(dp[h]);
	}
}