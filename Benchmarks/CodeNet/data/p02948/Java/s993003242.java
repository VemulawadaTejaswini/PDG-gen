import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

import javax.print.StreamPrintService;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[][] X = new long[N][2];
		for (int i = 0; i < N; ++i) {
			X[i][0] = sc.nextInt();
			X[i][1] = sc.nextInt();
		}
		long ans = 0;
		Arrays.sort(X, new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				if (o1[0] != o2[0]) {
					return Long.compare(o1[0], o2[0]);
				} else {
					return -Long.compare(o1[1], o2[1]);
				}
			}
		});
		PriorityQueue<Long> pq = new PriorityQueue<>();
		int p = 0;
		for (int i = 1; i <= M; ++i) {
			while (p < X.length && X[p][0] <= i) {
				pq.add(-X[p][1]);
				++p;
			}
			if (!pq.isEmpty()) {
				ans += -pq.poll();
			}
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
