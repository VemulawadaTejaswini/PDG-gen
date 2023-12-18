import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static final void solve() {
		try (Scanner cin = new Scanner(System.in)) {

			int N = cin.nextInt();
			int M = cin.nextInt();
			int[] b = new int[M];

			int[] a2 = new int[M];

			int a_;
			int b_;
			int index = 0;
			int index2 = 0;

			for (int i = 0; i < M; i++) {
				a_ = cin.nextInt();
				b_ = cin.nextInt();
				if (a_ == 1) {
					b[index] = b_;
					index++;
				} else if (b_ == N) {
					a2[index2] = a_;
					index2++;
				}
			}

			for (int i = 0; i < index; i++) {
				b_ = b[i];
				for (int j = 0; j < index2; j++) {
					if (b_ == a2[j]) {
						System.out.println("POSSIBLE");
						return;
					}
				}

			}
			System.out.println("IMPOSSIBLE");

		} finally {
		}
	}
}
