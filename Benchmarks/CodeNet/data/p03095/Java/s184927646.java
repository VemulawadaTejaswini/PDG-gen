import java.util.Scanner;

public class Main {

	static long MOD = 1000000007;
	//	static long MOD = 7;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		char[] S = in.next().toCharArray();
		int[] alph = new int[26];
		for (int i = 0; i < S.length; i++) {
			alph[S[i] - 'a']++;
		}
		long ans = modpow(2, N) - 1;
		int countUnderOne = 0;
		int countOverOne = 0;
		for (int i = 0; i < alph.length; i++) {
			if (alph[i] == 1) {
				countUnderOne++;
			} else if (S.length == alph[i]) {
				ans = alph[i];
				break;
			} else if (alph[i] > 1) {
				countOverOne++;
				long modpow = modpow(2, S.length - alph[i]);
				long count = modpow(2, alph[i]) - 1 - alph[i];
				while (count < 0) {
					count += MOD;
				}
				ans = ans - (modpow * count % MOD);
				while (ans < 0) {
					ans += MOD;
				}
			}
		}
		if (countOverOne > 1) {
			long modpow = modpow(2, countOverOne) - 1 - countOverOne;
			while (modpow < 0) {
				modpow += MOD;
			}
			ans += modpow(2, countUnderOne) * modpow;
		}
		System.out.println(ans %= MOD);
		in.close();
	}

	static long modpow(long a, long n) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) > 0)
				res = res * a % MOD;
			a = a * a % MOD;
			n >>= 1;
		}
		return res;
	}
}