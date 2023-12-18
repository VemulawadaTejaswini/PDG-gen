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
		String T = sc.next();

		sc.close();

		out.println(T + S);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
