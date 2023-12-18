import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	static void exec(Scanner in, PrintStream out) {
		String b = in.next();
		if (b.equals("A")) {
			out.println("T");
		} else if (b.equals("C")) {
			out.println("G");
		} else if (b.equals("G")) {
			out.println("C");
		} else if (b.equals("T")) {
			out.println("A");
		}
	}

	public static void main(String[] args) {
		exec(new Scanner(System.in), System.out);
	}

}
