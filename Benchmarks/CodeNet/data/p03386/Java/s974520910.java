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
		int K = sc.nextInt();

		sc.close();

		for (int i = A; i <= B; i++) {
			if (i < A + K || i > B - K) {
				out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
