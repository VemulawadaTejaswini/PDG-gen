import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		sc.close();

		int ans = 0;
		for (int i = 1; i <= N; i++) {
			String s = String.valueOf(i);
			if (s.length() % 2 == 1) {
				ans++;
			}
		}
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
