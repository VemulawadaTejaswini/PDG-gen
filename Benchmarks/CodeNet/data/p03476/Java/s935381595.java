import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int[] a = new int[100100];
		Arrays.fill(a, 1);
		a[0] = 0;
		a[1] = 0;

		for (int i = 2; i * i < a.length; i++) {
			for (int j = i * 2; j < a.length; j += i) {
				a[j] = 0;
			}
		}

		for (int i = a.length - 1; i >= 0; i--) {
			if (!(i % 2 == 1 && a[i] == 1 && a[(i + 1) / 2] == 1)) {
				a[i] = 0;
			}
		}

		for (int i = 1; i < a.length; i++) {
			a[i] += a[i - 1];
		}

		int Q = sc.nextInt();

		for (int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			out.println(a[r] - a[l - 1]);

		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
