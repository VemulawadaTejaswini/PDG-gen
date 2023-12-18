import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			p.add(sc.nextInt());
		}

		while (m > 0) {
			p.add(p.poll() / 2);
			m--;
		}

		long sum = 0;
		for (long num : p) {
			sum += num;
		}

		System.out.println(sum);

		sc.close();
	}
}
