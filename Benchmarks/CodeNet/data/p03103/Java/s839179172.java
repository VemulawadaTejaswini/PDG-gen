import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		long[][] ab = new long[n][2];

		for (int i = 0; i < n; i++) {
			ab[i][0] = sc.nextInt();
			ab[i][1] = sc.nextInt();
		}

		Arrays.sort(ab, (a, b) -> Long.compare(a[0], b[0]));

//		// debug
//		for (int[] arr : ab) {
//			for (int i : arr) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (m < ab[i][1]) {
				ans += ab[i][0] * m;
				break;
			}
			ans += ab[i][0] * ab[i][1];
			m -= ab[i][1];
		}

		System.out.println(ans);

		sc.close();
	}
}
