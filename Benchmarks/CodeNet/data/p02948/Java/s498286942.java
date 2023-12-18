import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	static class Work {
		public Work(int a, int b) {
			this.a = a;
			this.b = b;
		}

		int a;
		int b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		Work[] w = new Work[n];
		for (int i = 0; i < n; i++) {
			w[i] = new Work(in.nextInt(), in.nextInt());
		}
		System.out.println(solve(n, m, w));
		in.close();
	}

	private static long solve(int n, int m, Work[] w) {
		Arrays.sort(w, new Comparator<Work>() {
			@Override
			public int compare(Work o1, Work o2) {
				if (o1.a < o2.a) // a is ascending
					return -1;
				else
					return 1;
			}
		});

		if (TEST)
			for (int i = 0; i < n; i++)
				System.out.println(w[i].a + " " + w[i].b);

		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2)
					return 1;
				else
					return -1;
			}
		});

		int r = 0;
		int p = 0;
		for (int i = 1; i <= m; i++) {
			for (; p < n; p++)
				if (w[p].a > i)
					break;
				else
					pq.add(w[p].b);
			if (!pq.isEmpty())
				r += pq.poll();
		}
		return r;
	}

}