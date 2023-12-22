import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());

		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			sum += a[i];
		}
		int left = 1;
		int right = sum;
		int ans = 1;
		while (right - left > 1) {
			ans = (left + right) / 2;
			boolean clear = false;
			clear = isClear(ans, a, x);

			if (clear) {
				right = ans;

			}

			else {
				left = ans + 1;
			}

		}
		System.out.println(right);

	}

	private static boolean isClear(int ans, int[] a, int x) {

		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < x; i++) {
			sum = 0;
			for (int j = cnt; j < a.length; j++) {
				sum += a[j];
				if (sum < ans) {
					cnt++;
				} else {
					if (i == x - 1) {
						return false;
					}
					continue;
				}

			}

		}

		return true;
	}
}