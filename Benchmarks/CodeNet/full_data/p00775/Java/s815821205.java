import java.io.*;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.*;


class Main {
	static Scanner sc = new Scanner(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		try{
		while(true) {
			int r = sc.nextInt();
			int n = sc.nextInt();
			if(r+n == 0) break;
			System.out.printf("%.4f\n", solve(r, n));
		}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	static double solve(int r, int n) {
		int[] dp = new int[40];
		for (int i = 0; i < n; i++) {
			int xl = sc.nextInt();
			int xr = sc.nextInt();
			int h = sc.nextInt();
			for(int j = xl; j < xr; j++) {
				int index = j + 20;
				dp[index] = Math.max(dp[index], h);
			}
		}
		
		for(double ans = -r; ans < 20.0; ans += 0.0005) {
			for (int i = 1-r; i < r; i++) {
				int index = i + 20;
				int h = Math.min(dp[index-1], dp[index]);
				double dist = sqdist(0.0, ans, (double)i, (double)h);
				if(dist <= (double)(r*r)) {
					return ans + (double)r;
				}
			}
		}
		return 0.0;
	}
	
	public static double sq(double d) {
		return d * d;
	}
	
	public static double sqdist(double x1, double y1, double x2, double y2) {
		return sq(x1 - x2) + sq(y1 - y2);
	}
}