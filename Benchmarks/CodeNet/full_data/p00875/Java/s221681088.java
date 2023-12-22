import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static String end;
	static int ans = 0;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());

			if (n == 0)
				break;

			ans = Integer.MAX_VALUE;

			String a[] = new String[n];
			String b[] = new String[n];

			for (int i = 0; i < n; i++) {
				String str[] = br.readLine().split(" ");

				a[i] = str[0];
				b[i] = str[1];
			}

			String start = br.readLine();
			end = br.readLine();

			dfs(n, a, b, start, 0);

			if (ans == Integer.MAX_VALUE)
				System.out.println("-1");
			else
				System.out.println(ans);
		}
	}

	static void dfs(int n, String a[], String b[], String str, int count) {
		if (str.length() > end.length() || str.length() > 10) {
			return;
		}

		if (str.equals(end)) {
			ans = Math.min(ans, count);
			return;
		}

		for (int i = 0; i < n; i++) {
			String res = str.replace(a[i], b[i]);

			if (!str.equals(res))
				dfs(n, a, b, res, count + 1);
		}
	}
}

