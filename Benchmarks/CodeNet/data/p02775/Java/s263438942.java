

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = "0"+sc.next();
		int n = 0;
		for (n=s.length();n>0;n--) {
			if (s.charAt(n-1)!='0') {
				break;
			}
		}
		
		s=s.substring(0, n);
		int[][] memo = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				memo[i][j]=-1;
			}
		}
		
		int[] sum = new int[n];
		
		sum[0]='9'-s.charAt(0);
		for (int i=1;i<n;i++) {
			sum[i]=sum[i-1]+'9'-s.charAt(i);
		}
		
		System.out.println(calc(0,n-1,s,memo, sum));
		
	}
	
	static int calc (int from, int to, String s, int[][] memo, int[]sum) {

		if (memo[from][to]>=0) {
			return memo[from][to];
		}
		if (from==to) {
			return Math.min(s.charAt(from)-'0', '9'-s.charAt(from)+2);
		}
		int ans = 0;
		//all in one
		int tmp = s.charAt(from)-'0'+sum[to]-sum[from]+2;

		ans = tmp;
		


		
		for(int i=from;i<to;i++) {
			ans=Math.min(ans, calc(from, i, s, memo, sum)+calc(i+1, to, s, memo, sum));
		}
		memo[from][to]=ans;
		return ans;
	}
	
	
	
}


