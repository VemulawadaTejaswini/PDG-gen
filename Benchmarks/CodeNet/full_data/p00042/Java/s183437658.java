
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
		for(int c=1;;c++) {
			int W = sc.nextInt();
			if(W == 0) break;
			
			int n = sc.nextInt();
			int[] w = new int[n], v = new int[n];
			for(int i=0;i<n;i++){
				String[] l = sc.next().split(",");
				v[i] = Integer.parseInt(l[0]); w[i] = Integer.parseInt(l[1]);
			}
			int[] dp = new int[W+1];
			for(int i=0;i<n;i++) for(int j=W;j>=w[i];j--) 
				dp[j] = max(dp[j], dp[j-w[i]] + v[i]);
			
			int maxw = 0, maxv = 0;
			for(int i=0;i<=W;i++) if(maxv < dp[i]) {
				maxw = i; maxv = dp[i];
			}
			System.out.println("Case " + c + ":");
			System.out.println(maxv);
			System.out.println(maxw);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}