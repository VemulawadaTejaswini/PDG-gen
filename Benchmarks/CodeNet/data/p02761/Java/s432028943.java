import java.util.*;

public class Main {
	static long MOD = (long) 1e9 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] s = new int[m];
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		sc.close();
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = 10;
		}
		boolean can = true;
		for (int i = 0; i < m; i++) {
			if (ans[s[i] - 1] == 10) {
				ans[s[i] - 1] = c[i];
				if (s[i] - 1 == 0 && c[i] == 0 && n != 1) {
					can = false;
					break;
				}
			} else if (ans[s[i] - 1] != c[i]) {
				can = false;
				break;
			}
		}
		if (!can) {
			System.out.println(-1);
		} else {
			for (int i = 0; i < n; i++) {
				if (ans[i] != 10) {
					System.out.print(ans[i]);
				} else {
					if (i == 0) {
						System.out.print(1);
					} else {
						System.out.print(0);
					}
				}
			}
		}
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
