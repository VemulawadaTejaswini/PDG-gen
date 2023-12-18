import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	static List<Long> list = new ArrayList<>();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		dfs(0, n);

		long ans = 0;

		for (long l : list) {
			String s = String.valueOf(l);
			if (s.contains("3") && s.contains("5") && s.contains("7")) {
				ans++;
			}
		}

		System.out.println(ans);
	}

	static void dfs(long x, int n) {
		if (x > n) {
			return;
		}
		if (x != 0) {
			list.add(x);
		}
		dfs(10 * x + 3, n);
		dfs(10 * x + 5, n);
		dfs(10 * x + 7, n);
	}
}
