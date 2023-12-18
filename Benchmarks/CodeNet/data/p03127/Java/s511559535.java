import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}

		// 昇順ソート
		Arrays.sort(a);

		int ans = a[0];
		int tmp = ans;
		// ループ
		for (int j = 0; j < a.length - 1; j++) {
			for (int k = j + 1; k < a.length; k++) {

				tmp = a[j] - (a[k] % a[j]);
				if (tmp < ans) {
					ans = tmp;
				}

			}
		}

		System.out.println(ans);
	}
}