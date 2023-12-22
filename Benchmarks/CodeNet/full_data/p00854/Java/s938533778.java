import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && k == 0 && m == 0)
				break;
			Queue<Integer> queue = new LinkedList<Integer>();
			for (int i = 0; i < n; i++)
				queue.add(i + 1);
			for (int i = 0; i < m - 1; i++)
				queue.add(queue.poll());
			queue.poll();
			while (queue.size() > 1) {
				for (int i = 0; i < k - 1; i++)
					queue.add(queue.poll());
				queue.poll();
			}
			int result = queue.poll();
			System.out.println(result);
		}
		sc.close();
	}
}