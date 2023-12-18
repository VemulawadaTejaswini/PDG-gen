import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int D = sc.nextInt();

		sc.close();

		int d = 2 * D + 1;

		out.println((N + d - 1) / d);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
