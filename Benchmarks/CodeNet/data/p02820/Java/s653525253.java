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
		int K = sc.nextInt();

		int R = sc.nextInt();
		int S = sc.nextInt();
		int P = sc.nextInt();

		String T = sc.next();
		char[] t = T.toCharArray();

		sc.close();

		char[] a = new char[N];
		Arrays.fill(a, ' ');

		long ans = 0;
		for (int i = 0; i < N; i++) {
			switch (t[i]) {
			case 'r':
				if (i < K || a[i - K] != 'p') {
					ans += P;
					a[i] = 'p';
				}
				break;
			case 's':
				if (i < K || a[i - K] != 'r') {
					ans += R;
					a[i] = 'r';
				}
				break;
			case 'p':
				if (i < K || a[i - K] != 's') {
					ans += S;
					a[i] = 's';
				}
				break;
			}
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
