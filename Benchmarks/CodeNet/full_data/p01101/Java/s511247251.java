import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) {
				break;
			}

			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			int max = -1;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] + a[j] <= m) {
						max = Math.max(max, a[i] + a[j]);
					}
				}
			}
			if (max == -1) {
				System.out.println("NONE");
			} else {
				System.out.println(max);
			}
		}

	}
}
