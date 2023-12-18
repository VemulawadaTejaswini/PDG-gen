import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Robot{
	final int pos;
	final int length;

	Robot(int pos, int length){
		this.pos = pos;
		this.length = length;
	}

	int max(){
		return pos + length;
	}

	int min(){
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

		Arrays.sort(robots, Comparator.comparingInt(Robot::min));
		int remove = search(robots, 0, robots.length);
		System.out.println(N - remove);
	}

	int search(Robot[] robots, int from, int to) {
		if (to - from<= 1)
			return 0;
		Robot first = robots[from];
		Robot second = robots[from + 1];
		if (first.max() <= second.min())
			return search(robots, from + 1, to);
		if (to - from <= 2)
			return 1;
		Robot third = robots[from + 2];
		if (first.max() <= third.min())
			return search(robots, from + 1, to) + (second.max() <= third.min() ? 1 : 0);
		return search(robots, from + 2, to) + 1;
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}