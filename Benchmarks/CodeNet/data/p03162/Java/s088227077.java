import java.util.Scanner;

public class Main {
	static int[][] dp = new int[100001][3];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[100001][3];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				insMax(a , i , j);
			}
		}



		sc.close();
		System.out.println(Math.max(Math.max(dp[n][0], dp[n][1]),dp[n][2]));

	}
	public static void insMax(int[][] a , int i , int j) {
		int[] b = new int[2];
		int count = 0;
		for(int t = 0 ; t < 3 ; t++) {
			if(t != j) {
				b[count] = dp[i][t] ;
				count++;
			}
		}
      
		dp[i + 1][j] = Math.max(b[0], b[1]) + a[i][j];
	}
}

