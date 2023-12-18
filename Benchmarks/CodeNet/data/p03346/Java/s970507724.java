import java.util.Arrays;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		for (int i = 0; i < N; ++i) {
			P[i] = sc.nextInt();
			--P[i];
		}
		long[] f = new long[N + 1];
		for (int i = 0; i < N; ++i) {
			f[P[i] + 1] = f[P[i]] + 1;
		}
		long ans = 0;
		for (int i = 0; i < N; ++i) {
			ans = Math.max(ans, f[i]);
		}
		ans = N - ans;
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
