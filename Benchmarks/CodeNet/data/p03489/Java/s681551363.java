
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		long ans = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (!map.containsKey(x))
				map.put(x, 1);
			else
				map.put(x, map.get(x) + 1);
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int val = entry.getValue();
			if (val >= key)
				ans += val - key;
			else
				ans += val;
		}
		System.out.println(ans);

	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}
	}
}
