import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int N = s.length;
		
		int[][] dp = new int[N+1][2];
		
		for(int i=0; i<N; i++) {
			if(i==0 || s[i-1] != s[i]) {
				dp[i+1][0] = Math.max(dp[i+1][0], dp[i][0]+1);
			}
			dp[i+1][0] = Math.max(dp[i+1][0], dp[i][1]+1);

			if(i>=1)
				dp[i+1][1] = Math.max(dp[i+1][1], dp[i-1][0]+1);

			if(i>=3 &&(s[i]!=s[i-2] || s[i-1]!=s[i-3]))
				dp[i+1][1] = Math.max(dp[i+1][1], dp[i-1][1]+1);
		}
		
		System.out.println(Math.max(dp[N][0], dp[N][1]));
		
		sc.close();
	}
}

