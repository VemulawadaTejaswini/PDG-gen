import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		try (Scanner cin = new Scanner(System.in)) {

			int N = cin.nextInt();
			int[] d = new int[N];

			for (int i = 0; i < N; i++) {
				d[i] = cin.nextInt();
			}

			int M = cin.nextInt();
			int[] t = new int[M];

			for (int i = 0; i < M; i++) {
				t[i] = cin.nextInt();
			}

			Arrays.sort(d);
			Arrays.sort(t);

			int index = 0;

			for (int ti : t) {
				int tmp = -1;
				for (int i = index; i < N; i++) {
					if (d[i] == ti) {
						tmp = i;
						break;
					}
				}
				if (tmp == -1) {
					System.out.println("NO");
					return;
				}
				index = tmp + 1;
			}
			System.out.println("YES");
		} finally {
		}
	}

}