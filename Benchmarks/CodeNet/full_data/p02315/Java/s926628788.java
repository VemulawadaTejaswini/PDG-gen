import java.util.Scanner;

public class Main {

	 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int W = sc.nextInt();

		int dp[] = new int[W+1];
		for(int i = 0; i < dp.length; i++){
			dp[i] = -1;
		}
		dp[0] = 0;

		int value,weight;

		for(int loop = 0; loop < N; loop++){

			value = sc.nextInt();
			weight = sc.nextInt();

			for(int i = W; i-weight >= 0; i--){
				if(dp[i-weight] == -1)continue;
				dp[i] = Math.max(dp[i],dp[i-weight]+value);
			}
		}

		int ans = 0;
		for(int i = 1; i <= W; i++){
			ans = Math.max(ans, dp[i]);
		}

		System.out.println(ans);
	}
}

