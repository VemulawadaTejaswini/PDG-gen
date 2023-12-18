import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int X = sc.nextInt();

		boolean[] p = new boolean[100003 + 1];
		Arrays.fill(p, true);

		sc.close();

		p[0] = false;
		p[1] = false;
		for (int i = 2; i <= Math.sqrt(100004); i++) {
			if (p[i] == true) {
				for (int j = i * 2; j < p.length; j += i) {
					p[j] = false;
				}
			}
		}

		int ans = 0;
		for (int i = X; i < p.length; i++) {
			if (p[i]) {
				ans = i;
				break;
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
