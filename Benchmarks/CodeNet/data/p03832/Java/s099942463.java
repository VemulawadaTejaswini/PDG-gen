import java.util.Scanner;

public class Main {
	static int N;
	static int A;
	static int B;
	static int C;
	static int D;
	static long ans = 0L;
	static long MOD = 1000000007L;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		sc.close();

		int[] grp = new int[N + 1];
		ans = 0L;
		rec(grp, N, A);

		System.out.println(ans);
	}

	private static void rec(int[] grp, int rest, int cur) {
		if (cur > B || rest < cur) {
			return;
		}
		int max = Math.min(rest, D * cur);
		grp[cur] = 0;
		rec(grp, rest, cur + 1);
		for (int i = C * cur; i <= max; i += cur) {
			if (rest - i == 0) {
				grp[cur] = i / cur;
				// 計算
				long tmp = 1L;
				long div = 1L;
				long num = N;
				int j = A;
				while (j <= B) {
					if (grp[j] != 0) {
						for (int k = 0; k < grp[j]; k++) {
							tmp = (tmp * comb(num, j)) % MOD;
							num = num - j;
						}
						div = (div * fact(1, grp[j])) % MOD;
					}
					j++;
				}
				tmp = (tmp * pow(div, MOD - 2)) % MOD;
				ans = (ans + tmp) % MOD;
			} else if (rest - i < cur + 1) {
				break;
			} else {
				grp[cur] = i / cur;
				rec(grp, rest - i, cur + 1);
			}
		}
		grp[cur] = 0;
	}

	private static long comb(long n, long r) {
		r = Math.max(r, n - r);
		long ret = fact(r + 1, n);
		ret = (ret * pow(fact(1, n - r), MOD - 2)) % MOD;
		return ret;
	}

	private static long fact(long min, long max) {
		long i = min;
		long ret = 1L;
		while (i <= max) {
			ret = (ret * i) % MOD;
			i++;
		}
		return ret;
	}

	private static long pow(long a, long b) {
		long ret = 1L;
		long x = a;
		while (b > 0) {
			if ((b & 1L) == 1L) {
				ret = (ret * x) % MOD;
			}
			x = (x * x) % MOD;
			b >>= 1;
		}
		return ret;
	}
}
