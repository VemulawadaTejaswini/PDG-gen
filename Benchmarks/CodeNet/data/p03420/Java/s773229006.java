import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long ans = 0;
		for (long b = K + 1; b <= N; ++b) {
			for (long r = K; r <= b - 1; ++r) {
				ans += (r > 0 ? 1 : 0) + (N - r) / b;
			}
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
