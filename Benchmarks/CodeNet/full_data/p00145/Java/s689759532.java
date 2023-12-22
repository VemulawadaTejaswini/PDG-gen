import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			int[][] card  = new int[2][n];
			for(int i = 0; i < n ; i++){	
				card[0][i] = sc.nextInt();
				card[1][i] = sc.nextInt();
			}
			int[][] dp = new int[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(j == i){
						dp[j][i] = 0;
					}else{
						dp[j][i] = Integer.MAX_VALUE/2;	
					}
				}
			}
			for(int i = 1; i < n; i++){
				for(int j = 0; j + i < n; j++){
					for(int k = j; k < j + i; k++){
						dp[j][j + i] = Math.min(dp[j][j + i], dp[j][k] + dp[k + 1][j + i] + card[0][j] * card[1][k] * card[0][k + 1] * card[1][j + i]); 
					}
				}
			}
			System.out.println(dp[0][n - 1]);
	}

}