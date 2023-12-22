import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int[] A = nextIntArray(sc, n);
		int q = sc.nextInt();
		int[] m = nextIntArray(sc, q);

		sc.close();

		Set<Long> s = new HashSet<>();

		for (int bit = 0; bit < (1 << n); bit++) {
			long sum = 0;
			for (int i = 0; i < n; i++) {
				if (((bit >> i) & 1) == 1) {
					sum += A[i];
				}
			}
			s.add(sum);
		}

		for (int i = 0; i < q; i++) {
			if (s.contains((long) m[i])) {
				out.println("yes");
			} else {
				out.println("no");
			}
		}

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
}

