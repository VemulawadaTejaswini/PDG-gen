import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		ArrayList<Integer>[] edge = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			edge[i] = new ArrayList<>();
		}
		int a, b;
		for (int i = 0; i < n - 1; i++) {
			a = sc.nextInt() - 1;
			b = sc.nextInt() - 1;
			edge[a].add(b);
			edge[b].add(a);
		}
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		boolean[] memo = new boolean[n];
		int[] fen = new int[n];
		deque.add(0);
		memo[0] = true;
		while (!deque.isEmpty()) {
			int tmp = deque.poll();
			for (int i : edge[tmp]) {
				if (!memo[i]) {
					deque.add(i);
					fen[i] = fen[tmp] + 1;
					memo[i] = true;
				}
			}
		}

		deque = new ArrayDeque<>();
		memo = new boolean[n];
		int[] snuke = new int[n];
		deque.add(n-1);
		memo[n-1] = true;
		while (!deque.isEmpty()) {
			int tmp = deque.poll();
			for (int i : edge[tmp]) {
				if (!memo[i]) {
					deque.add(i);
					snuke[i] = snuke[tmp] + 1;
					memo[i] = true;
				}
			}
		}

		int fcnt = 0, scnt = 0;
		for (int i = 0; i < n; i++) {
			if (fen[i] <= snuke[i]) {
				fcnt++;
			} else {
				scnt++;
			}
		}
		System.out.println((fcnt > scnt) ? "Fennec" : "Snuke");
	}
}
