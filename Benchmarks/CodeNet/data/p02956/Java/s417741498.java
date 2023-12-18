import java.util.*;

class Main {
	static final long M = 998244353;

	static class BIT {
		private int n;
		private int[] a;

		BIT(int _n) {
			n = _n + 1;
			a = new int[n];
		}

		public int sum(int i) {
			int s = 0;
			for (int index = i; index > 0; index -= (index & -index)) {
				s += a[index];
			}
			return s;
		}

		public void add(int i, int x) {
			for (int index = i; index < n; index += (index & -index)) {
				a[index] += x;
			}
		}
	}


	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] xy = new int[n][2];
		NavigableMap<Integer, Integer> hx = new TreeMap<>();
		NavigableMap<Integer, Integer> hy = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
			hx.put(xy[i][0], 0);
			hy.put(xy[i][1], 0);
		}

		int index = 0;
		for (Integer i : hx.keySet()) hx.put(i, index++);
		index = 0;
		for (Integer i : hy.keySet()) hy.put(i, index++);

		for (int i = 0; i < n; i++) {
			xy[i][0] = hx.get(xy[i][0]);
			xy[i][1] = hy.get(xy[i][1]);
		}

		Arrays.sort(xy, (a, b) -> Integer.compare(a[0], b[0]));
		long[] a = new long[n];
		long[] b = new long[n];
		long[] c = new long[n];
		long[] d = new long[n];
		BIT bit = new BIT(n + 1);
		for (int i = 0; i < n; i++) {
			int y = xy[i][1] + 1;
			a[i] = bit.sum(y);
			b[i] = i - a[i];
			bit.add(y, 1);
		}
		long[] t = a;
		a = c;
		c = t;

		t = b;
		b = d;
		d = t;
		bit = new BIT(n + 1);
		for (int i = n - 1; i >= 0; i--) {
			int y = xy[i][1] + 1;
			a[i] = bit.sum(y);
			b[i] = (n - 1 - i) - a[i];
			bit.add(y, 1);
		}

		long answer = 0;
		for (int i = 0; i < n; i++) {
			//System.out.printf("%d %d %d %d\n", a[i], b[i], c[i], d[i]);
			answer = (answer + f(a[i], b[i], c[i], d[i])) % M;
		}
		System.out.println(answer);
	}

	private static long pow(long x, long n, long M) {
		long a = 1;
		while (n > 0) {
			if ((n & 1) == 1) a = (a * x) % M;
			x = (x * x) % M;
			n >>= 1;
		}
		return a;
	}

	private static long f(long a, long b, long c, long d) {
		long result = 0;
		long[] abcd = {a, b, c, d};
		long[] o = new long[4];
		long[] ox = new long[4];
		for (int i = 0; i < 4; i++) {
			ox[i] = pow(2, abcd[i], M);
			o[i] = ox[i] - 1;
		}
		result += (((((ox[0] * o[1]) % M) * o[2]) % M) * ox[3]) % M;
		result += (((((o[0] * ox[1]) % M) * ox[2]) % M) * o[3]) % M;
		result -= (((((o[0] * o[1]) % M) * o[2]) % M) * o[3]) % M;
		if (result < 0) result += M;
		result += (((((ox[0] * ox[1]) % M) * ox[2]) % M) * ox[3]) % M;
		return result % M;
	}
}
