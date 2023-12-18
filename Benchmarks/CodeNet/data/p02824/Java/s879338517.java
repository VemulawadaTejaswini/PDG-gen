import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int v = scanner.nextInt();
		int p = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		Arrays.parallelSort(a);

		int min = p;
		int sup = n + 1;
		int mid;
		while (sup - min > 1) {
			mid = (min + sup) / 2;
			if (canBeChosen(mid, n, m, v, p, a)) {
				min = mid;
			} else {
				sup = mid;
			}
		}

		System.out.println(min);
	}

	static boolean canBeChosen(int k, int n, int m, int v, int p, int[] a) {
		int threshold = a[n - k] + m;
		if (threshold < a[n - p]) {
			return false;
		}
		int remain = v - (n - k + p);
		if (remain <= 0) {
			return true;
		}
		long canVote = 0;
		for (int i = p; i < k; i++) {
			canVote += threshold - a[n - i];
		}
		return canVote >= (long) remain * m;

	}
}
