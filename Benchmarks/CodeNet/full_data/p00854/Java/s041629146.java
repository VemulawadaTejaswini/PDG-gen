import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int K = sc.nextInt();
			int M = sc.nextInt();
			boolean[] removed = new boolean[N];
			int pos = M - 1;
			removed[pos] = true;
			for (int i = 0; i < N - 2; ++i) {
				int c = 0;
				while (c < K) {
					++pos;
					if (pos == N) pos = 0;
					if (!removed[pos]) {
						++c;
					}
				}
				removed[pos] = true;
			}
			for (int i = 0; i < N; ++i) {
				if (!removed[i]) {
					System.out.println(i + 1);
					break;
				}
			}
		}
	}

}