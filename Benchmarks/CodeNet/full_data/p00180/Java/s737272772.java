import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class br implements Comparable<br> {
		int a;
		int b;
		int c;

		br(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		public int compareTo(br t) {
			return this.c - t.c;
		}
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			if ((n | m) == 0) {
				break;
			}

//			int[][] map = new int[n][n];

			for (int i = 0; i < n; i++) {
//				Arrays.fill(map[i], 12345);
			}
			PriorityQueue<br> l = new PriorityQueue<br>();
			// LinkedList<br> l = new LinkedList<br>();

			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				l.add(new br(a, b, c));
			}
			int count = n - 1;
			int ans = 0;

			int p[] = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = i;
			}
			for (;;) {
				if (count == 0) {
					break;
				}

				br s = l.poll();

				int a = s.a;

				int pa = p[a];
				while (p[pa] != pa) {
					int z = pa;
					pa = p[pa];
					p[z] = pa;
				}
				int b = s.b;
				int pb = p[b];
				while (p[pb] != pb) {
					int z = pb;
					pb = p[pb];
					p[z] = pb;
				}

				if (pb == pa) {
					continue;
				} else {
					p[pa] = pb;
					count--;
					ans += s.c;
				}

			}
			System.out.println(ans);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}