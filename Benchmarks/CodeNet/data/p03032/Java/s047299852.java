import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");
		long v[] = new long[n];

		for (int i = 0; i < n; i++) {
			v[i] = Long.parseLong(str[i]);
		}

		long ans = 0;
		for (int i = 0; i <= Math.min(n, k); i++) {
			for (int j = 0; i + j <= Math.min(n, k); j++) {
				ArrayList<Long> list = new ArrayList<>();

				long cur = 0;
				for (int h = 0; h < i; h++) {
					list.add(v[h]);
					cur += v[h];
				}
				for (int h = 0; h < j; h++) {
					list.add(v[n - 1 - h]);
					cur += v[n - 1 - h];
				}

				Collections.sort(list);

				for (int h = 0; h < Math.min(k - i - j, (int) list.size()); h++) {
					if (list.get(h) < 0)
						cur -= list.get(h);
				}
				ans = Math.max(ans, cur);
			}
		}

		System.out.println(ans);
	}
}
