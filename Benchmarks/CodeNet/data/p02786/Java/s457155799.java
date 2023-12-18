import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	long f(long x) {
		if (x == 0) {
			return 0;
		}
		return 1 + f(x / 2) * 2;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long H = sc.nextLong();

		sc.close();

		out.println(f(H));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
