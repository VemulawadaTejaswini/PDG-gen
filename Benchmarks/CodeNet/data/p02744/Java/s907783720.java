import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		Queue<int[]> queue = new ArrayDeque<int[]>();
		queue.add(new int[] { 0, 0, 1 });
		int[] elm;
		while (!queue.isEmpty()) {
			elm = queue.poll();
			toStd(n, elm[0]);
			if (elm[2] == n) {
				continue;
			}
			for (int i = 0; i <= elm[1]; i++) {
				queue.add(new int[] { elm[0] * 10 + i, elm[1], elm[2] + 1 });
			}
			queue.add(new int[] { elm[0] * 10 + elm[1] + 1, elm[1] + 1, elm[2] + 1 });
		}
	}

	private static void toStd(int n, int s) {
		for (int i = 0; i < n; i++) {
			System.out.print((char) (s % tenTo[n - i] / tenTo[n - 1 - i] + 97));
		}
		System.out.println();
	}

	static int[] tenTo = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 1 };

}
