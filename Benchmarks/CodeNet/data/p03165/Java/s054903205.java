import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		int[][] dp = new int[s.length()+1][t.length()+1];
		for (int i=1;i<s.length()+1;i++) {
			for (int j=1;j<t.length()+1;j++) {
				if (s.charAt(i-1)==t.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}

		String res = "";
		int i = s.length(), j = t.length();
		while (i > 0 && j > 0) {
        	if (dp[i][j] == dp[i-1][j]) {
        	i--;
			}else if(s.charAt(i-1)==t.charAt(j-1)){
			res = s.charAt(i-1) + res;
			i--;
			j--;
        	}
		}
		System.out.println(res);
	}
}