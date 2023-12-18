import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static long MOD = (long) (Math.pow(10, 9) + 7);
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = ni();
		int firstblasta = 0;
		int firstb = 0;
		int lasta = 0;
		int ans = 0;

		for (int i = 0; i < n; i++) {
			String s = n();
			if (s.charAt(0) == 'B' && !(s.charAt(s.length() - 1) == 'A')) {
				firstb++;
			}
			if (s.charAt(s.length() - 1) == 'A' && !(s.charAt(0) == 'B')) {
				lasta++;
			}
			if (s.charAt(0) == 'B' && s.charAt(s.length() - 1) == 'A') {
				firstblasta++;
			}
			ans += abcount(s);
		}

		if (firstblasta == 0) {
			ans += min(firstb, lasta);
		} else if (firstblasta != 0 && max(firstb, lasta) != 0) {
			ans += firstblasta + min(firstb, lasta);
		}
		if (firstb == 0 && lasta == 0) {
			ans += firstblasta - 1;
		}

		out(ans);
	}

	/*
	 * 以下メソッド集
	 */

	static int abcount(String str) {
		int count = 0;
		int len = str.length();
		for (int i = 0; i < len - 1; i++) {
			if ("AB".equals(str.substring(i, i + 2))) {
				count++;
			}
		}
		return count;
	}

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
