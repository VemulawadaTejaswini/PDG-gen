
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int[] a = new int[n];
			int maxVal = 0;
			for (int i = 0; i < n; i++) {
				int v = s.nextInt();
				a[i] = v;
				if (v > maxVal) {
					maxVal = v;
				}
			}
			int[] tmp = new int[n];
			System.arraycopy(a, 0, tmp, 0, n);
			int max = gcd(tmp, 0);

			for (int i = 0; i < n; i++) {
				int original = a[i];
				if (original == max) {
					continue;
				}
				a[i] = maxVal;
				int gcd = gcd(a, max);
				if (gcd > max) {
					max = gcd;
				}
				a[i] = original;
			}
			System.out.println(max);
		}
	}

	static int gcd(int[] values, int limit) {
		int ret = values[0];
		for (int i = 1; i < values.length; i++) {
			ret = gcd(ret, values[i]);
			if (ret < limit) {
				return -1;
			}
		}
		return ret;
	}

	static int gcd(int a, int b) {
		int tmp;
		while ((tmp = a % b) != 0) {
			a = b;
			b = tmp;
		}
		return b;
	}
}