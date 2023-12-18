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

		int ans = Math.abs(A - B);

		if (ans % 2 == 0) {
			out.println(Math.max(A, B) - ans / 2);
		} else {
			out.println("IMPOSSIBLE");
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
