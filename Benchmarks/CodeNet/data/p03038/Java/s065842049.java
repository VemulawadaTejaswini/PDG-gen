import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		Arrays.sort(a);

		PriorityQueue<long[]> pq = new PriorityQueue<>((x, y) -> -Long.compare(x[1], y[1]));
		while (m-- > 0) {
			pq.offer(new long[]{sc.nextLong(), sc.nextLong()});
		}

		long answer = 0;
		long[] x = pq.poll();
		int count = 0;
		int idx = n - 1;
		while (count < n) {
			if (x != null && a[idx] < x[1] && x[0] > 0) {
				answer += x[1];
				x[0]--;
				if (x[0] == 0) x = pq.poll();
			} else {
				answer += a[idx--];
			}
			count++;
		}

		System.out.println(answer);
	}
}
