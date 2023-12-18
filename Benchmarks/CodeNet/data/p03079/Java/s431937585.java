import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a == b && b==c) {
			out.println("Yes");

		}else {
			out.println("No");
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
