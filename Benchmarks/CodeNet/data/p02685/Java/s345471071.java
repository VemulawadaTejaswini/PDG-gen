import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static final boolean debugMode = false;

	static final long DIV_INF = 998244353l;

	static long  m;
	static int n,k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = readInt(sc);
		m = readLong(sc);
		k = readInt(sc);

		System.out.println(div(m * dfs(2, 0)));

	}

	static long dfs(int depth, int k2) {
		if (depth == n + 1)
			return 1l;

		if (k2 == k) {
			return div((m - 1) * dfs(depth + 1, k2));
		} else {
			return div(dfs(depth + 1, k2 + 1) + (m - 1) * dfs(depth + 1, k2));
		}
	}

	static long div(long x) {
		return x % DIV_INF;
	}

	static int readInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	static Long readLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static void log(String s) {
		if (debugMode) {
			System.out.println(s);
		}
		return;
	}
}

class KrmlUtil {
	// a >= b
	static int gcd(int a, int b) {
		while (true) {
			if (b == 0)
				break;

			int mod = a % b;
			a = b;
			b = mod;
		}
		return a;
	}

	// a >= b
	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	// a >= b
	static long gcd(long a, long b) {
		while (true) {
			if (b == 0)
				break;

			long mod = a % b;
			a = b;
			b = mod;
		}
		return a;
	}

	// a >= b
	static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

	static BigInteger gcd(BigInteger a, BigInteger b) {
		return a.gcd(b);
	}

	static BigInteger lcm(BigInteger a, BigInteger b) {
		return a.divide(a.gcd(b)).multiply(b);
	}
}

class Pair {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Pair() {

	}

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
