import java.util.*;

public class Main {
	static long MOD = (long) 1e9 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		boolean[][] ans = new boolean[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
				ans[i][j] = false;
			}
		}
		int n = sc.nextInt();
		int[] b = arrayInt(sc, n);
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (a[j][k] == b[i]) {
						ans[j][k] = true;
					}
				}
			}
		}
		if (solve(ans)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean solve(boolean[][] a) {
		if (a[0][0] || a[1][1] || a[2][2]) {
			return true;
		}
		if (a[2][0] || a[1][1] || a[0][2]) {
			return true;
		}
		for (int i = 0; i < 3; i++) {
			if (a[i][2] || a[i][1] || a[i][0]) {
				return true;
			}
			if (a[0][i] || a[1][i] || a[2][i]) {
				return true;
			}
		}
		return false;
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
