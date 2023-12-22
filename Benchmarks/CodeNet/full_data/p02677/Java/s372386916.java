import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static final boolean debugMode = false;

	static final long DIV_INF = 998244353l;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = readInt(sc);
		double b = readInt(sc);
		double h = readInt(sc);
		double m = readInt(sc);

		double rad_m = 2d * Math.PI * m / 60d;
		double rad_h = 2d * Math.PI * (h / 12d + m / 720d);

		double x_h = a * Math.cos(rad_h);
		double y_h = a * Math.sin(rad_h);
		double x_m = b * Math.cos(rad_m);
		double y_m = b * Math.sin(rad_m);

		System.out.println(Math.sqrt(Math.pow((y_h - y_m), 2) + Math.pow((x_h - x_m), 2)));

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
