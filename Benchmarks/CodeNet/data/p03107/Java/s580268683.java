import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String s = sc.next();

		int n = 0;
		for (;;) {
			String ns = s.replaceAll("(01)|(10)", "");

			n += s.length() - ns.length();
			if (ns.length() == s.length()) {
				out.println(n);
				break;
			}

			s = ns;
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
