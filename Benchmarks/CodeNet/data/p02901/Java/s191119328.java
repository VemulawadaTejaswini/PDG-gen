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
	}

	static class KEY {
		ArrayList<Integer> k = new ArrayList<>();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		ABC[] abc = new ABC[m];
		for (int i = 0; i < m; i++) {
			abc[i] = new ABC(in.nextInt());
			int b = in.nextInt();
			for (int j = 0; j < b; j++)
				abc[i].c.add(in.nextInt() - 1);
		}
		System.out.println(solve(n, m, abc));
		in.close();
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
		for (int k : key[0].k) {
			int a = abc[k].a;
			int op = 0;
			for (int i : abc[k].c)
				op |= (1 << i);
			pq.add((long) a * 100000 + op);
		}
		return go(n, m, abc, key, pq);
	}

	private static int go(int n, int m, ABC[] abc, KEY[] key, PriorityQueue<Long> pq) {
		long x = pq.poll();
//		System.out.println("-- " + x);
		int op = (int) (x % 100000);
		if (Integer.bitCount(op) == n)
			return (int) (x / 100000);
		int y = Integer.lowestOneBit(op ^ 0xffff) - 1;
//		System.out.println("-- " + y);
		for (int k : key[y].k) {
			int a = (int) (x / 100000) + abc[k].a;
			for (int i : abc[k].c)
				op |= (1 << i);
			pq.add((long) a * 100000 + op);
		}
		return go(n, m, abc, key, pq);
	}
}
