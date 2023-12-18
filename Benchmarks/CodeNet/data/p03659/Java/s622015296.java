import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		long[] sums = new long[n - 1];
		long total = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
			total += arr[i];
			if (i != n - 1) {
				sums[i] = total;
			}
		}
		for (int i = 0; i < n - 1; i++) {
			sums[i] = Math.abs(total - sums[i] * 2);
		}
		Arrays.sort(sums);
		System.out.println(sums[0]);
	}
}
