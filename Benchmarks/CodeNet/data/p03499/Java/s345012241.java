import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}

	final long MOD = 1_000_000_000 + 7;
	ArrayList<Integer>[] g;

	long pow(long a, long n) {
		long ret = 1;
		for (; n > 0; n >>= 1, a = a * a % MOD) {
			if (n % 2 == 1) {
				ret = ret * a % MOD;
			}
		}
		return ret;
	}

	long inv(long a) {
		return pow(a, MOD - 2);
	}

	void pre(int cur, int par) {
		sz[cur] = 1;
		for (int child : g[cur]) {
			if (child == par)
				continue;
			pre(child, par);
			sz[cur] += sz[child];
		}
		f[cur] = pow(2, sz[cur] - 1);
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; ++i) {
			p[i] = sc.nextInt();
		}
		g = new ArrayList[n + 1];
		for (int i = 0; i <= n; ++i) {
			g[i] = new ArrayList();
		}
		for (int i = 0; i < n; ++i) {
			g[p[i]].add(i + 1);
		}
		sz = new int[n + 1];
		f = new long[n + 1];
		pre(0, -1);

		for (int i = 0; i < n + 4; ++i) {
			dfs(0, -1);
		}
		System.out.println(ans);
	}

	long ans = 0;

	int[] sz;
	long[] f;

	void dfs(int cur, int par) {
		if (cur == 0) {
			ans = (ans + f[cur]) % MOD;
		}
		long ret = 0;
		long all = 2;
		for (int child : g[cur]) {
			if (child == par)
				continue;
			all = all * (pow(2, sz[child]) - f[child] + MOD) % MOD;
		}

		for (int child : g[cur]) {
			if (child == par)
				continue;
			long tmp = all;
			tmp = tmp * inv((pow(2, sz[child]) - f[child] + MOD) % MOD) % MOD;
			tmp = tmp * f[child] % MOD;
			ret = (ret + tmp) % MOD;
		}
		f[cur] = ret;
		for (int child : g[cur]) {
			if (child == par)
				continue;
			dfs(child, cur);
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
