import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out);) {
			char[] s = scan.next().toCharArray();

			Set<Character> set = new HashSet<Character>();
			for (int i = 0; i < s.length; i++) {
				set.add(s[i]);
			}

			out.println(set.size() == 1 ? "No" : "Yes");
			out.flush();
		}
	}
}
