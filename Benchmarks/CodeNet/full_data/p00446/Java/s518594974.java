import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			ArrayList<Integer> t = new ArrayList<Integer>();
			ArrayList<Integer> h = new ArrayList<Integer>();
			for (int i = 0; i < N; ++i) {
				t.add(sc.nextInt());
			}
			for (int i = 1; i <= 2 * N; ++i) {
				if (!t.contains(i)) h.add(i);
			}
			int top = 0;
			int turn = 0;
			while (!t.isEmpty() && !h.isEmpty()) {
				ArrayList<Integer> hand = turn == 0 ? t : h;
				int min = Integer.MAX_VALUE;
				for (int v : hand) {
					if (v > top && v < min) min = v;
				}
				if (min == Integer.MAX_VALUE) {
					top = 0;
				} else {
					hand.remove(Integer.valueOf(min));
					top = min;
				}
				turn = 1 - turn;
			}
			System.out.println(h.size());
			System.out.println(t.size());
		}
	}
}