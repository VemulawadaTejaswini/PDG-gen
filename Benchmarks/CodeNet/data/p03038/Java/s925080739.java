import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n];

		long result = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int b, c = 0;
		int j,k;

		for (int i = 0; i < m; i++) {
			b = sc.nextInt();
			c = sc.nextInt();

			for (j = 0; j < n; j++) {
				if (a[j] < c) {
					a[j] = c;
					b--;
				} else {
					break;
				}
				if (b <= 0) {
					break;
				}
			}

			result = 0;
			for (k = 0; k < n; k++) {
				result += a[k];
			}
			Arrays.sort(a);

		}

		System.out.println(result);
	}

}
