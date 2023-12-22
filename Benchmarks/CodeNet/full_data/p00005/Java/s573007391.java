import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long a = 0;
		long b = 0;
		while (scanner.hasNext()) {
			a = scanner.nextLong();
			b = scanner.nextLong();

			long lcm = calcLCM(a, b);
			long gcd = calcGCD(a, b, lcm);
			System.out.println(gcd + " " + lcm);
		}

	}

	/**
	 * ?????§??¬?´???°????±???????
	 * @param a ?¬¬????????°
	 * @param b ?¬¬????????°
	 * @return ?????§??¬?´???°
	 */
	private static long calcLCM(long a, long b) {
		long large = a >= b ? a : b;
		long small = a >= b ? b : a;
		long base = a >= b ? b : a;
		while (true) {
			long result = calc(large, small, base);
			if (large == result) {
				return result;
			} else if (large < result) {
				small = large;
				large = result;
				base = base == a ? b : a;
			} else {
				small = result;
			}
		}
	}

	private static long calc(long large, long small, long base) {
		int count = 0;
		while (true) {
			if (large <= base * count + small) {
				return base * count + small;
			}
			count++;
		}
	}

	/**
	 * ????°???¬?????°????±???????
	 * @param a ?¬¬????????°
	 * @param b ?¬¬????????°
	 * @param gcd ?????§??¬?´???°
	 * @return ????°???¬?????°
	 */
	private static long calcGCD(long a, long b, long gcd) {
		return (a * b) / gcd;
	}
}