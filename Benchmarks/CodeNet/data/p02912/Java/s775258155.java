import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			q.add(Integer.parseInt(sc.next()));
		}

		for (int i = 0; i < m; i++) {
			q.add(q.poll()/2);
		}

		long ans = 0;
		Integer[] a = q.toArray(new Integer[0]);

		for (int i = 0; i < a.length; i++) {
			ans += a[i];
			System.out.println(ans);
		}

		System.out.println(ans);
		sc.close();
	}
}