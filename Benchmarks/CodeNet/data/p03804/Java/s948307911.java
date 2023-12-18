import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		String[] a = new String[n];
		String[] b = new String[m];

		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}

		for (int i = 0; i < m; i++) {
			b[i] = sc.next();
		}

		for (int i = 0; i <= n - m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (!a[i+j].substring(j, j + m ).equals(b[j])) {
					break;
				}
			}
			if (j >= n - m) {
				System.out.println("Yes");
				System.exit(0);
			}
		}

		System.out.println("No");

	}
}
