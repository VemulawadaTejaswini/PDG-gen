import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] a = in.next().toCharArray();
		char[] b = in.next().toCharArray();
		int[][] dp = new int[a.length+1][b.length+1];
		for(int i=0;i<=b.length;i++) {
			dp[0][i] = 0;
		}
		for(int i=0;i<=a.length;i++) {
			dp[i][0] = 0;
		}
		for(int i=1;i<=a.length;i++) {
			for(int j=1;j<=b.length;j++) {
				dp[i][j] = Math.max(Math.max(dp[i][j-1],dp[i-1][j]), dp[i-1][j-1]+(a[i-1]==b[j-1]? 1:0));
			}
		}
		/*
		for(int i=0;i<=a.length;i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		*/
		int i=a.length;
		int j=b.length;
		StringBuilder result = new StringBuilder("");
		while(i>0&&j>0) {
			if(dp[i][j]==dp[i][j-1]) {
				j--;
			}else {
				if(dp[i][j]==dp[i-1][j]) {
					i--;
				}else {
					result.insert(0,a[i-1]);
					i--;
					j--;
				}
			}
		}
		
		//System.out.println(dp[a.length][b.length]);
		System.out.println(result);
	}
}
