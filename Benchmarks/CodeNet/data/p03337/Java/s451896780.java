import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		sc.close();

		int add = A + B;
		int sub = A - B;
		int mul = A * B;

		out.println(Math.max(Math.max(add, sub), mul));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
