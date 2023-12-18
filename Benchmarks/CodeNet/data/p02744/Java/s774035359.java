import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n == 1) {
			System.out.println("a");
			return;
		}
		Queue<int[]> queue = new ArrayDeque<int[]>();
		queue.add(new int[] { 1, 1, 2 });
		List<Integer> result = new ArrayList<Integer>();
		result.add(0);
		int[] elm;
		while (!queue.isEmpty()) {
			elm = queue.poll();
			result.add(elm[0]);
			if (elm[2] == n) {
				continue;
			}
			for (int i = 0; i <= elm[1]; i++) {
				queue.add(new int[] { elm[0] * 10 + i, elm[1], elm[2] + 1 });
			}
			queue.add(new int[] { elm[0] * 10 + elm[1] + 1, elm[1] + 1, elm[2] + 1 });
		}
		int[] arr = new int[n];
		for (int s : result) {
			for (int i = 0; i < n; i++) {
				arr[n - i - 1] = s % 10;
				s /= 10;
			}
			for (int i = 0; i < n; i++) {
				System.out.print((char)( arr[i] + 97));
			}
			System.out.println();
		}
	}

	static int tenTo(int k) {
		if (k == 0)
			return 1;
		return tenTo(k - 1) * 10;
	}

}
