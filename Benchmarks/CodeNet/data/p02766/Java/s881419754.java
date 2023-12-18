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
		int K = sc.nextInt();

		sc.close();

		String s = Integer.toString(N, K);
		out.println(s.length());

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
