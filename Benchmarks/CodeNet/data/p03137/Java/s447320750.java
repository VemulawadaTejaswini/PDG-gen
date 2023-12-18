import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static boolean memo[];
	static int ans, min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[m];
		int sum = 0;
		for (int i = 0; i < m; i++) {
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		if (m > n) {
			int[] diff = new int[m - 1];
			for (int i = 0; i < m - 1; i++) {
				diff[i] = Math.abs(x[i + 1] - x[i]);
				sum += diff[i];
			}
			Arrays.sort(diff);
			for (int i = 0; i < n - 1; i++) {
				sum = sum - diff[m - 2 - i];
			}
		}
		System.out.println(sum);
	}
}
