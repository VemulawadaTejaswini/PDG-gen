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

		for (int i = 0; i < m; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();

			for (int j = 0; j < n; j++) {
				if (a[j] < c) {
					a[j] = c;
					b--;
				}
				if (b <= 0) {
					break;
				}
			}

			long temres = 0;
			for (int k = 0; k < n; k++) {
				temres += a[k];
			}
			result = temres;
			Arrays.sort(a);

		}

		sc.close();

		System.out.println(result);
	}

}
