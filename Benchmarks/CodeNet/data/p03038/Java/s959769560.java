import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int M = s.nextInt();

			PriorityQueue<int[]> queue = new PriorityQueue<int[]>(
					(ary1, ary2) -> -ary1[0] + ary2[0]);
			for (int i = 0; i < N; i++) {
				int a = s.nextInt();
				queue.add(new int[] { a });
			}

			for (int i = 0; i < M; i++) {
				int b = s.nextInt();
				int c = s.nextInt();

				for (int j = 0; j < b; j++) {
					queue.add(new int[] { c });
				}
			}

			long sum = 0;
			for (int i = 0; i < N; i++) {
				sum += queue.poll()[0];
			}
			System.out.println(sum);
		}
	}
}
