import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 値を取得
		int n = sc.nextInt();
		int[] a = new int[n];
		int big = 0, sma = 0;
		long calc = 0, u = 1, d = 1;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i] <= a[j]) {
					continue;
				}
				for (int k = 0; k < a[j]; k++) {
					u *= a[i]-k;
					d *= a[j]-k;
				}
				if (calc < u/d) {
					calc = u/d;
					big = a[i];
					sma = a[j];
				}
				u = 1;
				d = 1;
			}
		}

		System.out.println(big+" "+sma);

		sc.close();
	}
}
