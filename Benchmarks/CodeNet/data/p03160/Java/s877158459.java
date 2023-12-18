import java.util.*;
public class Main {
   private static int h[];
   private static int dp[];
  public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        h = new int[n];
        dp = new int[n];

        for (int i = 0; i < n; i++) {
          dp[i]=Integer.MAX_VALUE;
          h[i] = sc.nextInt();
        }

		// 30 10 60 10 60 50  
		dp[0] = 0;
		dp[1] = Math.abs(h[0] - h[1]);	//20
		for (int i=2; i < n; i++) {
			dp[i]=chmin(dp[i],dp[i-1]+Math.abs(h[i-1] - h[i]));
			dp[i]=chmin(dp[i],dp[i-2]+Math.abs(h[i-2] - h[i]));
		}
		System.out.println(dp[n-1]);
	}

	private static int chmin(int i, int j) {
		return Math.min(i, j);
	}
}




