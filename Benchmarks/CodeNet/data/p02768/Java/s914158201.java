import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int div = 1000000007;
			long ans = pow(2, n, div);
			int A = nCk(n, a, div);
			int B = nCk(n, b, div);
			ans -= A;
			ans -= B;
			ans -= 1;
			if (ans < 0) {
				System.out.print((div + ans) % div);
			} else {
				System.out.print(ans % div);
			}
		}
	}

	public static int nCk(int n, int k, int M) {
		long ret = 1;
		int min = Math.min(k, n - k);
		for (int i = 1; i <= min; i++) {
			ret = (ret * pow(i, M - 2, M)) % M;
		}
		for (int i = n - min + 1; i <= n; i++) {
			ret = (ret * i) % M;
		}
		return (int) ret;
	}

	//return a^b mod M O(logB)
	public static long pow(long a, long b, int M) {
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