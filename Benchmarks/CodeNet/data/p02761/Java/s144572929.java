import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] a = new int[N + 1];
		Arrays.fill(a, -1);

		for (int i = 0; i < M; i++) {
			int s = sc.nextInt() - 1;
			int c = sc.nextInt();

			if (a[s] == -1 || a[s] == c) {
				a[s] = c;
			} else {
				out.println("-1");
				return;
			}
		}

		sc.close();

		for (int i = 0; i < N; i++) {
			if (a[i] == -1) {
				a[i] = 0;
			}
		}

		String ans = "";
		for (int i = 0; i < N; i++) {
			ans += a[i];
		}

		int x = Integer.parseInt(ans);
		if (N > 1 && ans.startsWith("0")) {
			out.println("-1");
			return;
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
