import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long nowtime = System.currentTimeMillis();
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		ArrayList<ArrayDeque<Integer>> Date = new ArrayList<ArrayDeque<Integer>>();
		for (int i = 0; i < N; i++) {
			ArrayDeque<Integer> buf = new ArrayDeque<Integer>();
			for (int j = 0; j < N - 1; j++) {
				buf.add(scn.nextInt() - 1);
			}
			Date.add(buf);
		}

		boolean Fin[] = new boolean[N];
		boolean done[] = new boolean[N];
		boolean can = true, fin = false;
		int ans = 0;

		ArrayDeque<Integer> now = new ArrayDeque<Integer>();
		ArrayDeque<Integer> next = new ArrayDeque<Integer>();

		for (int i = 0; i < N; i++) {
			next.add(i);
		}

		while (can && !fin) {

			nowtime = System.currentTimeMillis();
			if (nowtime - start > 1900) {
				ans = -1;
				break;
			}

			can = false;
			Arrays.fill(done, false);

			now = next;
			next = new ArrayDeque<Integer>();
			for (int i : now) {

				if (Fin[i]) {
					continue;
				}
				next.add(i);

				if (done[i])
					continue;
				ArrayDeque<Integer> q1 = Date.get(i);
				if (q1.isEmpty()) {
					Fin[i] = true;
					continue;

				}
				int ene = q1.peek();

				if (Fin[ene] || done[ene])
					continue;

				ArrayDeque<Integer> q2 = Date.get(ene);

				int me = q2.peek();
				if (me != i)
					continue;
				q1.poll();
				q2.poll();
				can = true;
				done[i] = true;
				done[ene] = true;
			}
			ans++;

		}
		fin = true;
		for (int i = 0; i < N; i++) {
			fin &= Fin[i];
		}
		System.out.println((fin) ? ans - 1 : -1);

	}

}