import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		final String b = "CODEFESTIVAL2016";
		
		int dp[][] = new int[20][20];
		for(int i=0; i<=16; i++) {
			dp[0][i] = i;
			dp[i][0] = i;
		}
		
		for(int i=1; i<=16; i++) {
			for(int j=1; j<=16; j++) {
				int f = 0;
				if(a.charAt(i-1) != b.charAt(j-1))
					f = 1;
				
				//int l1 = dp[i][j-1] + 1;
				int l2 = dp[i-1][j] + 1;
				int l3 = dp[i-1][j-1] + f;
				
				dp[i][j] = Math.min(l2, l3);
			}
		}
		
		System.out.println(dp[16][16]);

	}

}
