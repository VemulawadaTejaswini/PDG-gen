import java.util.BitSet;
import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		BitSet A = new BitSet();
		int max = 0;
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			A.set(a);
			max = Math.max(a, max);
		}
		if (max < K) {
			System.out.println("IMPOSSIBLE");
			return;
		}
		if (A.get(K)) {
			System.out.println("POSSIBLE");
			return;
		}
		int i = A.nextSetBit(0);
		int gcd = i;
		i = A.nextSetBit(i + 1);
		for (; i >= 0; i = A.nextSetBit(i + 1)) {
			gcd = gcd(gcd, i);
			if (gcd == 1) {
				System.out.println("POSSIBLE");
				return;
			}

			if (i == Integer.MAX_VALUE) {
				break;
			}
		}
		System.out.println(K % gcd == 0 ? "POSSIBLE" : "IMPOSSIBLE");
	}

	int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}