import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] arr = new long[n + 1];
		long[] sums = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
			sums[i] = sums[i - 1] + arr[i];
		}
		long min = Long.MAX_VALUE;
		int minIdx = 0;
		long max = Long.MIN_VALUE;
		int maxIdx = 0;
		for (int i = 1; i + k - 1 <= n; i++) {
			long x = sums[i + k - 1] - sums[i - 1];
			if (min > x) {
				min = x;
				minIdx = i;
			}
			if (max < x) {
				max = x;
				maxIdx = i;
			}
		}
		long sumMin = 0;
		long sumMax = max;
		for (int i = 1; i <= n; i++) {
			if (i < minIdx || i> minIdx + k - 1 ) {
				if (arr[i] > 0) {
					sumMin += arr[i];
				}
			}
			if (i < maxIdx || i > maxIdx + k - 1) {
				if (arr[i] > 0) {
					sumMax += arr[i];
				}
			}
		}
		System.out.println(Math.max(sumMin, sumMax));
	}
}
