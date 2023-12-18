import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	double d(int a, int b) {
		return Math.sqrt(Math.pow(x[a] - x[b], 2) + Math.pow(y[a] - y[b], 2));
	}

	int N;
	int[] x, y;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		x = new int[N];
		y = new int[N];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		sc.close();

		double ans = Double.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				ans = Math.max(ans, d(i, j));
			}
		}

		out.println(ans / 2);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
