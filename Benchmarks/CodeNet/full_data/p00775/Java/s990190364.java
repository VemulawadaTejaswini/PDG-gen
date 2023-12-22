import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int R = sc.nextInt();
			int N = sc.nextInt();
			if (R == 0) break;
			int[] H = new int[41];
			for (int i = 0; i < N; ++i) {
				int l = sc.nextInt();
				int r = sc.nextInt();
				int h = sc.nextInt();
				for (int j = l; j < r; ++j) {
					H[j + 20] = Math.max(H[j + 20], h);
				}
			}
			double ans = 1e9;
			for (int i = -R; i < R; ++i) {
				int h = H[i + 20];
				int w = i < 0 ? -i - 1 : i;
				double y = Math.sqrt(R * R - w * w);
				ans = Math.min(ans, R + h - y);
			}
			System.out.printf("%.6f\n", ans);
		}
	}

}