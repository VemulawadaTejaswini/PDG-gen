import java.util.*;

class Main {
	static long mod = 1000000007;
	static int N = 200000;
	static long fact[] = new long[N];
	static long inv[] = new long[N];

	static long pow(long a, long b, long m) {
		if (a == 0)
			return 0;
		if (b == 0)
			return 1;
		long temp = pow(a, b / 2, m);
		temp = ((temp % m) * (temp % m)) % m;
		if ((b & 1) > 0)
			temp = ((temp % m) * (a % m)) % m;
		return temp;
	}

	static void pre() {
		fact[0] = inv[0] = 1;
		for (int i = 1; i < N; i++) {
			fact[i] = (fact[i - 1] * i) % mod;
			inv[i] = pow(fact[i], mod - 2, mod);
		}
	}

	static long ncr(int n, int r) {
		if (n == r) {
			return 1;
		}
		long ans = fact[n];
		ans = (ans * inv[n - r]) % mod;
		ans = (ans * inv[r]) % mod;
		return ans;
	}

	public static class point implements Comparable<point> {
		int r;
		int c;

		point(int a, int b) {
			r = a;
			c = b;
		}

		public int compareTo(point o) {
			return (this.r + this.c) - (o.r + o.c);
		}
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		int n = scn.nextInt();
	
		point p[] = new point[n];
		for (int i = 0; i < n; i++) {
			int x = scn.nextInt();
			int y = scn.nextInt();
			p[i] = new point(x, y);
		}
		pre();
		Arrays.sort(p);
		long dis[] = new long[n];
		for (int i = 0; i < n; i++) {
			dis[i] = btwdis(new point(1, 1), p[i]);
			for (int j = i - 1; j >= 0; j--) {
				dis[i] = (dis[i] - (dis[j] * btwdis(p[j], p[i]) % mod) + mod) % mod;
			}
		}

		long ans = ncr(r + c - 2, r - 1);
		for (int i = 0; i < n; i++) {
			ans = (ans - (dis[i] * btwdis(p[i], new point(r, c)) % mod) + mod) % mod;
		}

		System.out.println(ans);

	}

	private static long btwdis(point p1, point p2) {
		if (p1.r <= p2.r && p1.c <= p2.c) {
			int down = p2.r - p1.r;
			int right = p2.c - p1.c;
			return ncr(right + down, down);
		}
		return 0;
	}
}