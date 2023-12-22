
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		boolean[] tri = new boolean[1000001];
		for (int i = 1; i * (i + 1) / 2 <= 1000000; i++)
			tri[i * (i + 1) / 2] = true;
		loop: while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] a = new int[10001];
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				a[i] = scanner.nextInt();
				sum += a[i];
			}
			if (tri[sum]) {
				int res = 0;
				int R = n;
				while (res <= 10000) {
					if (slove(R, a)) {
						System.out.println(res);
						continue loop;
					}
					int L = 1;
					for (int i = 1; i <= R; i++) {
						if (a[i] == 1)
							continue;
						a[L++] = a[i] - 1;
					}
					a[L] = R;
					R = L;
					res++;
				}
			}
			System.out.println(-1);

		}
	}

	private boolean slove(int r, int[] a) {
		for (int i = 1; i <= r; i++)
			if (i != a[i])
				return false;
		return true;
	}
}