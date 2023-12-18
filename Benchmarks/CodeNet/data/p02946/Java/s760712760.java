import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int K = sc.nextInt();
		int X = sc.nextInt();

		sc.close();

		int xMin = X - (K - 1);
		int xMax = X + (K - 1);

		for (int i = xMin; i <= xMax; i++) {
			if (i != xMin) {
				out.print(" ");
			}
			out.print(i);
		}
		out.println();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
