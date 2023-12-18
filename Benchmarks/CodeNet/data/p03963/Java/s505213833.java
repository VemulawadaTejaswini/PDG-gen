import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		Solver sol = new Solver();
		System.out.println(sol.solve(n, k));
	}

}

class Solver {

	long solve(int n, int k) {

		return (long) (Math.pow((k - 1), (n - 1)) * k);

	}

}
