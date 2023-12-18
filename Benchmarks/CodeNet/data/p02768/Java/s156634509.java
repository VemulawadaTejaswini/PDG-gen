import java.util.Scanner;

public class Main {
	static int MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		long total = power(2, n, MOD);
		total = (total + MOD - combination(n, a, MOD)) % MOD;
		total = (total + MOD - combination(n, b, MOD)) % MOD;

		System.out.println(total - 1);
	}

	static int power(int base, int exp, int mod) {
		long res = 1;
		int first = base % mod;
		int cnt = exp == 0 ? 0 : firstBitPos(exp) + 1;
		while ( cnt >= 0 ) {
			res = (res * res) % mod;
			if ( ((exp >> cnt) & 1) != 0 ) {
				res = (res * first) % mod;
			}
			cnt--;
		}
		return (int) res;
	}

	// 最大公約数と、ax + by = gcdを満たすx,yを計算する
	static int[] xgcd(int a, int b) {
		int x0 = 1;
		int y0 = 0;
		int x1 = 0;
		int y1 = 1;
		while ( b != 0 ) {
			int q = a / b;
			int tmp = b;
			b = a % b;
			a = tmp;

			tmp = x1;
			x1 = x0 - q * x1;
			x0 = tmp;

			tmp = y1;
			y1 = y0 - q * y1;
			y0 = tmp;
		}
		return new int[] {a, x0, y0};
	}

	// 逆元
	static int modInv(int a, int mod) {
		int[] xgcd = xgcd(a, mod);
		return (xgcd[1] + mod) % mod;
	}

	// 二項係数
	static int combination(int n, int a, int mod) {
		int aa = Math.min(a, n - a);
		long ret = 1;
		for ( int i = 0 ; i < aa ; i++ ) {
			ret = (ret * (n - i)) % mod;
			ret = (ret * modInv(i + 1, mod)) % mod;
		}
		return (int) ret;
	}

	static int firstBitPos(int num) {
		int x = num | (num >> 1);
		x |= x >> 2;
		x |= x >> 4;
		x |= x >> 8;
		x |= x >> 16;
		return countBits(x);
	}

	static int countBits(int num) {
		int cnt = (num & 0x55555555) + (num >> 1 & 0x55555555);
		cnt = (cnt & 0x33333333) + (cnt >> 2 & 0x33333333);
		cnt = (cnt & 0x0f0f0f0f) + (cnt >> 4 & 0x0f0f0f0f);
		cnt = (cnt & 0x00ff00ff) + (cnt >> 8 & 0x00ff00ff);
		return (cnt & 0x0000ffff) + (cnt >> 16 & 0x0000ffff);
	}
}
