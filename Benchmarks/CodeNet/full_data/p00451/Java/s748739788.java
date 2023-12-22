
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			String str1 = sc.next();
			String str2 = sc.next();
			int n = str1.length();
			int m = str2.length();
			short[][] dp = new short[n+1][m+1];
			int max = 0;
			for(int i=1;i<=n;i++) for(int j=1;j<=m;j++) {
//				dp[i][j] = dp[i][j-1];
				if( str1.charAt(i-1) == str2.charAt(j-1) )
					dp[i][j] = (short)(dp[i-1][j-1]+1);
				max = max(max, dp[i][j]);
			}
//			for(int[] a: dp) debug(a);
			
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}