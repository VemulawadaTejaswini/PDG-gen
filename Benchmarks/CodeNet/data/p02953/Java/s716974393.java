import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] H = new long[N];
		for (int i = 0; i < N; ++i)
			H[i] = sc.nextLong();
		boolean ans = true;
		for (int i = 0; i < N; ++i) {
			if (i == 0 || H[i - 1] <= H[i] - 1)
				--H[i];
			ans &= i == 0 || H[i - 1] <= H[i];
		}
		System.out.println(ans ? "Yes" : "No");
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}