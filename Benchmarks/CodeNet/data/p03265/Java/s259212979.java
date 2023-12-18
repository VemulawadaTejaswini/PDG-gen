import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int a = x2 - x1;
		int b = y2 - y1;

		int x3 = x2 - b;
		int y3 = y2 + a;
		int x4 = x1 - b;
		int y4 = y1 + a;

		out.println(x3 + " " + y3 + " " + x4 + " " + y4);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
