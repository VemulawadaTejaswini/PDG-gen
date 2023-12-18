import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		String S = sc.next();
		char[] chars = S.toCharArray();
		int count = 0;
		int streak = 0;
		for (int i = chars.length - 1; i >= 0; i--) {
			int d = chars[i] - '0';
			if (d > 5){
				if (streak == 0){
					streak = 10 - d;
				} else {
					streak = 9 - d;
				}
			} else {
				if (streak > 0) {
					count += streak + d + 1;
				}else {
					count += d;
				}
				streak = 0;
			}
		}
		System.out.println(count);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}