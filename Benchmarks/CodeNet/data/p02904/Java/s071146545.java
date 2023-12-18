import java.util.Scanner;
import java.util.TreeSet;

import static java.lang.System.in;

public class Main {
	static Scanner sc = new Scanner(in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = Integer.parseInt(sc.next());
		}
		boolean[] unchange = new boolean[N];
		int prev = 0;
		int unc = 0;
		for (int i = 1; i < N; i++) {
			if (P[i - 1] >= P[i]) {
				for (int j = prev; j <= i - K; j++) {
					unchange[j] = true;
					unc++;
				}
				prev = i;
			}
		}
		for (int j = prev; j <= N - K; j++) {
			unchange[j] = true;
			unc++;
		}
		TreeSet<Integer> set = new TreeSet<>();
		int ans = N - K + 1;
		for (int i = 0; i < K; i++) {
			set.add(P[i]);
		}
		for (int i = K; i < N; i++) {
			if (set.first() == P[i - K] && set.last() < P[i]) {
				if (!unchange[i - K]) {
					System.err.println(i);
					ans--;
				}
			}
			set.remove(P[i - K]);
			set.add(P[i]);
		}
		if (unc > 0) {
			ans -= unc - 1;
		}
		System.out.println(ans);
	}
}
