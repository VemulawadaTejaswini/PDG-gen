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
		int X = sc.nextInt() - 1;
		int Y = sc.nextInt() - 1;

		sc.close();

		int[] ans = new int[N];

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int d;
				d = j - i;
				d = Math.min(d, Math.abs(X - i) + Math.abs(Y - j) + 1);

				ans[d]++;
			}
		}

		for (int i = 1; i <= N - 1; i++) {
			out.println(ans[i]);
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
