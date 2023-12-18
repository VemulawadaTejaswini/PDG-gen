

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[m];
		for (int i = 0; i < m; i++) {
			x[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(x);

		int[] xd = new int[m - 1];
		for (int i = 0; i < m - 1; i++) {
			xd[i] = x[i + 1] - x[i];
		}
		Arrays.sort(xd);
		int ans = x[m - 1] - x[0];

		if (n < m) {

			for (int i = 1; i < n; i++) {
				ans -= xd[m - i - 1];
			}
		} else {
			ans = 0;
		}
		System.out.println(ans);
	}

}
