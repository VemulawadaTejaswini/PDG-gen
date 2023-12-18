import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int S = s.length();
		int T = t.length();

		int[][] dp = new int[S+1][T+1];
		for (int i=1;i<S+1;i++) {
			for (int j=1;j<T+1;j++) {
				if (s.charAt(i-1)==(t.charAt(j-1))) {
					dp[i][j]=Math.max(dp[i-1][j-1]+1,dp[i][j-1]);
					dp[i][j]=Math.max(dp[i][j],dp[i-1][j]);
				}else {
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}

		String str = "";
		int i=S;
		for (int j=T;j>0;j--) {
			if (dp[i][j]-1==dp[i-1][j-1]&&dp[i][j]-1==dp[i][j-1]&&dp[i][j]-1==dp[i-1][j]) {
				str = t.charAt(j-1)+str;
				i--;
				if (i==0) {
					break;
				}
			}
		}
		System.out.println(str);
	}
}