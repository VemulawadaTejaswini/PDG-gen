import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		String[] b = new String[n];
		String[] c = new String[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.next();
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				// 1段目と2段目の比較
				if (Long.parseLong(a[i]) < Long.parseLong(b[j])) {
					for (int k = 0; k < n; k++) {
						// 2段目と3段目の比較
						if (Long.parseLong(b[j]) < Long.parseLong(c[k])) {
							count++;
						}
					}
				// 1段目のサイズ > 2段目のサイズであれば、2段目と3段目の比較はしない
				} else {
					continue;
				}
			}
		}

		System.out.println(count);
	}

}
