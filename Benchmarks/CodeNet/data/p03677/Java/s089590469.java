import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n + 1];
		int[] result = new int[m + 1];
		for (int i =1; i < n + 1; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 2; i < n + 1; i++) {
			int steps = (a[i] - a[i - 1] + m) % m;
			for (int j = 1; j < m + 1; j++) {
				if (steps == 1) {
					result[j] += 1;
				} else {
					int usex = (a[i] - j + m) % m + 1;
					result[j] += Math.min(steps, usex);
				}
			}
		}

		int min = Integer.MAX_VALUE;
		for (int i = 1; i < m + 1; i++) {
			min = Math.min(min, result[i]);
		}
		System.out.println(min);
	}
}