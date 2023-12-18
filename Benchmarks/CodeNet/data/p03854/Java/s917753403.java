import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public final class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		System.out.println(new Solver().solve(in));
	}
}

class Solver {

	String solve(String in) {
		HashMap<String, Boolean> m = new HashMap<String, Boolean>();
		m.put("d5m", true);
		m.put("d7r", true);
		m.put("e5e", true);
		m.put("e6r", true);
		int i;
		for (i = 0; i < in.length() - 4;) {
			if (i + 4 < in.length() && m.containsKey(in.charAt(i) + "5" + in.charAt((i + 4)))) {
				if (i + 6 < in.length() && m.containsKey(in.charAt(i) + "7" + in.charAt((i + 6)))) {
					if (i + 9 < in.length() && m.containsKey(in.charAt(i + 5) + "5" + in.charAt((i + 9)))) {
						i += 5;
					} else {
						i += 7;
					}
				} else if (i + 5 < in.length() && m.containsKey(in.charAt(i) + "6" + in.charAt((i + 5)))) {
					i += 6;
				} else {
					i += 5;
				}
			} else {
				return "NO";
			}

		}
		return i >= in.length() ? "YES" : "NO";

	}
}
