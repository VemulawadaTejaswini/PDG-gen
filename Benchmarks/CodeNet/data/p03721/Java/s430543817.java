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
		long K = sc.nextLong();

		int[][] AB = new int[N][2];
		for (int i = 0; i < N; i++) {
			AB[i] = new int[] { sc.nextInt(), sc.nextInt() };
		}

		sc.close();

		Arrays.sort(AB, (a, b) -> Integer.compare(a[0], b[0]));

		int idx = 0;
		long sum = 0;
		while ((sum += AB[idx][1]) < K) {
			idx++;
		}

		out.println(AB[idx][0]);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
