import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private boolean isTakahashi(int m, int d) {
		if (d < 10) {
			return false;
		}

		int d1 = d % 10;
		int d10 = d / 10;

		return d1 >= 2 && d10 >= 2 && d1 * d10 == m;

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int M = sc.nextInt();
		int D = sc.nextInt();

		sc.close();

		int ans = 0;
		for (int m = 1; m <= M; m++) {
			for (int d = 1; d <= D; d++) {
				if (isTakahashi(m, d)) {
					ans++;
				}
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
