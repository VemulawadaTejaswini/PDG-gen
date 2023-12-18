
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt() - (i + 1);
			}

			long zero = 0;
			for (int aa : a) {
				zero += Math.abs(0 + aa);
			}
			long plus = 0;
			for (int aa : a) {
				zero += Math.abs(1 + aa);
			}
			long minus = 0;
			for (int aa : a) {
				zero += Math.abs(-1 + aa);
			}

			long result = zero;
			long before = result;
			if (zero < plus) {
				for (int i = 0; -1000000000 < i; i--) {
					long tmp = 0;
					for (int aa : a) {
						tmp += Math.abs(i + aa);
					}
					if (tmp < result) {
						result = tmp;
					}
					if (before < tmp) {
						break;
					}
					before = tmp;
				}
			} else {
				for (int i = 0; i < 1000000000; i++) {
					long tmp = 0;
					for (int aa : a) {
						tmp += Math.abs(i + aa);
					}
					if (tmp < result) {
						result = tmp;
					}
					if (before < tmp) {
						break;
					}
					before = tmp;
				}
			}
			System.out.println(result);
		}
	}
}
