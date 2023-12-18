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
		long[] f = new long[N];
		Arrays.fill(f, N);
		for (int i = 0; i < N; ++i) {
			int idx = -Arrays.binarySearch(f, P[i]);
			f[idx - 1] = P[i];
		}
		int cnt = 0;
		for (int i = 0; i < N; ++i) {
			if (f[i] < N) {
				cnt = i;
			}
		}
		int ans = N - cnt;
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
