import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

class ModInteger {
	public static long MOD = 1_000_000_007;
	private long x;

	public ModInteger(long n) {
		x = (n % MOD);
	}

	/** 和 */
	public ModInteger add(long augend) {
		return new ModInteger((x + augend) % MOD);
	}

	/** 和 */
	public ModInteger add(ModInteger augend) {
		return add(augend.x);
	}

	/** 逆元 */
	public ModInteger inv() {
		return pow(MOD - 2);
	}

	/** 商 */
	public ModInteger divide(long divisor) {
		return divide(new ModInteger(divisor));
	}

	/** 商 */
	public ModInteger divide(ModInteger divisor) {
		return multiply(divisor.inv());
	}

	/** 積 */
	public ModInteger multiply(long muultiplicand) {
		return new ModInteger((x * muultiplicand) % MOD);
	}

	/** 積 */
	public ModInteger multiply(ModInteger multiplicand) {
		return multiply(multiplicand.x);
	}

	/** 累乗 O(logN) */
	public ModInteger pow(long n) {
		// 繰り返し二乗法
		if (n == 0) {
			return new ModInteger(1);
		}
		ModInteger a = pow(n / 2);
		a = a.multiply(a);
		if (n % 2 == 1) {
			a = a.multiply(x);
		}
		return a;
	}

	/** 差 */
	public ModInteger subtract(long subtrahend) {
		return new ModInteger((x - subtrahend + MOD) % MOD);
	}

	/** 差 */
	public ModInteger subtract(ModInteger subtrahend) {
		return subtract(subtrahend.x);
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof ModInteger) {
			return x == ((ModInteger) o).x;
		}
		return false;
	}

	public boolean equals(long l) {
		return x == (l % MOD);
	}

	@Override
	public int hashCode() {
		return Long.hashCode(x);
	}

	public int compareTo(long val) {
		return Long.compare(x, val);
	}

	public int compareTo(ModInteger val) {
		return compareTo(val.x);
	}

	public long longValue() {
		return x;
	}

	@Override
	public String toString() {
		return Long.toString(x);
	}

	public static ModInteger valueOf(long x) {
		return new ModInteger(x);
	}

}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	static ModInteger[] f;

	// 初期化 O(N)
	static public void init(int n) {
		f = new ModInteger[100100];
		f[0] = new ModInteger(1);
		for (int i = 1; i < f.length; i++) {
			f[i] = f[i - 1].multiply(i);
		}
	}

	static public ModInteger c(int n, int k) {
		// n! / ((n-k)!*k!)
		return f[n].divide(f[n - k].multiply(f[k]));
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		init(N+2);

		sc.close();

		for (int i = 1; i <= K; i++) {
			// 赤(N-K)の間と、左右端の中から、i個の青を入れる場所を選ぶ
			ModInteger a = c(N - K + 1, i);

			// 青(K)をiグループにわける
			ModInteger b = c(K - 1, i - 1);

			out.println(a.multiply(b));
		}
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
