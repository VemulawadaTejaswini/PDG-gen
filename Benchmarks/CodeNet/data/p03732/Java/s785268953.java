
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int W = sc.nextInt();

		int[] weights = new int[N];
		int[] values = new int[N];

		for(int i = 0;i < N;i++){
			weights[i] = sc.nextInt();
			values[i] = sc.nextInt();
		}

		int[][] dp = new int[N+1][W+1];

		for(int i = N - 1;0 <= i;i--){
			for(int j = 0;j <= W;j++){
				if(j < weights[i]){
					dp[i][j] = dp[i+1][j];
				}else{
					dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j-weights[i]] + values[i]);
				}
			}
		}

		System.out.println(dp[0][W]);

		sc.close();
	}

}
