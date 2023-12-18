import java.util.*;
public class Main {
   private static int h[];
   private static int dp[];
  public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();

        h = new int[n];
        dp = new int[n];

        for (int i = 0; i < n; i++) {
          dp[i]=Integer.MAX_VALUE;
          h[i] = sc.nextInt();
        }

		// 30 10 60 10 60 50  
		dp[0] = 0;
		for (int i=1; i < n; i++) {
          for (int j=1;j <=k;j++){
            if (i<j) {}else{
			dp[i]=chmin(dp[i],dp[i-j]+Math.abs(h[i-j] - h[i]));
          }}
		}
		System.out.println(dp[n-1]);
	}

	private static int chmin(int i, int j) {
		return Math.min(i, j);
	}
}




