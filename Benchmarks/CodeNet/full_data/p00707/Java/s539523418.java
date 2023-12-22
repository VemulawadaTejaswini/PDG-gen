import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if (w == 0 && h == 0) {
				break;
			}
			char[][] m = new char[h][];
			for(int i=0;i<h;i++) {
				m[i] = sc.next().toCharArray();
			}
			BigInteger ans = BigInteger.ZERO;
			BigInteger[][] dp = new BigInteger[h][w];
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					dp[i][j] = BigInteger.ZERO;
					if (!Character.isDigit(m[i][j])) {
						continue;
					}
					if (i > 0) {
						dp[i][j] = dp[i-1][j].multiply(BigInteger.TEN).add(BigInteger.valueOf(m[i][j] - '0'));
					}
					if (j > 0) {
						dp[i][j] = dp[i][j].max(dp[i][j-1].multiply(BigInteger.TEN).add(BigInteger.valueOf(m[i][j] - '0')));
					}
					ans = ans.max(dp[i][j]);
				}
			}
			System.out.println(ans);
		}
	}

}