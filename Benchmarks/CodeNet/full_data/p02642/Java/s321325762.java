import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static long MOD = (long) (Math.pow(10, 9) + 7);
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = ni();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = ni();
		}

		Arrays.sort(a);

		int count = 0;
		boolean flg = false;
		for (int i = 0; i < n; i++) {
			if (i == 0 && a[i] != a[i + 1]) {
				count++;
			}

			for (int j = 0; j < i; j++) {

				flg = true;
				if (a[i] % a[j] == 0) {
					flg = false;
					break;
				}
				if (a[i] == a[j]) {
					flg = false;
					break;
				}
				try {

					if (a[i] == a[i - 1]) {
						flg = false;
						break;
					}
				} catch (Exception e) {

				}
				try {
					if (a[i] == a[i + 1]) {
						flg = false;
						break;
					}

				} catch (Exception e) {

				}
			}

			if (flg) {
				count++;
			}
		}
		out(count);
	}

	/*
	 * 以下メソッド集
	 */

	static int ketasuu(int n) {
		String str = "" + n;
		return str.length();
	}

	static int abcount(String str) {
		int count = 0;
		int len = str.length();
		for (int i = 0; i < len - 1; i++) {
			if ("AB".equals(str.substring(i, i + "AB".length()))) {
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
