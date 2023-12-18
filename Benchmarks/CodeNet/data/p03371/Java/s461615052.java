import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int[][] dp = new int[x+1][y+1];
		for (int i=0; i<=x; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE/2);
		}
		dp[0][0] = 0;
		for (int i=0; i<=x; i++) {
			for (int j=0; j<=y; j++) {
				if (dp[i][j] == Integer.MAX_VALUE/2) continue;
				if (i < x)
					dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j] + a);
				if (j < y)
					dp[i][j+1] = Math.min(dp[i][j+1], dp[i][j] + b);
				if (i < x && j < y)
					dp[i+1][j+1] = Math.min(dp[i+1][j+1], dp[i][j] + 2*c);
			}
		}
		// trace(dp);
		out.println(dp[x][y]);
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		solve();
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}