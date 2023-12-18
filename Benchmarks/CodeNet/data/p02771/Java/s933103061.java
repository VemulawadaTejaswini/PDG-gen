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
		int C = sc.nextInt();

		sc.close();

		if (A == B && A != C || A == C && A != B || A != B && B == C) {
			out.println("Yes");
		} else {
			out.println("No");
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
