import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();

		sc.close();

		int tmp = X;
		X = Y;
		Y = tmp;

		tmp = X;
		X = Z;
		Z = tmp;

		out.println(X + " " + Y + " " + Z);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
