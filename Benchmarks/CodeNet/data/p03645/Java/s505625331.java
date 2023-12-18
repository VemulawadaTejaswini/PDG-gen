import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static final void solve() {
		try (Scanner cin = new Scanner(System.in)) {

			int N = cin.nextInt();
			int M = cin.nextInt();
			int[] a = new int[M];
			int[] b = new int[M];

			int a_;
			int b_;
			int index = 0;
			for (int i = 0; i < M; i++) {
				a_ = cin.nextInt();
				b_ = cin.nextInt();
				if (a_ == 1 || b_ == N) {
					a[index] = a_;
					b[index] = b_;
					index++;
				}
			}

			for (int i = 0; i < index; i++) {
				if (b[i] == N) {
					for (int j = 0; j < index; j++) {
						if (a[j] == 1 && b[j] == a[i]) {
							System.out.println("POSSIBLE");
							return;
						}
					}

				}
			}
			System.out.println("IMPOSSIBLE");

		} finally {
		}
	}
}
