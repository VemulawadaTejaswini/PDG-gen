import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int n = sc.nextInt();
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				b[(n + i) / 2] = sc.nextInt();
			} else {
				b[(n - i - 1) / 2] = sc.nextInt();
			}
		}
		if (n % 2 == 0){
			System.out.println(Arrays.stream(b).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
		} else {
			StringJoiner joiner = new StringJoiner(" ");
			for (int i = b.length - 1; i >= 0; i--) {
				joiner.add(String.valueOf(b[i]));
			}
			System.out.println(joiner);
		}
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}