import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		sc.close();

		String aa = "";
		for (int i = 0; i < b; i++) {
			aa += String.valueOf(a);
		}

		String bb = "";
		for (int i = 0; i < a; i++) {
			bb += String.valueOf(b);
		}

		if (aa.compareTo(bb) < 0) {
			out.println(aa);
		} else {
			out.println(bb);
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
