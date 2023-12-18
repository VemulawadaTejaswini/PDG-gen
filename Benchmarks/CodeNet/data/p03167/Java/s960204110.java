import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Main sol = new Main();
		System.out.println(sol.solve());
	}

	private int solve() {
		int MOD = (int)1e9+7;
		Scanner sc  = new Scanner(System.in);
		//String S = sc.nextLine();
		//int N = Integer.parseInt(""+S.charAt(0));
		//int M = Integer.parseInt(""+S.charAt(2));
		int N = sc.nextInt();
		int M = sc.nextInt(); 
		sc.nextLine();
		StringBuilder buf = new StringBuilder();
		char [][] grid = new char[N+1][M+1];
		for(int i=0;i<N;i++){
			String line = sc.nextLine();
			for(int j=0;j<line.length();j++){
				grid[i+1][j+1] = line.charAt(j);
			} 
		}

		int [][] dp = new int[N+1][M+1];
		dp[N][M] = 1;
		for(int i=N;i>=1;i--){
			for(int j=M;j>=1;j--){
				if (i==N&& j==M) continue;
				if (grid[i][j]=='#') dp[i][j]=0;
 				else dp[i][j] = ((i==N ? 0 : dp[i+1][j]) + (j==M ? 0 : dp[i][j+1]))%MOD; 
			}
		}


		return dp[1][1];

	}

	private void print(int N, int M, char[][] grid) {
		for(int i=1;i<=N;i++){
			for(int j=1;j<=M;j++){
				System.out.printf("%c", grid[i][j]);
			}
			System.out.println();
		}
	}

}