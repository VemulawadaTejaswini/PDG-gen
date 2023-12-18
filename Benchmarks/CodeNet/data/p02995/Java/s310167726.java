import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		sc.close();
		long e = b - a + 1;
		a--;
		System.out.println(e - (((b / c) + (b / d) - (b / lcm(c, d))) - ((a / c) + (a / d) - (a / lcm(c, d)))));
	}

	public static final long gcd(long a, long b) {
		// a > b にする(swap)
		if (a < b) {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}
		// ユークリッドの互除法
		long r = -1;
		while (r != 0) {
			r = a % b;
			a = b;
			b = r;
		}

		return a; // b には r=0 の値が入るため、a を返す
	}

	public static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	public static int[] arrayInt(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static long[] arrayLong(Scanner sc, int n) {
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		return array;
	}

	public static double[] arrayDouble(Scanner sc, int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
		}
		return array;
	}
}
