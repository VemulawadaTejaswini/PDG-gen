import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");

		PriorityQueue<Long> pq = new PriorityQueue<>();

		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(str[i]);
			pq.add(a);
		}

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			int b = Integer.parseInt(str[0]);
			long c = Long.parseLong(str[1]);

			for (int j = 0; j < b; j++) {
				long num = pq.peek();
				if (num < c) {
					pq.poll();
					pq.add(c);
				} else {
					break;
				}
			}
		}

		long ans = 0;
		for (long l : pq) {
			ans += l;
		}

		System.out.println(ans);
	}
}