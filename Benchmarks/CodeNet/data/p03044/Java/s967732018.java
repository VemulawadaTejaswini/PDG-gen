import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		List<int[]> a = new ArrayList<>();

		for (int i = 1; i < N; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();

			a.add(new int[] { u, v, w });
		}

		a.sort((x, y) -> {
			int c = Integer.compare(x[0], y[0]);
			if (c != 0) {
				return c;
			} else {
				return Integer.compare(x[1], y[1]);
			}

		});

		Set<Integer> even = new HashSet<>();
		Set<Integer> odd = new HashSet<>();

		even.add(1);

		for (int[] b : a) {
			if (even.contains(b[0])) {
				if (b[2] % 2 == 0) {
					even.add(b[1]);
				} else {
					odd.add(b[1]);
				}
			} else if (odd.contains(b[0])) {
				if (b[2] % 2 == 0) {
					odd.add(b[1]);
				} else {
					even.add(b[1]);
				}
			} else if (even.contains(b[1])) {
				if (b[2] % 2 == 0) {
					even.add(b[0]);
				} else {
					odd.add(b[0]);
				}
			} else if (odd.contains(b[1])) {
				if (b[2] % 2 == 0) {
					odd.add(b[0]);
				} else {
					even.add(b[0]);
				}
			}
		}

		for (int i = 1; i <= N; i++) {
			if (even.contains(i)) {
				out.println(0);
			} else {
				out.println(1);
			}
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
