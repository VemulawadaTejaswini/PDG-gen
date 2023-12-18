package AGC25;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		long K = scanner.nextLong();

		if (K == 0) {
			System.out.println(1);
			return;
		}

		int[][] ansArr = new int[N][2];

		long larger = (A >= B) ? A : B;
		long smaller = (A < B) ? A : B;
		int w = 0;
		for (int i = 0; (larger * i < K) && (i < N); i++) {
			if ((K - larger * i) % smaller == 0) {
				int[] wk = { i, (int) ((K - larger * i) / smaller) };
				if (wk[0] <= N && wk[1] <= N) {
					ansArr[w++] = wk;
				}
			}
		}

		long ans = 0;
		long tempAns = 0;

		for (int k = 0; k < w; k++) {
			//tempAns = calcCombination(N, ansArr[k][0]);
			//tempAns *= calcCombination(N, ansArr[k][1]);
			tempAns = C(N, ansArr[k][0], 998244353);
			tempAns *= C(N, ansArr[k][1], 998244353);
tempAns %= 998244353;
			ans += tempAns;
		}

		ans %= 998244353;
		System.out.println(ans);
	}


	public static long C(int n, int r, int p) {
		long ret = 1;
		while (true) {
			if (r == 0)
				break;
			int N = n % p;
			int R = r % p;
			if (N < R)
				return 0;

			for (int i = 0; i < R; i++) {
				ret = ret * (N - i) % p;
			}
			long imul = 1;
			for (int i = 0; i < R; i++) {
				imul = imul * (i + 1) % p;
			}

			ret = ret * inv(new Long(imul), new Long(p)) % p;
			n /= p;
			r /= p;
		}
		return ret;
	}
	/*
		public static long inv(long imul,int p) {
			return (imul % p + p)%p;

		}*/

	// A naive method to find modulor
	// multiplicative inverse of 'a'
	// under modulo 'm


	public static int inv(Long a, Long m) {
		BigInteger aBigInteger = new BigInteger(a.toString());
		BigInteger mBigInteger = new BigInteger(m.toString());
		BigInteger sBigInteger = aBigInteger.modInverse(mBigInteger);

		return sBigInteger.intValue();

	}


}
