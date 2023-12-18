import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		int[] V = new int[N];

		for (int i = 0; i < N; i++) {
			V[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			int c = sc.nextInt();
			if (V[i] - c > 0) {
				ans += V[i] - c;
			}
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
