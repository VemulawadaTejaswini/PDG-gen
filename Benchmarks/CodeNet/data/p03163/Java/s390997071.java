import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int W = input.nextInt();
		int[][] items = new int[N][2];
		for(int i = 0; i < N; i++){
			items[i][0] = input.nextInt();
			items[i][1] = input.nextInt();
		}
		/*for(int i = 0; i < N; i++){
			System.out.print(items[i][0] + " ");
			System.out.println(items[i][1]);
		} */

		long [][] dp = new long[N+1][W+1];
		for(int i = 0; i < dp.length; i++){
			Arrays.fill(dp[i], -1);
		}
		dp[0][0] = 0;
		for(int i = 1; i < dp.length; i++){
			for(int j = 0; j < dp[i].length; j++){
				if(j >= items[i-1][0]) dp[i][j] = Math.max(dp[i-1][j-items[i-1][0]] == -1 ? -1 : dp[i-1][j-items[i-1][0]] + items[i-1][1], dp[i-1][j]);
				else dp[i][j] = dp[i-1][j];
			}
		}
		long max = 0;
		for(int j = 0; j <= W; j++) max = (long) Math.max(dp[N][j], max);
		System.out.println(max);

	}
}
