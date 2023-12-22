import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}

			int[] a = new int[n];
			int[] b = new int[m];
			int sumA, sumB;
			sumA = sumB = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sumA += a[i];
			}
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
				sumB += b[i];
			}

			int q = sumA - sumB;
			int optA, optB;
			optA = optB = -1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if ((a[i] - b[j]) * 2 == q) {
						if (optA == -1 || a[i] + b[j] < optA + optB) {
							optA = a[i];
							optB = b[j];
						}
					}
				}
			}

			if (optA == -1) {
				System.out.println(-1);
			} else {
				System.out.println(optA + " " + optB);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}