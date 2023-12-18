import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int ans = 0;
		int tmp = 0;
		for (int type = 0; type < 2; type++) {
			ans = 0;
			long wa = 0;
			for (int i = 0; i < n; i++) {
				wa += a[i];
				if (i % 2 == type % 2) {
					if (wa >= 0) {
						ans += (wa + 1);
						wa = -1;
					}
				} else {
					if (wa <= 0) {
						ans -= (wa - 1);
						wa = 1;
					}
				}
			}
			if (type == 0)
				tmp = ans;
		}
		System.out.println(Math.min(ans, tmp));
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
