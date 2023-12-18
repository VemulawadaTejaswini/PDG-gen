import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		String S = sc.next();

		Map<String, String> map = new HashMap<>();
		char[] chars = S.toCharArray();
		for (int i = 0; i < chars.length - 2; i++) {
			for (int j = i +1; j < chars.length - 1; j++) {
				map.putIfAbsent(String.valueOf(new char[]{chars[i], chars[j]}), S.substring(j + 1));
			}
		}
		System.out.println(map.values().stream().mapToLong(s -> s.chars().distinct().count()).sum());
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}