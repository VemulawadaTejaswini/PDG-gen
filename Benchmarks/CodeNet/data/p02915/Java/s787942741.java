import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		sc.close();

		out.println(N * N * N);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
