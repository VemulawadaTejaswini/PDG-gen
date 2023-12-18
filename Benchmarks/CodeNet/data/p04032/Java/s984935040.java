
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Solver s = new Solver();

		System.out.println(s.solve(br.readLine()));
	}

}

class Solver {

	String solve(String s) {
		for (int length = 2; length <= 3; length++) {
			for (int i = 0; i < s.length() + 1 - length; i++) {
				if (s.charAt(i) == s.charAt(i + length - 1)) {
					return "" + (i+1) + " " + (i + length);
				}
			}

		}
		return "-1 -1";
	}

}