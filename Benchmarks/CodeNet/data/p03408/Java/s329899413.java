import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		String[] s = new String[N];
		for (int i = 0; i < N; i++) {
			s[i] = sc.next();
		}

		int M = sc.nextInt();
		String[] t = new String[M];
		for (int i = 0; i < M; i++) {
			t[i] = sc.next();
		}

		sc.close();

		Map<String, Long> ss = Arrays.stream(s)
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));

		Map<String, Long> tt = Arrays.stream(t)
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));

		Set<String> keys = new HashSet<>();
		keys.addAll(ss.keySet());
		keys.addAll(tt.keySet());

		int ans = 0;

		for (String k : keys) {
			Long sv = ss.get(k);
			if (sv == null)
				sv = 0L;
			Long tv = tt.get(k);
			if (tv == null)
				tv = 0L;

			ans = Math.max(ans, (int) (sv - tv));

		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
