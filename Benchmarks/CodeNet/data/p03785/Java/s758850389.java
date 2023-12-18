import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long C = sc.nextLong();
		long K = sc.nextLong();
		long[] T = new long[N];
		for (int i = 0; i < N; ++i) {
			T[i] = sc.nextLong();
		}
		Arrays.sort(T);

		int ans = 0;
		for (int i = 0; i < N; ++i) {
			long departTime = T[i];
			long cnt = 1;
			while (i + 1 < N && cnt < C && departTime + K >= T[i + 1]) {
				++i;
				++cnt;
			}
			++ans;
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
