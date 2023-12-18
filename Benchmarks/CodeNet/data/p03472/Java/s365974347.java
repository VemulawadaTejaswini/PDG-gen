import java.util.Arrays;
import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = Integer.parseInt(sc.next());
		int H = Integer.parseInt(sc.next());
		int[] spcs = new int[N];
		int maxAtk = 0;
		for (int i = 0; i < N; i++) {
			maxAtk = Math.max(maxAtk, Integer.parseInt(sc.next()));
			spcs[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(spcs);
		int l = -1;
		int r = spcs.length;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (spcs[mid] >= maxAtk) r = mid;
			else l = mid;
		}
		long sum = 0;
		int i = r;
		for (; i < N && sum < H; i++) {
			sum += spcs[i];
		}
		System.out.println((i - r) + -Math.floorDiv(-Math.max(H - sum, 0), maxAtk));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}