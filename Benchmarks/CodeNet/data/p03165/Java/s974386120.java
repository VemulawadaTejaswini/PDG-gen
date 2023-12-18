import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] a = in.next().toCharArray();
		char[] b = in.next().toCharArray();
		int[][] dp = new int[a.length+1][b.length+1];
		String[][] store = new String[a.length+1][b.length+1];
		for(int i=0;i<=b.length;i++) {
			store[0][i] = "";
		}
		for(int i=0;i<=a.length;i++) {
			store[i][0] = "";
		}
		for(int i=1;i<=a.length;i++) {
			for(int j=1;j<=b.length;j++) {
				String x = store[i-1][j] + (a[i-1]==b[j-1]? a[i-1]:"");
				String y = store[i][j-1];
				store[i][j] = (x.length()>y.length()? x:y);
			}
		}
		//System.out.println(dp[a.length][b.length]);
		System.out.println(store[a.length][b.length]);
	}
}
