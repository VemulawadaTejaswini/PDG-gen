import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long mod = 1_000_000_007L;
		long n2 = modPow(2, n, mod);
		long nCa = modCombination(n, a, mod);
		long nCb = modCombination(n, b, mod);
		long totalMinus = (nCa + nCb + 1) % mod;
		System.out.println(n2 - totalMinus);
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

	// nCrの値を引数で渡したmodで割った余りをlong型で返す。
	public static long modCombination(long n, long r, long mod) {
		long top = 1;
		long bottom = 1;
		for (int i = 1; i <= r; i++) {
			top *= n;
			top %= mod;
			n--;
			bottom *= i;
			bottom %= mod;
		}
		bottom = modPow(bottom, mod-2, mod);
		return (top * bottom) % mod;
	}
}
