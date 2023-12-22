import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		long k = Integer.parseInt(sc.next());
		long[] a = new long[n + 1];
		long[] b = new long[m + 1];
		a[0] = 0;
		b[0] = 0;
		for (int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(sc.next()) + a[i - 1];
		}
		for (int i = 1; i <= m; i++) {
			b[i] = Integer.parseInt(sc.next()) + b[i - 1];
		}
		int count = 0;
		int idx = m;
		for (int i = 0; i <= n && a[i] <= k; i++) {
			while (a[i] + b[idx] > k) {
				idx--;
			}
			count = Math.max(count, i + idx);
		}
		System.out.println(count);
	}
}
