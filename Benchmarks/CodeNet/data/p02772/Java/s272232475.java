import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = arrayInt(sc, n);
		sc.close();
		boolean ans = true;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				if (a[i] % 3 != 0) {
					if (a[i] % 5 != 0) {
						ans = false;
					}
				}
			}
		}
		System.out.println(ans ? "APPROVED" : "DENIED");
	}

	public static int arrayMax(int[] array) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > ans)
				ans = array[i];
		}
		return ans;
	}

	public static int[] arrayInt(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static Integer[] arrayInteger(Scanner sc, int n) {
		Integer[] array = new Integer[n];
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