import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			q.add(sc.nextInt());
		}

		while (M != 0) {
			q.add(q.poll() / 2);
			M--;
		}

		long answer = 0;
		for (int item : q) {
			answer += item;
		}

		System.out.println(answer);

	}
}