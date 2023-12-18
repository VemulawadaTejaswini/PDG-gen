
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MOD = (long) (1e9 + 7);

	void run() {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long X = sc.nextLong();
		long D = sc.nextLong();
		if (D < 0) {
			X *= -1;
			D *= -1;
		}
		// A(i)=D(i-1)+X
		HashSet<Long> set = new HashSet<>();
		for (int i = 1; i <= N; ++i) {
			set.add(X * i % D);
		}
		set.add(0L);
		long[] id = new long[set.size()];
		int p = 0;
		for (long v : set) {
			id[p++] = v;
		}
		Arrays.sort(id);
		PriorityQueue<long[]>[] pq = new PriorityQueue[set.size()];
		for (int i = 0; i < pq.length; ++i) {
			pq[i] = new PriorityQueue<long[]>(new Comparator<long[]>() {
				@Override
				public int compare(long[] o1, long[] o2) {
					if (o1[0] != o2[0]) {
						return Long.compare(o1[0], o2[0]); // start, end
					} else {
						return Long.compare(o1[1], o2[1]);
					}
				}
			});
		}
		long ans = 0;
		for (int i = 1; i <= N; ++i) {
			long mod = X * i % D;
			int idx = Arrays.binarySearch(id, mod);
			if (idx < 0)
				throw new AssertionError();
			long start = i * (i - 1) / 2;// 0+1+...+i-1=(1/2)i(i-1)
			long end = N * i - i * (i + 1) / 2;// (n-i)...+(n-2)+(n-1)=ni-i(i+1)/2
			pq[idx].add(new long[] { start * D + X * i, end * D + X * i });
		}
		pq[0].add(new long[] { 0, 0 });
		for (int i = 0; i < pq.length; ++i) {
			while (!pq[i].isEmpty()) {
				long[] a = pq[i].poll();
				while (!pq[i].isEmpty() && a[1] >= pq[i].peek()[0]) {
					if (a[1] > pq[i].peek()[1]) {
						pq[i].poll();
					} else {
						long[] b = pq[i].poll();
						a[1] = b[1];
					}
				}
				ans += (a[1] - a[0] + D) / D;
			}
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
