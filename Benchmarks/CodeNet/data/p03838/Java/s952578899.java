import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long x = sc.nextLong();
		long y = sc.nextLong();

		sc.close();

		if (y > x) {
			out.println(y - x);
		} else if (Math.abs(y) == Math.abs(x)) {
			out.println(1);
		} else if (Math.signum(y) != Math.signum(x)) {
			out.println(1 + (-y - x));
		} else {
			out.println(2 + (x - y));
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
