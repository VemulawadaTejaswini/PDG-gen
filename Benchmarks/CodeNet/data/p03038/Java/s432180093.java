import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			PriorityQueue<Integer> a = new PriorityQueue<>();

			for (int i = 0; i < n; i++) {
				a.add(sc.nextInt());
			}
			int[] b = new int[m];
			int[] c = new int[m];
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				int a_min = a.peek();
				if (a_min >= c[i]) continue;
				for (int j = 0; j < b[i]; j++) {
					a_min = a.peek();
					if (a_min < c[i]) {
						a.poll();
						a.add(c[i]);
					}
					else break;
				}
			}
			long sum = 0;
			for (int i = 0; i < n; i++) {
				sum += a.poll();
			}
			System.out.println(sum);
		}
	}
}