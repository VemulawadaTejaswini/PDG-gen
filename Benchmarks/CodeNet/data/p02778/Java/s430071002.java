import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String S = sc.next();

		sc.close();

		for (int i = 0; i < S.length(); i++) {
			out.print("x");
		}
		out.println();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
