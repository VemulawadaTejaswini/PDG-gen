
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n], b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = in.nextInt();
		}

		long ans = 0;
		for (int k = 29; k >= 0; k--) {
			long tmp = 0;
			for (int i = 0; i < n; i++) {
				a[i] %= 1 << (k+1);
				b[i] %= 1 << (k+1);
			}

			int t = 1 << k;
			for (int i = 0; i < n; i++) {
				tmp += lowerBound(b, t - 2*a[i]) - lowerBound(b, t - 1*a[i]);
				tmp += lowerBound(b, t - 4*a[i]) - lowerBound(b, t - 3*a[i]);
			}

			if (tmp % 2 == 1) {
				ans |= 1 << k;
			}
		}

		System.out.println(ans);
		in.close();
	}

	public static int lowerBound(int[] a, int obj) {
		int l = 0, r = a.length - 1;
		while (r - l >= 0) {
			int c = (l + r) / 2;
			if (obj <= a[c]) {
				r = c - 1;
			} else {
				l = c + 1;
			}
		}
		return l;
	}

}