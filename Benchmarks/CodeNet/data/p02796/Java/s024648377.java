import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Scanner;

class Robot {
	final int pos;
	final int length;

	Robot(int pos, int length) {
		this.pos = pos;
		this.length = length;
	}

	int max() {
		return pos + length;
	}

	int min() {
		return pos - length;
	}
}

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		Robot[] robots = new Robot[N];
		for (int i = 0; i < N; i++) {
			robots[i] = new Robot(sc.nextInt(), sc.nextInt());
		}

		Arrays.sort(robots, Comparator.comparingInt(Robot::max));
		BitSet remove = new BitSet(N);
		for (int i = 0; i < robots.length; i++) {
			int p = remove.previousClearBit(i - 1);
			if (p < 0) continue;
			Robot prev = robots[p];
			Robot target = robots[i];

			if (prev.max() <= target.min()) continue;
			remove.set(i);
		}
		System.out.println(N - remove.cardinality());
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}