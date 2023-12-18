import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String S = sc.next();

		sc.close();

		int ans = 0;

		for (int i = 0; i < S.length() / 2; i++) {
			if (S.charAt(i) != S.charAt(S.length() - i - 1)) {
				ans++;
			}
		}
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
