import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		long startTime = System.currentTimeMillis();
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N];
		int[] cnt = new int[2001];
		int[] cnt2 = new int[2001];
		for (int i = 0; i < N; ++i) {
			L[i] = sc.nextInt();
			cnt[L[i]]++;
		}
		for (int i = 1; i < cnt.length; ++i) {
			cnt[i] += cnt[i - 1];
		}
		long ans = 0;
		Arrays.sort(L);
		for (int i = 0; i < N; ++i) {
			cnt2[L[i]]++;
			for (int j = 0; j < i; ++j) {
				int add = cnt[L[i] + L[j] - 1] - cnt[L[i] - 1] - cnt2[L[i]];
				ans += add;
			}
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}