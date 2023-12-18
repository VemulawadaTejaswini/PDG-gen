import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		long N = sc.nextLong();
		long P = sc.nextLong();
		if (N == 1){
			System.out.println(P);
			return;
		}
		long temp = P;
		long mul = 1;
		for (long i = 2; i*i <= P; i++) {
			int counter = 0;
			while (temp % i == 0){
				temp /= i;
				counter++;
			}
			if (counter >= N){
				mul *= i * (counter / N);
			}
		}
		System.out.println(mul);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}