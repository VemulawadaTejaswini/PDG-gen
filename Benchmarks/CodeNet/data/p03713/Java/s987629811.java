import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private List<Long> f2(long h, long w) {
		List<Long> result = new ArrayList<>();
		if (h < w) {
			long tmp = h;
			h = w;
			w = tmp;
		}

		if (h % 2 == 0) {
			result.add((long)h / 2 * w);
			result.add((long)h / 2 * w);
			return result;
		}

		if (w % 2 == 0) {
			result.add((long)h * w / 2);
			result.add((long)h * w / 2);
			return result;
		}

		long h1 = (h + 1) / 2;
		long h2 = h / 2;

		result.add((long)h1 * w);
		result.add((long)h2 * w);
		return result;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		sc.close();

		if (H % 3 == 0 || W % 3 == 0) {
			out.println(0);
			return;
		}

		if (H < W) {
			int tmp = H;
			H = W;
			W = tmp;
		}

		long H1 = H / 3;
		List<Long> l1 = f2(H - H1, W);
		l1.add(H1 * W);
		long ans1 = Collections.max(l1) - Collections.min(l1);

		long H2 = (H + 3 - 1) / 3;
		List<Long> l2 = f2(H - H2, W);
		l2.add(H2 * W);
		long ans2 = Collections.max(l2) - Collections.min(l2);

		out.println(Math.min(ans1, ans2));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
