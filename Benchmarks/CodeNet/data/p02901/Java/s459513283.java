import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class ABC {
		public ABC(int a) {
			this.a = a;
		}

		int a;
		ArrayList<Integer> c = new ArrayList<>();
		int b = 0;
	}

	static class KEY {
		ArrayList<Integer> k = new ArrayList<>();
	}

	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		do {
			int n;
			int m;
			ABC[] abc;
			if (TEST) {
				n = (int) (Math.random() * 12 + 1);
				System.out.print(n + " ");
				m = (int) (Math.random() * 10 + 1);
				System.out.print(m + "\n");
				abc = new ABC[m];
				for (int i = 0; i < m; i++) {
					abc[i] = new ABC((int) (Math.random() * 100 + 1));
					int b = (int) (Math.random() / 2 * n + 1);
					System.out.print(abc[i].a + " " + b + "\n");
					for (int j = 0; j < b; j++) {
						int t = (int) (Math.random() * n);
						abc[i].c.add(t);
						System.out.print(t + " ");
					}
					System.out.print("\n");
				}
			} else {
				n = in.nextInt();
				m = in.nextInt();
				abc = new ABC[m];
				for (int i = 0; i < m; i++) {
					abc[i] = new ABC(in.nextInt());
					int b = in.nextInt();
					for (int j = 0; j < b; j++)
						abc[i].c.add(in.nextInt() - 1);
				}
			}
			for (int i = 0; i < m; i++)
				for (int c : abc[i].c)
					abc[i].b |= (0x1 << c);
			if (TEST) {
				int t = testSolve(n, m, abc);
				int r = solve(n, m, abc);
				System.out.println(t + " " + r);
				if (t != r)
					System.exit(0);
			} else
				System.out.println(solve(n, m, abc));
		} while (TEST);
	}

	private static int testSolve(int n, int m, ABC[] abc) {
		int[] hs = new int[(int) (Math.pow(2, n) + 1)];
		for (int i = 0; i < hs.length; i++)
			hs[i] = Integer.MAX_VALUE;
		int r = testProc(n, m, abc, hs, 0, 0, 0);
		if (r == Integer.MAX_VALUE)
			return -1;
		else
			return r;
	}

	private static int testProc(int n, int m, ABC[] abc, int[] hs, int p, int a, int c) {
		if (Integer.bitCount(c) == n)
			return a;
		if (p == m)
			return Integer.MAX_VALUE;
		int x = testProc(n, m, abc, hs, p + 1, a, c);
		int y = testProc(n, m, abc, hs, p + 1, a + abc[p].a, c | abc[p].b);
		return Math.min(x, y);
	}

	private static int solve(int n, int m, ABC[] abc) {
		KEY[] key = new KEY[n];
		for (int i = 0; i < n; i++)
			key[i] = new KEY();
		for (int i = 0; i < m; i++)
			for (int c : abc[i].c)
				key[c].k.add(i);
		for (int i = 0; i < n; i++)
			if (key[i].k.size() == 0)
				return -1;

		PriorityQueue<Long> pq = new PriorityQueue<>();
		int[] ht = new int[(int) Math.pow(2, n) + 1];
		pq.add(0l);
		return go(n, m, abc, key, pq, ht);
	}

	private static int go(int n, int m, ABC[] abc, KEY[] key, PriorityQueue<Long> pq, int[] ht) {
		long x = pq.poll();
//		System.out.println("-- " + x);
		int a = (int) (x / 100000);
		int op = (int) (x % 100000);
		if (Integer.bitCount(op) == n)
			return a;
		int y = 0;
		for (; y < n; y++)
			if ((op & (1 << y)) == 0)
				break;
//		System.out.println("-- " + y);
		for (int k : key[y].k) {
			int at = a + abc[k].a;
			int opt = op | abc[k].b;
			if (ht[opt] > 0 && at >= ht[opt])
				continue;
			ht[opt] = at;
			pq.add((long) at * 100000 + opt);
		}
		return go(n, m, abc, key, pq, ht);
	}
}
