import java.util.*;

public class Main {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		int sL = s.length()+1;
		int tL = t.length()+1;
				
		//dp i j - lcs for s from 1 to i and t from 1 to j
		int[][] dp = new int[sL][tL];
		
		for(int i = 1; i < sL; i++) {
			for(int j = 1; j < tL; j++) {
				if(s.charAt(i-1) == t.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		int lcsLen = dp[sL-1][tL-1];
		char[] res1 = new char[lcsLen+1];
		
		int i = sL-1;
		int j = tL-1;
		int index = lcsLen;
		while(i > 0 && j > 0) {
			if(s.charAt(i-1) == t.charAt(j-1)) {
				res1[index] = s.charAt(i-1);
				i--;
				j--;
				index--;
			}else if(dp[i-1][j] > dp[i][j-1]) {
				i--;
			}else {
				j--;
			}
		}
		String lcs = "";
		for(int k = 1; k < res1.length; k++) {
			lcs += res1[k];
		}
		
		System.out.println(lcs);
		
		
	}
	 
	static int max(int a, int b) {
		return a > b ? a : b;
	}
	 
	 

}