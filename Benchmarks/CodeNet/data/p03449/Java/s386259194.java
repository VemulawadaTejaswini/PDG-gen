import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[][] A = new int[2][N];
		
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < N ; j++){
				A[i][j] = scan.nextInt();
			}	
		}
		
		if(N==1){
			System.out.println(A[0][0]+A[1][0]);
		}
		else{
			int[][] dp = new int[2][N];
			dp[0][0] = A[0][0];

			
			for(int j = 0 ; j < N-1 ; j++){
				if(j==0){
					dp[j+1][0] = A[j+1][0]+dp[0][0] ;
					dp[0][j+1] = A[0][j+1]+dp[0][0] ;
				}
				else{
					dp[0][j+1] = A[0][j+1] + dp[0][j]; 
					dp[1][j] = Math.max(dp[0][j] + A[1][j], dp[1][j-1] + A[1][j]);		
				}
			}
			dp[1][N-1] = Math.max(dp[0][N-1] + A[1][N-1], dp[1][N-2] + A[1][N-1]);	
			
			System.out.println(dp[1][N-1]);
		}
	}
}