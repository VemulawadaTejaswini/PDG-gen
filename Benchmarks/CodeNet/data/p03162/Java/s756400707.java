import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][3];
        for (int i = 0; i < N; i++) {
        	for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
			}
        }

		Main obj = new Main();
		System.out.println(obj.maxFallingPathSum(arr));
	}

	public int maxFallingPathSum(int[][] arr) {

		int row = arr.length;
		int column = arr[0].length;

		int dp[][] = new int[row][column];

		for (int i = 0; i < column; i++) {
			dp[0][i] = arr[0][i];
		}

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int max = Integer.MIN_VALUE;
				for (int j2 = 0; j2 < column; j2++) { // Every item in previous row.
					if(j != j2) {                     // Except items in same column. 
						max = Math.max(max, dp[i-1][j2]);
					}
				}
				dp[i][j] = max+arr[i][j];
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < column; i++) {
			max = Math.max(max, dp[row-1][i]);
		}
		return max;
	}
}