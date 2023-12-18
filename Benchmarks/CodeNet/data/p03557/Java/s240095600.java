import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long[] a = new Long[n];
		Long[] b = new Long[n];
		Long[] c = new Long[n];
		for (int i = 0; i < n; i++) a[i] = sc.nextLong();
		for (int i = 0; i < n; i++) b[i] = sc.nextLong();
		for (int i = 0; i < n; i++) c[i] = sc.nextLong();

		Arrays.sort(a);
		Arrays.sort(c);

		long answer = 0;
		for (int i = 0; i < n; i++) {
			if (a[0] >= b[i]) continue;
			if (c[n - 1] <= b[i]) continue;
			int ai = upperBound(a, b[i]);
			int ci = lowerBound(c, b[i]);
			answer += (ai - 1) * (n - ci + 1);
		}

		System.out.println(answer);
	}

	private static int upperBound(Long[] a, Long x) {
		int ub = Arrays.binarySearch(a, x, (n, m) -> n.compareTo(m) >= 0 ? 1 : -1);
		if (ub < 0) ub = -ub;
		return ub;
	}

	private static int lowerBound(Long[] a, Long x) {
		int lb = Arrays.binarySearch(a, x, (n, m) -> n.compareTo(m) > 0 ? 1 : -1);
		if (lb < 0) lb = -lb;
		return lb;
	}
}
