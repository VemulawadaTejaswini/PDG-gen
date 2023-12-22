import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int[] times = new int[N];
			int[] L = new int[N];
			for (int i = 0; i < N; ++i) {
				int M = sc.nextInt();
				L[i] = sc.nextInt();
				for (int j = 0; j < M; ++j) {
					int S = sc.nextInt();
					int E = sc.nextInt();
					for (int k = S; k < E; ++k) {
						times[i] |= (1 << k);
					}
				}
			}
			int ans = 0;
			for (int i = 1; i < (1 << N); ++i) {
				int acc = 0;
				int sum = 0;
				boolean ok = true;
				for (int j = 0; j < N; ++j) {
					if ((i & (1 << j)) == 0) {
						continue;
					}
					if ((acc & times[j]) != 0) {
						ok = false;
						break;
					}
					acc |= times[j];
					sum += L[j];
				}
				if (ok) {
					ans = Math.max(ans, sum);
				}
			}
			System.out.println(ans);
		}
	}
}