import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		long[] b = new long[m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextLong();
		}

		int indexA = 0;
		int indexB = 0;
		long count = 0;
		while (k > 0) {
			if (indexA >= n && indexB >= m) {
				break;
			} else if (indexA < n && indexB < m && a[indexA] < b[indexB]) {
				k -= a[indexA];
				indexA++;
			} else if (indexB < m) {
				k -= b[indexB];
				indexB++;
			}
			if (k < 0) {
				break;
			}
			count++;
		}
		System.out.println(count);
	}
}