import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] a = new int[n];
		int[] b = new int[n];

		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());

			if (count.containsKey(b[i])) {
				count.put(b[i], count.get(b[i]) + 1);
			} else {
				count.put(b[i], 1);
			}
		}

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1, o2) -> count.get(o2) - count.get(o1));

		for (Integer key : count.keySet()) {
			pq.add(key);
		}

		boolean ok = true;

		for (int i = 0; i < n && ok; i++) {

			if (!pq.isEmpty()) {

				int b1 = pq.poll();

				if (b1 == a[i]) {
					if (pq.isEmpty()) {
						ok = false;
					} else {

						int b2 = pq.poll();

						if (count.get(b2) > 1) {
							count.put(b2, count.get(b2) - 1);
							pq.add(b2);
						}

						b[i] = b2;
						pq.add(b1);
					}
				} else {
					if (count.get(b1) > 1) {
						count.put(b1, count.get(b1) - 1);
						pq.add(b1);
					}
					b[i] = b1;
				}
			} else {
				ok = false;
			}
		}

		if (!ok) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
			for (int i = 0; i < n - 1; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println(b[n - 1]);
		}
	}
}