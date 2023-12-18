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
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int ans = Integer.MAX_VALUE;

		for (int ab = 0; ab <= Math.max(X * 2, Y * 2); ab++) {
			int a = Math.max(0, X - (ab / 2));
			int b = Math.max(0, Y - (ab / 2));
			ans = Math.min(ans, a * A + b * B + ab * C);
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
