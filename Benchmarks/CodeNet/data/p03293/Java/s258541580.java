import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static long MOD = (long) (Math.pow(10, 9) + 7);
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = n();
		String t = n();

		int sl = s.length();

		boolean ok = false;

		for (int i = 0; i < 110; i++) {
			s = s.charAt(sl - 1) + s.substring(0, sl - 1);

			if (s.equals(t)) {
				ok = true;
				break;
			}
		}

		if (ok) {
			out(Y);
		} else {
			out(N);
		}

	}

	/*
	 * 以下メソッド集
	 */
	static int ni() {
		return sc.nextInt();
	}

	static long nl() {
		return sc.nextLong();
	}

	static double nd() {
		return sc.nextDouble();
	}

	static String n() {
		return sc.next();
	}

	static char[] nc() {
		return sc.next().toCharArray();
	}

	static int kaijo(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * kaijo(n - 1);
		}
	}

	static int fib(int n) {
		return (n == 1 || n == 0) ? n : fib(n - 2) + fib(n - 1);
	}

	static long lcm(long m, long n) {

		return m * n / gcd(m, n);
	}

	static int lcm(int m, int n) {

		return m * n / gcd(m, n);
	}

	static long gcd(long a, long b) {
		return (b == 0) ? a : gcd(b, a % b);
	}

	static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}

	static void out(String info) {
		System.out.println(info);
	}

	static void out(int info) {
		System.out.println(info);
	}

	static void out(double info) {
		System.out.println(info);
	}

	static void out(long info) {
		System.out.println(info);
	}

	static void out(char info) {
		System.out.println(info);
	}

	static void out(Object obj) {
		System.out.println(obj.toString());
	}

	static void outn(String info) {
		System.out.print(info);
	}

	static void outn(int info) {
		System.out.print(info);
	}

	static void outn(double info) {
		System.out.print(info);
	}

	static void outn(long info) {
		System.out.print(info);
	}

	static void outn(char info) {
		System.out.print(info);
	}

	static double max(double d, double e) {
		return Math.max(d, e);
	}

	static long max(long a, long b) {
		return Math.max(a, b);
	}

	static double min(double d, double e) {
		return Math.min(d, e);
	}

	static long min(long a, long b) {
		return Math.min(a, b);
	}
}

class XY {
	int h;
	int c;

	XY(int h, int c) {
		this.h = h;
		this.c = c;
	}
}
