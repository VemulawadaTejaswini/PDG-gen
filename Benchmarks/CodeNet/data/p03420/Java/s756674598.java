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
			if ((N - b + 1) / b * b + b > N - K) {
				ans += (N - b + 1) / b * (N - K - (N - b + 1) + 1);
			} else {
				long tmp = (N - b + 1) / b * b + b;
				ans += (N - b + 1) / b * (tmp - (N - b + 1));
				ans += ((N - b + 1) / b + 1) * (N - K - tmp + 1);
			}
			ans += b - K;
			if (K == 0)
				--ans;
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
