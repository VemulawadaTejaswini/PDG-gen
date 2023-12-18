import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = arrayInt(sc, n);
		sc.close();
		int max = 0;
		int pos = 0;
		for (int i = 0; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
				pos = i;
			}
		}
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			if (i == pos) {
				System.out.println(a[a.length - 2]);
			} else {
				System.out.println(max);
			}
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
