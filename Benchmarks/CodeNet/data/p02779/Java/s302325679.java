import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		Set<String > set  = new HashSet<>();
		for (int i = 0; i < N; i++) {
			set.add(sc.next());
		}
		System.out.println(set.size() == N ? "YES" : "NO");
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}