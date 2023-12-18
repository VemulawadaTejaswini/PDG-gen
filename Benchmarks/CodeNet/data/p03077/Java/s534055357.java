import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long n = sc.nextLong();
		long[] a = new long[5];
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextLong();
		}

		long min = Long.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			min = Math.min(min, a[i]);
		}

		long g = (long) Math.ceil((double) n / min);
		out.println(5 + g - 1);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
