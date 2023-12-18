import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long H = sc.nextInt();
		long W = sc.nextInt();

		sc.close();

		if (H == 1 || W == 1) {
			out.println(1);
			return;
		}

		out.println((H * W + 1) / 2);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
