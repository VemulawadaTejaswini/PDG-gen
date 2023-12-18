import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		main.solve(sc);
		sc.close();
	}

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String s = sc.next();
		String[] M = new String[N];
		int[] G = new int[N];

		for (int i = 0; i < N; i++) {
			M[i] = Character.toString(s.charAt(i));
			G[i] = 1;
		}

		for (int i = 0; i < Q; i++) {
			String ABC = sc.next();
			String LR = sc.next();

			for (int k = 0; k < N; k++) {
				if (M[k].equals(ABC)) {
					if (G[k] == 0) {
						continue;
					}
					if (LR.equals("L")) {
						if (k == 0) {
							G[k] = 0;
						} else {
							G[k - 1] += G[k];
							G[k] = 0;
						}
					} else {
						if (k == N - 1) {
							G[k] = 0;
						} else {
							G[k + 1] += G[k];
							G[k] = 0;
						}
					}
				} else {
					continue;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += G[i];
		}
		System.out.println(sum);

	}
}
