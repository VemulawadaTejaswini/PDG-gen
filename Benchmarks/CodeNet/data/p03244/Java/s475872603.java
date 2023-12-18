import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = Integer.parseInt(sc.next());
		int[] odd = new int[10000];
		int[] even = new int[10000];
		for (int i = 0; i < N; i++) {
			if ((i & 1) == 1) {
				even[Integer.parseInt(sc.next()) - 1] += 1;
			} else {
				odd[Integer.parseInt(sc.next()) - 1] += 1;
			}
		}
		int om, on, em, en;
		om = on = em = en = 0;
		int omi, emi;
		omi = emi = -1;
		for (int i = 0; i < 10000; i++) {
			if (odd[i] > om) {
				om = odd[i];
				omi = i;
			} else if (odd[i] > on) {
				on = odd[i];
			}
			if (even[i] > em) {
				em = even[i];
				emi = i;
			} else if (even[i] > en) {
				en = even[i];
			}
		}
		if (omi == emi) {
			System.out.println(N - Math.max(om + en, on + em));
		} else {
			System.out.println(N - (om + em));
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