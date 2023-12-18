import static java.util.Collections.*;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		Queue<Integer> priceQueue = new PriorityQueue<>(reverseOrder());
		for (int i = 0; i < n; i++) {
			priceQueue.add(sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
			priceQueue.add(priceQueue.poll() / 2);
		}

		int total = 0;
		for (int i = 0; i < n; i++) {
			total += priceQueue.poll();
		}
		System.out.println(total);
		sc.close();
	}
}
