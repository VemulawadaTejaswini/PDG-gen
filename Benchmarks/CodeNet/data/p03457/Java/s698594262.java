import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] t = new int[n + 1];
		int[] x = new int[n + 1];
		int[] y = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		String msg = "Yes";

		for (int i = 1; i <= n; i++) {
			int dxdy = Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]);
			int dt = t[i] - t[i - 1];
			if (dxdy > dt || dxdy % 2 != dt % 2) {
				msg = "No";
				break;
			}
		}

		System.out.println(msg);

		sc.close();
	}
}