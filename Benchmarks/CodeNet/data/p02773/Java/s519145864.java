import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		String[] S = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}

		sc.close();

		HashMap<String, Integer> m = new HashMap<>();

		int max = 0;

		for (int i = 0; i < N; i++) {
			if (!m.containsKey(S[i])) {
				m.put(S[i], 1);
				max = Math.max(max, 1);
			} else {
				int x = m.get(S[i]);
				x++;
				max = Math.max(max, x);
				m.put(S[i], x);
			}
		}

		List<String> result = new ArrayList<>();

		for (Entry<String, Integer> e : m.entrySet()) {
			if (e.getValue() == max) {
				result.add(e.getKey());
			}
		}

		result.sort(Comparator.naturalOrder());

		for (String s : result) {
			out.println(s);
		}
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
