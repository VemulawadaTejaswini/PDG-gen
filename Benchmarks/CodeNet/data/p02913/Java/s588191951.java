import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int[][] dp = new int[N+1][N+1];
		for(int i = N-1; i >= 0; i--) {
			for(int j = N-1; j >= 0; j--) {
				if(S[i] == S[j])
					dp[i][j] = dp[i+1][j+1] + 1;
				else
					dp[i][j] = 0;
			}
		}
		int ans = 0;
		for(int i = 0; i < N; i++)
			for(int j = i+1; j < N; j++)
				ans = Math.max(ans, Math.min(dp[i][j], j-i));
		System.out.println(ans);

	}

}