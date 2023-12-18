import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder a = new StringBuilder(br.readLine());
		StringBuilder b = new StringBuilder(br.readLine());
		StringBuilder c = new StringBuilder(br.readLine());
		Solver s = new Solver();
		System.out.println(s.solve(a, b, c));
	}

}

class Solver {

	String solve(StringBuilder a, StringBuilder b, StringBuilder c) {
		char t = 'a';
		while (true) {
			if (t == 'a') {
				if (a.length() == 0) {
					return "A";
				}
				t = a.charAt(0);
				a.deleteCharAt(0);
			} else if (t == 'b') {

				if (b.length() == 0) {
					return "B";
				}
				t = b.charAt(0);
				b.deleteCharAt(0);
			} else if (t == 'c') {

				if (c.length() == 0) {
					return "C";
				}
				t = c.charAt(0);
				c.deleteCharAt(0);
			}
		}

	}

}
