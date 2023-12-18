import java.util.Scanner;

public class Main {

	static int N,W;
	static int[][] P;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		W = sc.nextInt();
		P = new int[N+1][3];

		for (int i=1; i <= N; i++) {
			P[i][1] = sc.nextInt();
			P[i][2] = sc.nextInt();
		}
		sc.close();

		long[][] dp = new long[N+1][W+1];

		for(int i = 1 ; i <= N ; i++){
			for(int j = 1 ; j <= W ; j++){

				if(j < P[i][1]){
					dp[i][j] = dp[i-1][j];
				}
				else{
					dp[i][j] = Math.max(dp[i-1][j-P[i][1]] + P[i][2], dp[i-1][j]);
				}

			}
		}

		/*
		for(int i = 0 ; i < N+1 ; i++){
			for(int j = 0 ; j < W+1; j++){
				System.out.print(dp[i][j]+",");
			}
			System.out.print(" ");
		}
		*/
		System.out.println(dp[N][W]);
	}
}
