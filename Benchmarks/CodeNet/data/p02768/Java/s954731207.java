import java.util.Scanner;

public class Main {

	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		long answer = pow(2, n, MOD);
		// nC0
		answer = answer - 1;

		// nCa
		answer = answer - nCk(n, a, MOD);

		// nCb
		answer = answer - nCk(n, b, MOD);

		if (answer < 0) {
			answer = answer + MOD;
		}

		print(answer);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

	// return nCk mod M (M must be prime number) O(min(k,n-k)*logM)
	public static long nCk(int n, int k, long M) {
		long ret = 1;
		long min = Math.min(k, n - k);
		for (long i = 1; i <= min; i++) {
			ret = (ret * pow(i, M - 2, M)) % M;
		}
		for (long i = n - min + 1; i <= n; i++) {
			ret = (ret * i) % M;
		}
		return ret;
	}

	// return a^b mod M O(logB)
	public static long pow(long a, long b, long M) {
		long ret = 1;
		long tmp = a;
		while (b > 0) {
			if ((b & 1) == 1)
				ret = (ret * tmp) % M;
			tmp = (tmp * tmp) % M;
			b = b >> 1;
		}
		return ret;
	}

}