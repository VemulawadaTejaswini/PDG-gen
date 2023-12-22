import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] x = new int[n];
			int[] y = new int[n];

			int l, r, t, b;
			l = r = t = b = 0;

			x[0] = y[0] = 0;
			for (int i = 1; i < n; i++) {
				int k = sc.nextInt();
				int d = sc.nextInt();
				int nx = x[k];
				int ny = y[k];
				if (d == 0) l = Math.min(l, --nx);
				if (d == 1) b = Math.min(b, --ny);
				if (d == 2) r = Math.max(r, ++nx);
				if (d == 3) t = Math.max(t, ++ny);
				x[i] = nx;
				y[i] = ny;
			}
			int w = r - l + 1;
			int h = t - b + 1;
			System.out.println(w + " " + h);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}