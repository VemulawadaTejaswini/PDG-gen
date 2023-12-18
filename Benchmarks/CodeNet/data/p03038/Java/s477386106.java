import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		long a[] = new long[n];

		str = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}

		ArrayList<Long> d = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");

			long b = Long.parseLong(str[0]);
			long c = Long.parseLong(str[1]);

			for (int j = 0; j < b; j++) {
				d.add(c);
			}
		}

		Arrays.sort(a);
		Collections.sort(d, Comparator.reverseOrder());

		long sum = 0;
		int aI = 0;
		int dI = 0;

		for (int i = 0; i < n; i++) {
			if (aI < a.length && dI < d.size())
				sum += Math.max(a[aI++], d.get(dI++));
			else if (aI < a.length) {
				sum += d.get(dI++);
			} else if (dI < d.size()) {
				sum += a[aI++];
			}
		}

		System.out.println(sum);
	}
}