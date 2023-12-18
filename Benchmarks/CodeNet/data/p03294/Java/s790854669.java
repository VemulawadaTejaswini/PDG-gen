import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	private long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

	private long lcm(long[] a) {
		long ans = a[0];
		for (int i = 1; i < a.length; i++) {
			ans = lcm(ans, a[i]);
		}
		return ans;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		long[] a = new long[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		long l = lcm(a);

		l--;

		long z = 0;
		for (int i = 0; i < N; i++) {
			z += (l % a[i]);
		}
		out.println(z);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
