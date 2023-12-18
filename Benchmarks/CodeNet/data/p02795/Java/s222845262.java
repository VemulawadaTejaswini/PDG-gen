import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();

		sc.close();

		int a = Math.max(H, W);

		int ans = (N + (a - 1)) / a;

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
