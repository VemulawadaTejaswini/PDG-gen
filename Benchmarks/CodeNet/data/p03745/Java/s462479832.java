

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int ans = 1;
		boolean flg = false;

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1)
				continue;

			if (flg) {
				flg = false;
				continue;
			}
			if (a[i - 1] < a[i] && a[i + 1] < a[i]) {
				ans++;
				flg = true;
			}
			if (a[i - 1] > a[i] && a[i + 1] > a[i]) {
				ans++;
				flg = true;
			}
		}

		System.out.println(ans);
	}

}
