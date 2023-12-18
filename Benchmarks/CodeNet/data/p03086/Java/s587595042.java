import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static void exec(Scanner in, PrintStream out) {
		String S = in.next();
		Set<Character> acgt = new HashSet<>(Arrays.asList('A', 'C', 'G', 'T'));
		int max = 0;
		int length = 0;
		for (int i = 0; i < S.length(); i += 1) {
			char c = S.charAt(i);
			if (acgt.contains(c)) {
				length += 1;
			} else {
				max = Math.max(max, length);
				length = 0;
			}
		}
		out.println(max);
	}

	public static void main(String[] args) {
		exec(new Scanner(System.in), System.out);
	}

}
