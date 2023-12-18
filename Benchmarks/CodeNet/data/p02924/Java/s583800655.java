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
		N--;
		out.println((1 + N) * N / 2);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
