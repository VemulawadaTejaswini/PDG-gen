import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
		try(Scanner scan = new Scanner(System.in)){
			int H = scan.nextInt();
			int W = scan.nextInt();
			int N = scan.nextInt();
			
			int field[][] = new int[H+2][W+2];
			
			int ans[] = new int[10];
			
			for(int i = 0; i<N; i++){
				int a = scan.nextInt();
				int b = scan.nextInt();
				field[a][b] = 1;
			}
			
			int dp[][] = new int[3][W-2+1];
			
			for(int i = 1; i<=2; i++){
				dp[i-1][0] = field[i][1] + field[i][2] + field[i][3];
				for(int j = 1; j<=W-3; j++){
					dp[i-1][j] = dp[i-1][j-1] - field[i][j] + field[i][j+3];
				}
			}
			
			for(int i = 3; i<=H; i++){
				dp[2][0] = field[i][1] + field[i][2] + field[i][3];
				for(int j = 0; j<=W-3; j++){
					ans[dp[0][j] + dp[1][j] +dp[2][j]]++;
					dp[0][j] = dp[1][j];
					dp[1][j] = dp[2][j];
					dp[2][j+1] = dp[2][j] - field[i][j+1] + field[i][j+1+3];
				}
			}
			for(int i = 0; i<10; i++){
				System.out.println(ans[i]);
			}
		}
	}
}
