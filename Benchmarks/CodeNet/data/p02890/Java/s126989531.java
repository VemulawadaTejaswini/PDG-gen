import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		long startTime = System.currentTimeMillis();
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 3e5
		int[] A = new int[N];
		int[] cnt = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
			--A[i];
			++cnt[A[i]];
		}
		class Pair {
			long height;
			long duplicate;

			public Pair(long height, long duplicate) {
				this.height = height;
				this.duplicate = duplicate;
			}
		}
		Arrays.sort(cnt);
		ArrayDeque<Pair> dq = new ArrayDeque<>();
		int sz = 0;
		for (int i = 0; i < cnt.length; ++i) {
			if (cnt[i] == 0)
				continue;
			int j = i;
			while (j + 1 < cnt.length && cnt[i] == cnt[j + 1])
				++j;
			dq.addLast(new Pair(cnt[i], j - i + 1));
			sz += j - i + 1;
			i = j;
		}
		dq.addLast(new Pair((long) 1e6, 1));
		long[] ans = new long[N + 1];
		PrintWriter pw = new PrintWriter(System.out);
		long res = 0;
		for (int K = N; K >= 1; --K) {
			if (K > sz)
				continue;
			while (res > 0) {
				if (dq.size() >= 2) {
					Pair p1 = dq.pollFirst();
					Pair p2 = dq.pollFirst();
					if (p1.duplicate * (p2.height - p1.height) <= res) {
						res -= p1.duplicate * (p2.height - p1.height);
						p2.duplicate += p1.duplicate;
						dq.addFirst(p2);
						continue;
					} else if (p1.duplicate <= res) {
						p1.height += res / p1.duplicate;
						res %= p1.duplicate;
						dq.addFirst(p2);
						dq.addFirst(p1);
					} else if (p1.duplicate > res) {
						long d0 = p1.duplicate;
						p1.duplicate = d0 - res;
						Pair p = new Pair(p1.height + 1, res);
						if (p.height == p2.height) {
							p2.duplicate += p.duplicate;
							dq.addFirst(p2);
						} else {
							dq.addFirst(p2);
							dq.addFirst(p);
						}
						dq.addFirst(p1);
						res = 0;
					}
				} else if (dq.size() == 1) {
					throw new AssertionError();
				}
			}
			res += dq.peek().height;
			ans[K] = dq.peek().height;
			dq.peek().duplicate--;
			if (dq.peek().duplicate == 0)
				dq.poll();
		}
		for (int i = 1; i <= N; ++i) {
			pw.println(ans[i]);
		}
		pw.close();
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}