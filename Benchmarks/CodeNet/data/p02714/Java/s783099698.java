import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static String I = "IMPOSSIBLE";
	public static String B = "Bad";
	public static String G = "Good";
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		long numR = 0;
		long numG = 0;
		long numB = 0;
		long ans = 0;
		for (int i = 0; i < N; i++) {
			char c = S.charAt(i);
			if (c == 'R') {
				numR++;
			} else if (c == 'G') {
				numG++;
			} else {
				numB++;
			}
		}
		// 組み合わせの数を計算
		ans = numR * numG * numB;
		for (int a = 1; a < N; a++) {
			for (int sa = 1; a + sa * 2 <= N; sa++) {
				if (S.charAt(a - 1) != S.charAt(a + sa - 1) && S.charAt(a - 1) != S.charAt(a + sa * 2 - 1)
						&& S.charAt(a + sa - 1) != S.charAt(a + sa * 2 - 1)) {
					ans--;
				}
			}
		}
		System.out.println(ans);
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
