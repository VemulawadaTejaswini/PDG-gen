import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	void solv(int[][] x) {

		Map<Integer, List<int[]>> mp = Arrays.stream(x).collect(Collectors.groupingBy(a -> a[1]));

		for (Entry<Integer, List<int[]>> e : mp.entrySet()) {
			AtomicInteger i = new AtomicInteger(1);
			e.getValue().stream()
					.sorted((a, b) -> a[2] - b[2])
					.forEachOrdered(z -> z[3] = i.getAndIncrement());
		}

		for (int[] a : x) {
			out.printf("%06d%06d", a[1], a[3]);
			out.println();
		}
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] x = new int[m][4]; // [idx, P, Y, num]

		for (int i = 0; i < m; i++) {
			x[i] = new int[] { i, sc.nextInt(), sc.nextInt(), -1 };
		}

		solv(x);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
