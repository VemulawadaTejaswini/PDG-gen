import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
		ArrayList<String> inLines = new ArrayList<String>();
		for (; cin.hasNext();) {
			inLines.add(cin.nextLine());
		}
		Solver solver = new Solver();
		solver.solve(inLines);
	}
}

class Solver {

	public void solve(ArrayList<String> inLines) {
		final int mod = 1000000007;
		int N = Integer.parseInt(inLines.get(0));
		int[] arr = new int[N + 1];
		for (int i = 2; i <= N; i++)
			arr[i] = i;

		long ans = 1;
		for (int i = 2; i <= N; i++) {
			if (arr[i] == i) {
				int cnt = 1;
				for (int j = i + 1; j <= N; j++) {
					for (; arr[j] % i == 0; arr[j] /= i) {
						cnt++;
					}
				}
				ans = (ans * (cnt + 1)) % mod;
				// System.out.println(ans);
			}
		}
		System.out.println(ans);
	}
}
