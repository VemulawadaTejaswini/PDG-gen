import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		prob(System.in, System.out);
	}

	public static void prob(InputStream in, PrintStream out) {
		Scanner sc = new Scanner(in);
		int k = Integer.valueOf(sc.nextLine());
		String s = sc.nextLine();
		
		if (s.length() <= k) {
			out.println(s);
		} else {
			out.println(s.substring(0, k) + "...");
		}
	}
}