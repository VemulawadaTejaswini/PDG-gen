
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		loop: while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			PriorityQueue<Integer> a = new PriorityQueue<Integer>(Collections.reverseOrder());
			PriorityQueue<Integer> b = new PriorityQueue<Integer>(Collections.reverseOrder());
			for (int i = 0; i < n; i++)
				a.offer(scanner.nextInt());
			for (int i = 0; i < n; i++)
				b.offer(scanner.nextInt());

			int count = 0;
			while (!a.isEmpty()) {
				int aa = a.poll();
				int bb = b.poll();
				if (aa > bb) {
					System.out.println(count * 2 + 1);
					continue loop;
				}
				a.poll();
				count++;
			}
			System.out.println("NA");
		}
	}
}