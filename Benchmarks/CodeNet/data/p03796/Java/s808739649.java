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
		long mod = 1000000007;
		long N = Integer.parseInt(inLines.get(0));
		long ans = 1;
		for (int i = 1; i <= N; i++) {
			ans = (ans * i) % mod;
		}
		System.out.println(ans);
	}
}
