
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int R = scanner.nextInt();
		int L = scanner.nextInt();
		int[] P = new int[N];
		int[] T = new int[N];
		int PT = 0;
		int n1 = 0;
		for (int i = 0; i < R; i++) {
			int d = scanner.nextInt() - 1;
			int t = scanner.nextInt();
			int x = scanner.nextInt();
			P[d] += x;
			if (x > 0) {
				if (P[d] > P[n1] || (P[d] == P[n1] && n1 > d)) {
					T[n1] += t - PT + 1;
					PT = t;
					n1 = d;
				}
			}
			if (x < 0) {
				if (d != n1)
					continue;
				int n2 = n1, p2 = P[d];
				for (int j = N - 1; j >= 0; j--) {
					if (p2 <= P[j]) {
						n2 = j;
						p2 = P[j];
					}
				}
				if (n2 != n1) {
					T[n1] += t - PT + 1;
					PT = t;
					n1 = n2;
				}
			}
		}
		T[n1] += L - PT + 1;
		int ans_n = 0, ans_t = 0;
		for (int i = 0; i < N; i++) {
			if (ans_t < T[i]) {
				ans_t = T[i];
				ans_n = i;
			}
		}
		System.out.println(ans_n + 1);
	}
}