
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			p = scanner.nextInt();
			if (p == 0)
				break;
			n = new int[6];
			for (int i = 0; i < 6; i++)
				n[i] = scanner.nextInt();
			u = new int[6];
			System.out.println(slove(p, 5));
		}
	}

	private int slove(int r, int c) {
		if (c >= 0) {
			int ans = 1 << 30;
			for (int i = 0; i < (c % 2 == 1 ? 2 : 1); i++) {
				u[c] = Math.min(n[c], r / coin[c] + i);
				ans = Math.min(ans,
						slove(Math.max(0, r - u[c] * coin[c]), c - 1) + u[c]);
			}
			return ans;
		} else {
			int ch = -p;
			for (int i = 0; i < 6; i++)
				ch += coin[i] * u[i];
			int ans = 0;
			for (int i = 5; i >= 0; i--) {
				ans += ch / coin[i];
				ch %= coin[i];
			}
			return ans;
		}
	}

	int p;
	int[] n, u;
	int[] coin = { 1, 5, 10, 50, 100, 500 };
}