import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		long ans = Long.MAX_VALUE;
		int end = 1 << n - 1;
		for (int i = 0; i < end; i++) {
			long val = 0;
			long now = a[0];
			int cnt = 1;
			for (int j = 0; j < n - 1; j++) {
				if ((i >> j & 1) == 1) {
					val += Math.max(now + 1 - a[j + 1], 0);
					now = Math.max(now + 1, a[j + 1]);
					cnt++;
				}
			}
			if (cnt >= k) {
				ans = Math.min(ans, val);
			}
		}
		System.out.println(ans);
	}
}
