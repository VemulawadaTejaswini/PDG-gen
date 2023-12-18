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

		sc.close();

		for (int X = 1; X <= 50000; X++) {
			if ((int) (X * 1.08) == N) {
				out.println(X);
				return;
			}
		}
		out.println(":(");

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
