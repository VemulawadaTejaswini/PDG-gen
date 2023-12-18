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
		int[] A = new int[n];
		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextInt();
		}

		ArrayDeque<Integer> que = new ArrayDeque<>();
		for (int a : A) {
			que.addLast(a);
		}

		int cnt = 0;
		ArrayList<Integer> cur = new ArrayList<>();
		while (!que.isEmpty()) {
			int v = que.pollFirst();
			if (cur.size() < 2) {
				if (cur.size() == 0)
					++cnt;
				cur.add(v);
				continue;
			}

			if ((long) (cur.get(cur.size() - 1) - cur.get(cur.size() - 2))
					* (long) (v - cur.get(cur.size() - 1)) >= 0) {
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