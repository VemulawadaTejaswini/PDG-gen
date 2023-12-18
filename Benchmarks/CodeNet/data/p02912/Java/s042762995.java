import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		Queue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			queue.add(in.nextLong());
		}
		for (int i = 0; i < M; i++) {
			queue.add(queue.poll() / 2);
		}
		long ans = 0;
		while (!queue.isEmpty()) {
			ans += queue.poll();
		}
		System.out.println(ans);
		in.close();
	}
}