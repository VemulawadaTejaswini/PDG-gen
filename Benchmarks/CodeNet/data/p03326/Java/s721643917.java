import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private long sum(int m, List<long[]> l) {
		long x1 = 0, y1 = 0, z1 = 0;
		long x2 = 0, y2 = 0, z2 = 0;
		for (int i = 0; i < m; i++) {
			long[] a1 = l.get(i);
			x1 += a1[0];
			y1 += a1[1];
			z1 += a1[2];

			long[] a2 = l.get(l.size() - i - 1);
			x2 += a2[0];
			y2 += a2[1];
			z2 += a2[2];

		}
		return Math.max(
				Math.abs(x1) + Math.abs(y1) + Math.abs(z1),
				Math.abs(x2) + Math.abs(y2) + Math.abs(z2));
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		List<long[]> l = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			l.add(new long[] { sc.nextLong(), sc.nextLong(), sc.nextLong() });
		}

		// 正, 正, 正
		// 負, 負, 負
		l.sort((a, b) -> Long.compare(a[0] + a[1] + a[2], b[0] + b[1] + b[2]));
		long ans1 = sum(M, l);

		// 正, 正, 負
		// 負, 負, 正
		l.sort((a, b) -> Long.compare(a[0] + a[1] - a[2], b[0] + b[1] - b[2]));
		long ans2 = sum(M, l);

		// 正, 負, 正
		// 負, 正, 負
		l.sort((a, b) -> Long.compare(a[0] - a[1] + a[2], b[0] - b[1] + b[2]));
		long ans3 = sum(M, l);

		// 正, 負, 負
		// 負, 正, 正
		l.sort((a, b) -> Long.compare(a[0] - a[1] - a[2], b[0] - b[1] - b[2]));
		long ans4 = sum(M, l);

		long ans = Math.max(Math.max(ans1, ans2), Math.max(ans3, ans4));

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
