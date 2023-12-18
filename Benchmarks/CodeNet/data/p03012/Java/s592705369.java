import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] W = new int[N];

		for (int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
		}

		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < N - 1; i++) {
			int s1 = 0;
			int s2 = 0;

			for (int j = 0; j <= i; j++) {
				s1 += W[j];
			}

			for (int j = i + 1; j < N; j++) {
				s2 += W[j];
			}

			int a = Math.abs(s1 - s2);

			ans = Math.min(ans, a);
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
