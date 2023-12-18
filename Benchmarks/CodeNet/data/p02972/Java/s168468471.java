import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] a = nextIntArray1origin(sc, N);

		sc.close();

		int[] ans = new int[N + 1];

		for (int i = N; i > 0; i--) {

			int x = a[i];
			for (int j = i+i; j <= N; j += i) {
				x ^= ans[j];
			}
			ans[i] = x;
		}

		List<String> res = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			if (ans[i] == 1) {
				res.add(String.valueOf(i));
			}
		}

		out.println(res.size());
		if (res.size() != 0) {
			out.println(String.join(" ", res));
		}
	}

	public static void main(String[] args) {
		new Main()._main(args);
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
