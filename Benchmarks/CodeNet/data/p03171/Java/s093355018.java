
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();

		int[] arr = input(n);
		long[][][] dp = new long[n][n][2];

		for(int slide = 0 ; slide< n ;slide++ ) {
			for(int row = 0 ; row < n - slide ; row++) {
				int col = row + slide ;
				if(row==col) {
					dp[row][col][0]=arr[row];
					dp[row][col][1]=0;
					continue;
				}
				
				if(dp[row+1][col][1]+arr[row] > dp[row][col-1][1]+arr[col]) {
					dp[row][col][0]=dp[row+1][col][1]+arr[row] ;
					dp[row][col][1]=dp[row+1][col][0] ;	
				}else {
					dp[row][col][0]=dp[row][col-1][1]+arr[col] ;
					dp[row][col][1]=dp[row][col-1][0] ;					
				}
			}
		}
		long ans  = dp[0][n-1][0]-dp[0][n-1][1];
		System.out.println(ans);
	}

	public static int[] input(int n) throws Exception {

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static int[][] input(int n, int m) throws Exception {

		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

}
