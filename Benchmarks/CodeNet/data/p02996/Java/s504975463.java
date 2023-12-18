import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int N;
	static long A[], B[];

	static class Pair {
		int x;
		int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new long[N];
		B = new long[N];
		ArrayList<Pair> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			Pair p = new Pair(sc.nextInt(), sc.nextInt());
			list.add(p);
		}

		list.sort((p, q) -> p.y - q.y);

		long t = 0;
		for (int i = 0; i < N; i++) {
			Pair p = list.get(i);
			t += p.x;
			if (t > p.y) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}