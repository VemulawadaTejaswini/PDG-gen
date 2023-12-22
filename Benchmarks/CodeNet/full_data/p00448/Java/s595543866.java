
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int r = scanner.nextInt();
			int c = scanner.nextInt();
			if ((r | c) == 0)
				break;
			int[] a = new int[c];
			for (int i = 0; i < r; i++)
				for (int j = 0; j < c; j++)
					a[j] = a[j] * 2 + scanner.nextInt();
			int ans = 0;
			for (int i = 0; i < 1 << r; i++) {
				int k = 0;
				for (int j = 0; j < c; j++) {
					int bitc = Integer.bitCount(a[j] ^ i);
					k += Math.max(bitc, r - bitc);
				}
				ans = Math.max(ans, k);
			}
			System.out.println(ans);
		}
	}
}