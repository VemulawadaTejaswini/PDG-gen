import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] cases = new int[M];
		int[] expects = new int[M];

		for (int i = 0; i < M; i++) {
			int k = Integer.parseInt(sc.next());
			for (int j = 0; j < k; j++) {
				int n = Integer.parseInt(sc.next()) - 1;
				cases[i] += 1 << n;
			}
		}

		for (int i = 0; i < M; i++) {
			expects[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < 1 << N; i++) {
			boolean ok = true;
			for (int j = 0; j < M; j++) {
				if (Integer.bitCount(cases[j] & i) % 2 != expects[j]) {
					ok = false;
					break;
				}
			}
			if (ok) {
				ans++;
			}
		}

		System.out.println(ans);

	}

}