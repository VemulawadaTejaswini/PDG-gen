import java.util.Scanner;

class Main{
	static final int hash = 1000000007;

	static int H;
	static int W;
	static boolean[][] a;
	static int[][] memo;
	static boolean[][] memoflag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		H = sc.nextInt();
		W = sc.nextInt();

		a = new boolean[H + 1][W + 1];
		memo = new int[H][W];
		memoflag = new boolean[H][W];
		for(int h = 0; h < H; h++) {
			String input = sc.next();
			for(int w = 0; w < W; w++) {
				memoflag[h][w] = false;
				if(input.charAt(w) == '.')
					a[h][w] = true;
				else
					a[h][w] = false;
			}
		}
		for(int h = 0; h <= H; h++) {
			a[h][W] = false;
		}
		for(int w = 0; w < W; w++) {
			a[H][W] = false;
		}

		int ans = dp(0, 0);
		System.out.println(ans);
		sc.close();
	}
	static int dp(int y, int x) {
		if(!a[y][x])
			return 0;
		else if(x == W - 1&& y == H - 1)
			return 1;
		if(!memoflag[y][x]) {
			memoflag[y][x] = true;
			memo[y][x] = dp(y + 1, x) + dp(y, x + 1);
			if(memo[y][x] > 1e+9) {
				memo[y][x] %= hash;
			}
		}
		return memo[y][x];
	}
}
