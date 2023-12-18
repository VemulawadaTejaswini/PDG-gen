import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 0;

	void doIt() {
		int x = sc.nextInt();
		boolean dp[] = new boolean[x + 1];
		Arrays.fill(dp, false);
		dp[0] = true;
		for(int i = 100; i <= 105; i++) {
			for(int j = i; j <= x; j++) {
				if(dp[j - i])dp[j] = true;
			}
		}
		System.out.println(dp[x]?1:0);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
