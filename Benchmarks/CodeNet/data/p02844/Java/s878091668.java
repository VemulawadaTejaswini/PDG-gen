import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	boolean f(String s, char a, char b, char c) {
		int idx = s.indexOf(a);
		if (idx == -1) {
			return false;
		}

		idx = s.indexOf(b, idx + 1);
		if (idx == -1) {
			return false;
		}

		idx = s.indexOf(c, idx + 1);
		if (idx == -1) {
			return false;
		}

		return true;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		String S = sc.next();

		sc.close();

		int ans = 0;
		for (int x = 0; x <= 999; x++) {
			if (f(S, (char) (x / 100 + '0'), (char) ((x / 10) % 10 + '0'), (char) ((x % 10) + '0'))) {
				ans++;
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
