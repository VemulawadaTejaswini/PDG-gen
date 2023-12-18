import java.util.Scanner;
import java.util.Arrays;

class Main {
	static int[][] dp;
	static int h;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		h = in.nextInt();
		int w = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		dp = new int[h+1][w+1];

		System.out.println(solve(h,w,a,b));

		in.close();

	}

	static int solve(int y, int x,int a,int b) {

		if(dp[y][x] != 0) return dp[y][x];
		if(x == 0 || y == 0) return 0;
		if(y >= h-a+1  && x <= b) return 0;
		if(x == 1 && y == 1) return 1;
		int ret = 0;
		dp[y][x] = (solve(y-1,x,a,b) + solve(y,x-1,a,b)) % 1000000007;
		ret = dp[y][x];
		return ret;
	}

}