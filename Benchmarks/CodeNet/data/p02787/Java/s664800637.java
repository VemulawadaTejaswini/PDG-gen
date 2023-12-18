import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] attack = new int[n];
		int[] cost = new int[n];
		for (int i = 0; i < n; i++) {
			attack[i] = sc.nextInt();
			cost[i] = sc.nextInt();
		}
		sc.close();
		int[] dp = new int[100000000];
		Arrays.fill(dp, 0);
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < n; j++) {
				if (cost[j] <= i) {
					if (attack[j] + dp[i - cost[j]] > dp[i]) {
						dp[i] = attack[j] + dp[i - cost[j]];
					}
				}
			}
			if (dp[i] >= h) {
				System.out.println(i);
				break;
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