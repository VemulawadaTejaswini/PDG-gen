import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray(sc, N);

		sc.close();

		boolean[] checked = new boolean[N];
		int ans = 0;
		// Aを先頭から
		for (int i = 0; i < N; i++) {
			if (checked[i]) {
				continue;
			}
			checked[i] = true;
			int m = A[i];
			ans++;
			for (int j = i + 1; j < N; j++) {
				if (!checked[j] && m < A[j]) {
					m = A[j];
					checked[j] = true;
				}
			}
		}

		out.println(ans);

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
