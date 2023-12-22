import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	static int dp[][] = new int[(1 << 21) + 1][21];
	static int dist[][] = new int[21][21];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		long k = Long.parseLong(str[2]);

		long a[] = new long[n];
		long b[] = new long[m];

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}
		str = br.readLine().split(" ");
		for (int i = 0; i < m; i++) {
			b[i] = Long.parseLong(str[i]);
		}

		ArrayList<Long> s1 = new ArrayList<>();
		ArrayList<Long> s2 = new ArrayList<>();

		s1.add(a[0]);
		s2.add(b[0]);

		for (int i = 0; i < n - 1; i++) {
			s1.add(s1.get(i) + a[i + 1]);
		}
		for (int i = 0; i < m - 1; i++) {
			s2.add(s2.get(i) + b[i + 1]);
		}

		int ak = ~Collections.binarySearch(s1, k, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
		int bk = ~Collections.binarySearch(s2, k, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);

		if (ak == 0 && bk == 0) {
			System.out.println("0");
			return;
		}

		int bbk = ~Collections.binarySearch(s2, k - s1.get(ak - 1), (x, y) -> x.compareTo(y) > 0 ? 1 : -1);
		int aak = ~Collections.binarySearch(s1, k - s2.get(bk - 1), (x, y) -> x.compareTo(y) > 0 ? 1 : -1);

		int ans = Math.max(aak + bk, ak + bbk);
		System.out.println(ans);
	}
}
