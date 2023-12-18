import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			sum += a[i];
		}
		String[] ans = new String[2 * n];
		int c  = 0;
		if (sum >= 0) {
			for (int i = 1; i < n; i++) {
				int index = 0;
				long max = Integer.MIN_VALUE;
				for (int j = 0; j < n; j++) {
					if (a[j] > max) {
						max = a[j];
						index = j;
					}
				}
				while (a[i] < a[i - 1]) {
					a[i] += max;
					ans[c++] = String.valueOf(index + 1) + " " + String.valueOf(i + 1);
				}
			}
		}
		else {
			for (int i = n - 2; i >= 0; i--) {
				int index = 0;
				long min = Integer.MAX_VALUE;
				for (int j = 0; j < n; j++) {
					if (a[j] < min) {
						min = a[j];
						index = j;
					}
				}
				while (a[i] > a[i + 1]) {
					a[i] += min;
					ans[c++] = String.valueOf(index + 1) + " " + String.valueOf(i + 1);
				}
			}
		}
		System.out.println(c);
		for (int i = 0; i < c; i++)
			System.out.println(ans[i]);
	}
}