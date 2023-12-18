import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		sc.close();

		for (int i = 1; i < 110000; i++) {
			if ((int) (i * 0.08) == A && (int) (i * 0.1) == B) {
				out.println(i);
				return;
			}
		}
		out.println(-1);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
