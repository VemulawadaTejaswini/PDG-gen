import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		long[] max = new long[n + 1];
		max[0] = 1 - a[0];
		if (max[0] < 0) {
			System.out.println(-1);
			return;
		}
		for (int i = 1; i <= n; i++) {
			max[i] = max[i - 1] * 2 - a[i];
			if (max[i] < 0) {
				System.out.println(-1);
				return;
			}
			if (max[i] > 100000000) {
				for (int j = i + 1; j <= n; j++) {
					max[j] = Integer.MAX_VALUE;
				}
				break;
			}
		}

		long ans = 0;
		long sum = 0;
		for (int i = n; i >= 0; i--) {
			long min = Math.min(sum, max[i]);
			ans += a[i] + min;
			sum += a[i];
		}
		System.out.println(ans);
	}
}
