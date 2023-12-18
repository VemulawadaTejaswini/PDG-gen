import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static String I = "IMPOSSIBLE";
	public static String B = "Bad";
	public static String G = "Good";
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = ni();
		String s = n();

		ArrayList<Integer> rlist = new ArrayList<>();
		ArrayList<Integer> glist = new ArrayList<>();
		ArrayList<Integer> blist = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if ('R' == s.charAt(i)) {
				rlist.add(i + 1);
			}
			if ('G' == s.charAt(i)) {
				glist.add(i + 1);
			}
			if ('B' == s.charAt(i)) {
				blist.add(i + 1);
			}
		}
		long sum = rlist.size() * glist.size() * blist.size();
		long minus = 0;

		//		for (int r : rlist) {
		//			for (int g : glist) {
		//				if (blist.contains(max(r, g) + (Math.abs(r - g)))) {
		//					minus++;
		//				}
		//				if (blist.contains(min(r, g) - (Math.abs(r - g)))) {
		//					minus++;
		//				}
		//				if ((r + g) % 2 == 0) {
		//					if (blist.contains((int) (((double) r + (double) g) / 2.0))) {
		//						minus++;
		//					}
		//				}
		//			}
		//		}

		for (int r : rlist) {
			for (int i = 1; i < 1400; i++) {
				if (glist.contains(r + i) && blist.contains(r + i * 2)) {
					minus++;
				}
			}
		}

		out(sum - minus);
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

	static int max(int a, int b) {
		return Math.max(a, b);
	}

	static long max(long a, long b) {
		return Math.max(a, b);
	}

	static int min(int a, int b) {
		return Math.min(a, b);
	}

	static long min(long a, long b) {
		return Math.min(a, b);
	}
}
