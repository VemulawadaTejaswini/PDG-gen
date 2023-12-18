import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();
		sc.close();
		if (x <= a * a * b / 2.0) {
			System.out.println(90.0 - Math.toDegrees(Math.atan((2.0 * x) / (a * b * b))));
		} else {
			System.out.println(Math.toDegrees(Math.atan((2.0 * (a * a * b - x)) / (a * a * a))));
		}
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
