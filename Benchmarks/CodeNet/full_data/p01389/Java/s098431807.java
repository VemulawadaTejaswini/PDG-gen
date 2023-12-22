import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int[][] dp = new int[H][W];
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					dp[i][j] = 0;
				}
			}
			int[][] field = new int[H][W];
			for(int i=0; i<H; i++) {
				String str = sc.next();
				for(int j=0; j<W; j++) {
					field[i][j] = str.charAt(j) - '0';
				}
			}
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					dp[i][j] = field[i][j];
					if(i+j == 0) {
						continue;
					}
					else if(i == 0) {
						dp[i][j] += dp[i][j-1];
					}
					else if(j == 0) {
						dp[i][j] += dp[i-1][j];
					}
					else {
						dp[i][j] += Math.min(dp[i][j-1], dp[i-1][j]);
					}
				}
			}
			System.out.println(dp[H-1][W-1]);
		}
	}

}


