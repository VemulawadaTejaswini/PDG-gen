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
		if (h % 2 == 0) {
			result.add(h / 2 * w);
			result.add(h / 2 * w);
			return result;
		}

		if (w % 2 == 0) {
			result.add(h * w / 2);
			result.add(h * w / 2);
			return result;
		}

		List<Long> l1 = new ArrayList<>();
		l1.add((h / 2) * w);
		l1.add(((h + 1) / 2) * w);

		List<Long> l2 = new ArrayList<>();
		l2.add(h * (w / 2));
		l2.add(h * ((w + 1) / 2));

		if (Math.abs(l1.get(0) - l1.get(1)) < Math.abs(l2.get(0) - l2.get(1))) {
			return l1;
		} else {
			return l2;
		}
	}

	private List<Long> f3(long h, long w) {

		// 1/3（切り捨て）を試す
		long h1 = h / 3;
		List<Long> l1 = f2(h - h1, w);
		l1.add(h1 * w);

		// 1/3 （切り上げ）を試す
		long h2 = (h + 2) / 3;
		List<Long> l2 = f2(h - h2, w);
		l2.add(h2 * w);

		long a1 = Collections.max(l1) - Collections.min(l1);
		long a2 = Collections.max(l2) - Collections.min(l2);

		if (a1 < a2) {
			return l1;
		} else {
			return l2;
		}
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		sc.close();

		List<Long> ans1 = f3(H, W);
		List<Long> ans2 = f3(W, H);

		long a1 = Collections.max(ans1) - Collections.min(ans1);
		long a2 = Collections.max(ans2) - Collections.min(ans2);

		out.println(Math.min(a1, a2));
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
