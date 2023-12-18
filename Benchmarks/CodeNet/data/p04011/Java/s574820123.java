import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		Solver s = new Solver();
		System.out.println(s.solve(n, k, x, y));
	}

}

class Solver {

	int solve(int n, int k, int x, int y) {

		if (n <= k) {
			return n * x;
		} else {
			return k * x + (n - k) * y;
		}

	}

}
