
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for (int c=1;;c++) {
			int W = sc.nextInt();
			if (W == 0) break;
			
			int n = sc.nextInt();
			int[] v = new int[n], w = new int[n];
			for (int i=0;i<n;i++) {
				String[] ws = sc.next().split(",");
				v[i] = Integer.valueOf(ws[0]); w[i] = Integer.valueOf(ws[1]);
			}
			
			int[] dp = new int[W+1];
			fill(dp, -1); dp[0] = 0;
			for (int i=0;i<n;i++) for (int j=W;j>=w[i];j--) if (dp[j-w[i]]>=0){
				dp[j] = max(dp[j], dp[j-w[i]] + v[i]);
			}
			int aw = 0, av = 0;
			for (int i=0;i<=W;i++) if (av < dp[i]){
				av = dp[i];
				aw = i;
			}
			System.out.println("case " + c + ":");
			System.out.println(av);
			System.out.println(aw);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}