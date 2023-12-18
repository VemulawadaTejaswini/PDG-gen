import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		int[] t;
		int[] x;
		int[] y;

		try (Scanner scanner = new Scanner(System.in)) {
			n = scanner.nextInt();

			t = new int[n];
			x = new int[n];
			y = new int[n];
			for (int i = 0; i < n; i++) {
				t[i] = scanner.nextInt();
				x[i] = scanner.nextInt();
				y[i] = scanner.nextInt();
			}
		}

		boolean canArrive = true;

		for (int i = 0; i <= n - 2; i++) {
			if (Math.abs(x[i + 1] - x[i] + y[i + 1] - y[i]) % 2 == 1) {
				canArrive = false;
				break;
			}
		}

		if (canArrive) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}