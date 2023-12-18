import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String S = sc.next();
		String T = sc.next();

		Set<List<Integer>> s = new HashSet<>();
		for (int i = 0; i < S.length(); i++) {
			int ss = S.charAt(i);
			int tt = T.charAt(i);

			if (ss != tt) {
				s.add(Arrays.asList(new Integer[] { Math.min(ss, tt), Math.max(ss, tt) }));
			}
		}

		if (s.size() % 2 == 0) {
			out.println("Yes");
		} else {
			out.println("No");
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
