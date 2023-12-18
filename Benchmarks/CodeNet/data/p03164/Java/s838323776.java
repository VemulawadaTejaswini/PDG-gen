import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			int N = scan.nextInt();
			int W = scan.nextInt();

			int[] wArray = new int[N+1];
			int[] v = new int[N+1];
			
			for(int i=1; i<N+1; i++) {
				wArray[i] = scan.nextInt();
				v[i] = scan.nextInt();
			}
			
			int[][] dp = new int[N+1][W+1];
			
			for(int i=0; i<W+1; i++) dp[0][i] = 0;
			
			for(int w=1; w<W+1; w++) {
				for(int i=1; i<N+1; i++) {
					if(wArray[i] > w) continue;
					dp[i][w] = Math.max(dp[i-1][w], dp[i-1][w-wArray[i]]+v[i]);
				}
			}
			
			System.out.println(dp[N][W]);
		}
	}
}