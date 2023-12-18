import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String b = sc.next();

		switch(b) {
		case "A":
			out.println("T");
			break;
		case "T":
			out.println("A");
			break;
		case "C":
			out.println("G");
			break;
		case "G":
			out.println("C");
			break;
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
