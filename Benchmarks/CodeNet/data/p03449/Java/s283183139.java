

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int nCol = in.nextInt();
		int[][] arr = new int[3][nCol + 1];
		for(int i = 1; i <= 2; i++) 
			for(int j = 1; j <= nCol; j++)
				arr[i][j] = in.nextInt();
		int[][] dp = new int[3][nCol + 1];
		for(int j = 1; j <= nCol; j++) {
			for(int i = 1; i <= 2; i++) {
				dp[i][j] = arr[i][j] + Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		System.out.println(dp[2][nCol]);
	}

}
