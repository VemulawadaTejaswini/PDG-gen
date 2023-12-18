import java.util.*;

public class Main {
	static int mod = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] ary = new long[n];
		long[] bits = new long[60];
		for(int i=0; i<n; i++){
			ary[i] = sc.nextLong();
			for (int j = 0; j < 60; j++) {
				if ((1 & ary[i] >> j) == 1) {
					bits[j]++;
				}
			}
		}

		long result = 0;
		for (int j = 0; j < 60; j++) {
			long now = bits[j]*(n-bits[j])%mod;
			now = now*modPow(2, j, mod);
			result += now;
			result %= mod;
		}
		System.out.println(result);
	}
	public static long modPow(long base, long exp, long mod) {
		if (exp == 0)
			return 1;
		if (exp == 1)
			return base % mod;
		if (exp % 2 == 1)
			return (base * modPow(base, exp - 1, mod) % mod);
		long tmp = modPow(base, exp / 2, mod);
		return (tmp * tmp) % mod;
	}
}
