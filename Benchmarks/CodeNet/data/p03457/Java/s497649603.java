import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		int cx = 0;
		int cy = 0;
		int ct = 0;

		String ans = "Yes";

		for (int i = 0; i < N; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			int d = Math.abs(cx - x) + Math.abs(cy - y);

			if (t < d + ct) {
				ans = "No";
				break;
			}

			if ((t - ct) % 2 != d % 2) {
				ans = "No";
				break;
			}

			cx = x;
			cy = y;
			ct = t;
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
