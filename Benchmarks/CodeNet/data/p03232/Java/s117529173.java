
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	int MOD = 1_000_000_007;
	int a[];

	void run() {
		int n = sc.nextInt();

		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sum = new int[n + 1];
		for (int i = 0; i < n; i++) {
			sum[i + 1] = (sum[i] + a[i]) % MOD;
		}
		c = new int[n+1][n+1];
		perm = new int[n+1];
		perm2 = new int[n+1][n+1];
		memo = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(memo[i], -1);
		}
		System.out.println(dp(0, n - 1));
	}

	int sum[];
	int memo[][];

	int dp(int from, int to) {
		if( from > to){
			return 0;
		}
		if (from == to) {
			memo[from][to] = a[from];
			return memo[from][to];
		}
		if (memo[from][to] != -1) {
			return memo[from][to];
		}

		int ans = (int)((long)range(from, to) * perm(to-from+1))%MOD;
		ans %= MOD;
		for( int i = from ; i <= to ; i++){
		
			long pat = ((long)dp(from, i-1)*perm(to-from, (to - i))) % MOD;
			pat += (long)dp(i + 1, to)*perm(to-from, (i - from)) % MOD;

			ans += pat  % MOD;
			ans %= MOD;

		}


		this.memo[from][to] = ans;
		return ans;
	}

	int range(int from, int to) {
		return (sum[to + 1] - sum[from] + MOD) % MOD;
	}

	int c[][];
	int perm[];
	int perm(int n){
		if(n == 0){
			return 1;
		}
		if(n == 1){
			return 1;
		}
		if(perm[n] != 0){
			return perm[n];
		}
		perm[n] = (int)(((long)(perm(n-1)*n))%MOD);
		return perm[n];
	}
	int perm2[][];
	int perm(int n,int r){
		if(r > n){
			return 1;
		}
		if(r == 0){
			return 1;
		}
		
		if(perm2[n][r] != 0){
			return perm2[n][r];
		}
		
		
		int ans = (n * perm(n-1,r-1)) % MOD;
		perm2[n][r] = ans;
		return ans;
	}
	int comb(int n, int r) {
		if(n < r || n < 0 || r < 0){
			return 1;
		}
		if (n == r)
			return c[n][r] = 1;
		if (r == 0)
			return c[n][r] = 1;
		if (r == 1)
			return c[n][r] = n;
		if (n == r+1)
			return c[n][r] = n;
		if (c[n][r] != 0)
			return c[n][r];
		return c[n][r] = (comb(n - 1, r) + comb(n - 1, r - 1))%MOD;
	}
}
