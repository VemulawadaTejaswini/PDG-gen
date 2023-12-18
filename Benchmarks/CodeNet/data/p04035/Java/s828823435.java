import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();
		long l = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int last = -1;
		for (int i = 0; i < n - 1; i++) {
			if (l <= a[i] + a[i + 1]) {
				last = i;
				break;
			}
		}
		if (0 <= last) {
			sb.append("Possible\n");
			for (int j = 0; j < last; j++) {
				sb.append((j + 1) + "\n");
			}
			for (int j = n - 2; last <= j; j--) {
				sb.append((j + 1) + "\n");
			}
			System.out.print(sb);
		} else {
			System.out.println("Impossible");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
