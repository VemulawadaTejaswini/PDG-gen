import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int X = sc.nextInt();
		sc.close();

		if (X == 3 || X == 5 || X == 7) {
			out.println("YES");
		} else {
			out.println("NO");
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
