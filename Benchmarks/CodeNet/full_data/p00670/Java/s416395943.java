import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int S = sc.nextInt();
			if ((n | S) == 0)
				break;
			int[] r = new int[n];
			// int[] c = new int[101];
			// int sum = 0;
			for (int i = 0; i < n; i++) {
				r[i] = sc.nextInt();
				// c[r[i]]++;
			}
			// for (int i = 1; i < S; i++) {
			// sum += c[i];
			// }
			// int ans = 0;
			// for (int i = S - 1; i >= (S + 1) / 2; i--) {
			// for (int j = S - i; j <= i; j++) {
			// if (i == j) {
			// ans += c[i] * (c[i] - 1) / 2;
			// // if (c[i] != 0)
			// // System.out.println(i + " " + j + " " + c[i]
			// // * (c[i] - 1) / 2);
			// } else {
			// ans += c[i] * c[j];
			// // if (c[i] != 0 && c[j] != 0)
			// // System.out.println(i + " " + j + " " + c[i] * c[j]);
			// }
			// }
			// }
			// ans += (n - sum) * (n - sum - 1) / 2;
			// System.out.println(ans);
			int ans = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (r[i] + r[j] > S)
						ans++;
				}
			}
			System.out.println(ans);
		}
	}
}