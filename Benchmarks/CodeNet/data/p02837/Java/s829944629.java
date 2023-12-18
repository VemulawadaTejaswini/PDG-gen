import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;

	void doIt() {
		int n = sc.nextInt();
		LEN = (1 << n + 1);
		boolean notTrue[] = new boolean[n];
		Arrays.fill(notTrue, false);
		int says[][] = new int[n][n];
		for(int i = 0; i < n; i++)Arrays.fill(says[i], -1);
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			for(int j = 0; j < a; j++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt();
				says[i][x] = y;
			}
		}
		int ans = 0;
		for(int i = 0; i < (1 << n); i++) {
			int num = Integer.bitCount(i);
			out:for(int j = 0; j < n; j++) {
				if((i >> j & 1) == 1) {
					for(int k = 0; k < n; k++) {
						if(says[j][k] != (i >> k & 1) && says[j][k] != -1) {
							num = 0;
							break out;
						}
						
					}
				}
			}
			ans = Math.max(ans, num);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
