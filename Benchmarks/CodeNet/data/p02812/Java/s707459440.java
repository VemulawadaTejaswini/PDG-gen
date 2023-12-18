import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		String S = sc.next();

		sc.close();

		int ans = 0;
		int idx = 0;

		while ((idx = S.indexOf("ABC", idx)) != -1) {
			ans++;
			idx++;
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
