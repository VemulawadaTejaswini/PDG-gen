import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
		}
		int[] ans = new int[N];
		for (int i = N; i >= 1; --i) {
			int s = 0;
			for (int j = 2 * i; j <= N; j += i) {
				s ^= ans[j - 1] % 2;
			}
			ans[i - 1] = s ^ A[i - 1];
		}
		int cnt = 0;
		for (int v : ans) {
			cnt += v;
		}
		PrintWriter pw = new PrintWriter(System.out);
		pw.println(cnt);
		int p = 0;
		for (int i = 0; i < N; ++i) {
			if (ans[i] == 0)
				continue;
			pw.print((i + 1) + (p == cnt - 1 ? "\n" : " "));
			++p;
		}
		pw.close();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}