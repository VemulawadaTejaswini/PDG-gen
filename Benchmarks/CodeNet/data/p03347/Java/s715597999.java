import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	ArrayList<Integer>[] g;

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
		}
		long ans = 0;
		for (int i = 0; i < N; ++i) {
			if ((i == 0 && A[0] != 0) || (i > 0 && A[i] - A[i - 1] > 1)) {
				System.out.println(-1);
				return;
			}
		}
		for (int i = 1; i < N; ++i) {
			if (i == N - 1 || A[i + 1] != A[i] + 1) {
				ans += A[i];
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
