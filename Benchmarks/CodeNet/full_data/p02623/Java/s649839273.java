import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		int indexA = 0;
		int indexB = 0;
		int count = 0;
		long page = 0;
		while (page <= k) {
			if (indexA >= n && indexB >= m) {
				break;
			} else if (indexA < n && indexB < m && a[indexA] < b[indexB]) {
				page += a[indexA];
				indexA++;
			} else {
				page += b[indexB];
				indexB++;
			}
			if (page > k) {
				break;
			}
			count++;
		}
		System.out.println(count);
	}
}