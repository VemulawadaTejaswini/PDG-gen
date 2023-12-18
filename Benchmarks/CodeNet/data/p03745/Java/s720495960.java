import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	void run() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] A = new long[n];
		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextLong();
		}

		ArrayDeque<Long> que = new ArrayDeque<>();

		for (int i = 0; i < n; ++i) {
			if (i - 1 >= 0 && A[i - 1] == A[i])
				continue;
			que.add(A[i]);
		}

		int cnt = 0;
		ArrayList<Long> cur = new ArrayList<>();
		while (!que.isEmpty()) {
			long v = que.pollFirst();
			if (cur.size() < 2) {
				if (cur.size() == 0)
					++cnt;
				cur.add(v);
				continue;
			}

			if ((cur.get(cur.size() - 1) - cur.get(cur.size() - 2)) * (v - cur.get(cur.size() - 1)) >= 0) {
				cur.add(v);
			} else {
				cur.clear();
				cur.add(v);
				++cnt;
			}
		}
		System.out.println(cnt);

	}
}