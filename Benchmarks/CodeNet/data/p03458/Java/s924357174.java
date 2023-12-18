import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int k2 = k * 2;
		int[] x = new int[n], y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt() % k2;
			y[i] = sc.nextInt() % k2;
			if (sc.next().equals("W")) {
				//nothing do
			} else {
				x[i] += k;
				y[i] += k;
				x[i] %= k2;
				y[i] %= k2;
			}
		}
		//		System.out.println(Arrays.toString(x));
		//		System.out.println(Arrays.toString(y));
		long ans = 0L;
		for (int i = 0; i <= k; i++) {
			for (int m = 0; m <= k; m++) {
				long count = 0L;
				for (int j = 0; j < n; j++) {
					//					if (x[j] >= i && x[j] <= i + k && y[j] >= m && y[j] <= m + k) {
					//						count++;
					//					}
					if (Math.abs(i - x[j]) / k % 2 == 0 && Math.abs(m - y[j]) / k % 2 == 0) {
						count++;
					}
				}
				ans = Math.max(ans, count);
			}
		}
		System.out.println(ans);
	}
}