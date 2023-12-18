import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		String S = sc.next();
		String T = sc.next();

		sc.close();

		long L = lcm(N, M);

		Map<Long, Character> X = new HashMap<>();

		for (int i = 0; i < N; i++) {
			X.put((i * (L / N)), S.charAt(i));
		}

		long ans = L;
		for (int i = 0; i < M; i++) {
			Character c = X.get(i * (L / M));
			if (c != null && c != T.charAt(i)) {
				ans = -1;
				break;
			}
		}

		out.println(ans);

	}

	// 最大公約数
	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	// 最小公倍数
	private static long lcm(long a, long b) {
		return (a / gcd(a, b)) * b; // a*bがオーバーフローしないように
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
