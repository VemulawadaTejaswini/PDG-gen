import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] task = new int[n][2];
		for (int i = 0; i < n; i++) {
			task[i][1] = sc.nextInt();
			task[i][0] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(task, (a, b) -> Integer.compare(a[0], b[0]));
		long now = 0;
		boolean ans = true;
		for (int i = 0; i < n; i++) {
			now += task[i][1];
			if (now > task[i][0]) {
				ans = false;
				break;
			}
		}
		System.out.println(ans ? "Yes" : "No");
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
