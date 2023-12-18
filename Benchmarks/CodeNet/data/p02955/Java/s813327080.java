import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		int sum = 0;
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		int ans = 1;
		for (int i = 1; i <= sum; ++i) {
			if (sum % i != 0)
				continue;
			int[] B = new int[N];
			for (int j = 0; j < N; ++j)
				B[j] = A[j] % i;
			Arrays.sort(B);
			int s = 0;
			while (s < B.length && B[s] == 0)
				++s;
			if (s == B.length) {
				ans = Math.max(ans, i);
				continue;
			}
			int t = B.length - 1;
			int cnt = 0;
			while (s < t && cnt <= K) {
				int sub = Math.min(i - B[t] % i, B[s]);
				B[t] += sub;
				B[s] -= sub;
				cnt += sub;
				B[t] %= i;
				B[s] %= i;
				if (B[t] == 0)
					--t;
				if (B[s] == 0)
					++s;
			}
			if (cnt <= K)
				ans = Math.max(ans, i);
		}
		PrintWriter pw = new PrintWriter(System.out);
		pw.println(ans);
		pw.close();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}