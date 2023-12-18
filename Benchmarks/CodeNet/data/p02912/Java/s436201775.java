import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		do {
			int n = in.nextInt();
			int m = in.nextInt();
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for (int i = 0; i < n; i++)
				pq.add(-1 * in.nextInt());
			System.out.println(solve(n, m, pq));
		} while (TEST);
	}

	private static long solve(int n, int m, PriorityQueue<Integer> pq) {
		for (int i = 0; i < m; i++)
			pq.add(pq.poll() / 2);
		long r = 0;
		for (int i : pq)
			r -= i;
		return r;
	}
}