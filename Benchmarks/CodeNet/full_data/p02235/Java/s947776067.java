import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			while(n-->0) {
				String s1 = sc.next();
				String s2 = sc.next();
				int len1 = s1.length();
				int len2 = s2.length();
				int[][] dp = new int[len1][len2];
				for(int i=0; i<len1; i++) {
					for(int j=0; j<len2; j++) {
						dp[i][j] = 0;
					}
				}
				for(int i=0; i<len1; i++) {
					dp[i][0] = (s1.charAt(i)==s2.charAt(0))? 1: 0;
				}
				for(int j=0; j<len2; j++) {
					dp[0][j] = (s2.charAt(j)==s1.charAt(0))? 1: 0;
				}
				for(int i=0; i<len1; i++) {
					for(int j=0; j<len2; j++) {
						for(int ni=0; ni<i; ni++) {
							for(int nj=0; nj<j; nj++) {
								if(s1.charAt(i) == s2.charAt(j))
									dp[i][j] = Math.max(dp[i][j], dp[ni][nj]+1);
							}
						}
					}
				}
				int ans = 0;
				for(int i=0; i<len1; i++) {
					for(int j=0; j<len2; j++) {
						ans = Math.max(ans, dp[i][j]);
					}
				}
				System.out.println(ans);
			}
		}
	}

}


