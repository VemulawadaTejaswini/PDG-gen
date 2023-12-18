import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().doIt();
	}

	protected void doIt() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			queue.add(scan.nextInt());
		}
		for (int i = 0; i < M; i++) {
			queue.add(queue.poll() / 2);
		}
		long ans = 0;
		while(!queue.isEmpty()) {
			ans += queue.poll();
		}
		System.out.print(ans);
	}
}
