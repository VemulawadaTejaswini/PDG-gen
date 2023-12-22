import java.util.Scanner;

public class Main {

	private static final long MOD = 1000000007L;

	public static long pow(long a, long x) {
		if (x == 0L) {
			return 1L;
		}

		if (x % 2L == 1L) {
			return a * pow(a, x - 1L) % MOD;
		}

		long t = pow(a, x / 2L);
		return t * t % MOD;
	}

	public static long findInverse(long n) {
		return pow(n, MOD - 2L);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long whole = pow(10L, n);
		long without0 = pow(9L, n);
		long without9 = without0;
		long without0and9 = pow(8L, n);
		long without0or9 = (without0 + without9) % MOD;

		if (without0or9 < without0and9) {
			without0or9 += MOD;
		}

		without0or9 -= without0and9;

		long ans = (whole - without0or9) % MOD;
		System.out.println(ans);
	}

}