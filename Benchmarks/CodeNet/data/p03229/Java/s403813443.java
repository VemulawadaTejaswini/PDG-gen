import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Long> pq1 = new ArrayList<>();
		ArrayList<Long> pq2 = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			Long a = Long.parseLong(br.readLine());

			pq1.add(a);
			pq2.add(a);
		}

		Collections.sort(pq1);
		Collections.sort(pq2, Comparator.reverseOrder());

		long left = pq1.get(0);
		long right = pq2.get(0);

		int one = 1;
		int two = 1;

		long ans = Math.abs(left - right);

		for (int i = 2; i < n; i++) {
			long num = 0;
			if (i % 2 == 0) {
				num = pq1.get(one++);
			} else {
				num = pq2.get(two++);
			}
			if (Math.abs(left - num) > Math.abs(right - num)) {
				ans += Math.abs(left - num);
				left = num;
			} else {
				ans += Math.abs(right - num);
				right = num;
			}
		}

		System.out.println(ans);
	}
}