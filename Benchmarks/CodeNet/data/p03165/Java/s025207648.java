import java.util.*;
import java.io.*;


public class Main  {

	public static void main(String[] args) {
		Main ans = new Main();
		ans.solve();
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		String S= sc.nextLine();
		String L= sc.nextLine();

		int N = S.length();
		int M = L.length();

		int [][] dp = new int[N+1][M+1];

		for(int i=0;i<=N;i++){
			dp[i][0] = 0;
		}

		for(int i=0;i<=M;i++){
			dp[0][i] = 0;
		}

		dp[0][0] = 1;

		for(int i=N;i>=1;i--){
			for(int j=M;j>=1;j--){
				char a = S.charAt(i-1);
				char b = L.charAt(j-1);
				if (a==b) dp[i][j] = 1 + dp[i+1][j+1];
				else dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
			}
		}

		int i=0,j=0;
		while(i<N && j<M) {
			char a = S.charAt(i);
			char b = L.charAt(j);
			if (a==b) System.out.print(a);
			else {
				if (dp[i+1][j] >= dp[i][j+1]) i++;
				else j++;
			}
		}
	}

}

