import java.math.BigInteger;
import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		while (true) {
			int w = sc.nextInt(), h = sc.nextInt();
			if (w == 0 && h == 0) break;
			String[] rows = new String[h];
			for (int i = 0; i < h; i++)
				rows[i] = sc.next();
			BigInteger[][] dp = new BigInteger[h+1][w+1];
			for (int i = 0 ; i <= h; i++)
				for (int j = 0; j <= w; j++)
					dp[i][j] = BigInteger.ZERO;
			
			BigInteger res = BigInteger.ZERO;
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					if (Character.isDigit(rows[i-1].charAt(j-1))) {
						dp[i][j] = (((dp[i-1][j].compareTo(dp[i][j-1]) > 0) ? dp[i-1][j] : dp[i][j-1]).multiply(BigInteger.TEN)).add(new BigInteger(""+rows[i-1].charAt(j-1)));
						res = (dp[i][j].compareTo(res) > 0) ? dp[i][j] : res;
					}
				}
			}
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}