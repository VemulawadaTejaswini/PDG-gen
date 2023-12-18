import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		long m = 1000000007;
		PrintWriter pw = new PrintWriter(System.out);
		long a = n - k + 1;
		long b = k;
		long val1 = a;
		long val2 = 1;
		long ans = val1;
		pw.println(ans);

		for (int i = 2; i <= k; i++) {
			val1 = val1 * (a - i + 1) % m;
			val1 = val1 * modinv(i, m) % m;
			val2 = val2 * (b - i + 1) % m;
			val2 = val2 * modinv(i - 1, m) % m;
			if (val2 == 0) val2 = 1;
			ans = val1 * val2 % m;
			pw.println(ans);
		}
		pw.flush();
	}

	static long modinv(long a, long m) {
		long b = m;
		long u = 1;
		long v = 0;
		long tmp = 0;

		while (b > 0) {
			long t = a / b;
			a -= t * b;
			tmp = a;
			a = b;
			b = tmp;

			u -= t * v;
			tmp = u;
			u = v;
			v = tmp;
		}

		u %= m;
		if (u < 0) u += m;
		return u;
	}
}
