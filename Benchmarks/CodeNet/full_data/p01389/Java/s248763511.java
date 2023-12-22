
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int dp[][] = new int[h+1][w+1];
		for(int[] a: dp) fill(a, INF);
		dp[1][0] = dp[0][1] = 0;
		for(int i=1;i<=h;i++) {
			String str = sc.next();
			for(int j=1;j<=w;j++) {
				dp[i][j] = str.charAt(j-1) - '0';
			}
		}
		
		for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
			dp[i][j] += min(dp[i][j-1], dp[i-1][j]);
		}
		
		System.out.println(dp[h][w]);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}