import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		long a[] = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}

		long s[] = new long[n + 1];
		s[0] = a[0];

		for (int i = 0; i < n - 1; i++) {
			s[i + 1] = s[i] + a[i + 1];
		}

		Arrays.sort(s);

		Map<Long, Long> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(s[i])) {
				map.put(s[i], map.get(s[i]) + 1);
			} else {
				map.put(s[i], 1L);
			}
		}

		long ans = 0;

		int m = 1;
		for (int i = 0; i < n; i++) {
			if (s[i] == s[i + 1]) {
				m++;
			} else {
				m = 1;
			}
			ans += m - 1;
		}

		System.out.println(ans);
	}
}