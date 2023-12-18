// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int MD = 1000000007;
	int power(long a, int k) {
		long p = 1;
		while (k > 0) {
			if ((k & 1) == 1)
				p = p * a % MD;
			a = a * a % MD;
			k >>= 1;
		}
		return (int) p;
	}
	void main() {
		int m = sc.nextInt();
		int n = sc.nextInt();
		byte[] mobius = new byte[n + 1]; Arrays.fill(mobius, (byte) 2);
		mobius[1] = 1;
		for (int a = 2; a <= n; a++) {
			if (mobius[a] != 2)
				continue;
			for (int b = a; b <= n; b += a)
				if (mobius[b] == 2)
					mobius[b] = -1;
				else
					mobius[b] *= -1;
			if (a <= n / a) {
				int a2 = a * a;
				for (int b = a2; b <= n; b += a2)
					mobius[b] = 0;
			}
		}
		int[] kk = new int[n + 1];
		for (int a = 1, b = n; a <= n / a; a++) {
			kk[a] = power(n / a, m);
			int p = power(a, m);
			while (b > n / (a + 1))
				kk[b--] = p;
		}
		long ans = 0;
		for (int a = 1; a <= n; a++) {
			int k = 0;
			for (int b = 1; b <= n / a; b++)
				k = (k + kk[a * b] * mobius[b]) % MD;
			ans = (ans + (long) k * a) % MD;
		}
		if (ans < 0)
			ans += MD;
		println(ans);
	}
}
