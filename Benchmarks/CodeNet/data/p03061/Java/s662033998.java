import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 値を取得
		int n = sc.nextInt();
		int[] a = new int[n];
		int ans = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(a);

		if (n == 2) {
			ans = a[1];
			System.out.println(ans);
			return;
		}

		if (n == 3) {
			ans = Math.max(gcd(a[2], a[1]), Math.max(gcd(a[2], a[0]), gcd(a[1], a[0])));
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < n; i++) {
			int cal = 0;
			int left = i == 0 ? 0 : a[0];
			int light = i == n - 1 ? 0 : a[i + 1];
			for (int j = 1; j < i && left > 0; j++) {
				left = gcd(left, a[j]);
			}
			for (int j = i + 2; j < n && light > 0; j++) {
				light = gcd(light, a[j]);
				//System.out.println(light);
			}
			if (left == 0 || light == 0) {
				cal = left == 0 ? light : left;
			} else if (left < light) {
				cal = gcd(light, left);
			} else {
				cal = gcd(left, light);
			}
			if (ans < cal) {
				//System.out.println("ans" + ans + " " + cal);
				ans = cal;
			}
		}

		System.out.println(ans);

	}

	static int gcd(final int max, final int min) {
		//System.out.println(max + " " + min);
		if (max % min == 0) {
			return min;
		}
		return gcd(min, max % min);
	}
}
