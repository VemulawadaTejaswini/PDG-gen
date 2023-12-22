import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		int nowA = 0;
		int nowB = 0;
		long nowTime = 0;
		int ans = 0;
		while (nowTime < k) {
			if (nowA == n && nowB == m) {
				break;
			}
			ans++;

			if (nowA >= n) {
				nowTime += b[nowB];
				nowB++;
				if (nowTime > k) ans--;
				continue;
			} else if (nowB >= m) {
				nowTime += a[nowA];
				nowA++;
				if (nowTime > k) ans--;
				continue;
			}

			if (a[nowA] < b[nowB]) {
				nowTime += a[nowA];
				nowA++;
				if (nowTime > k) ans--;
			} else if (a[nowA] > b[nowB]) {
				nowTime += b[nowB];
				nowB++;
				if (nowTime > k) ans--;
			} else {
				int aa = Integer.MAX_VALUE;
				int bb = Integer.MAX_VALUE;
				if (nowA < n - 1) {
					aa = a[nowA + 1];
				}
				if (nowB < n - 1) {
					bb = b[nowB + 1];
				}
				if (aa < bb) {
					nowTime += a[nowA];
					nowA++;
					if (nowTime > k) ans--;
				} else {
					nowTime += b[nowB];
					nowB++;
					if (nowTime > k) ans--;
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
