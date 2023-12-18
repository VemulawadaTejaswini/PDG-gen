import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer>[] a = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			a[i] = new LinkedList<>();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				a[i].offer(sc.nextInt() - 1);
			}
		}

		int days = 0;
		int remain = n * (n - 1) / 2;
		while (remain > 0) {
			boolean[] marked = new boolean[n];

			int count = 0;
			for (int i = 0; i < n; i++) {

				if (marked[i] || a[i].isEmpty()) continue;
				Integer opponent = a[i].peek();
				if (marked[opponent] || a[opponent].isEmpty()) continue;
				if (a[opponent].peek() != i) continue;
				marked[i] = true;
				marked[opponent] = true;
				a[i].poll();
				a[opponent].poll();
				remain -= 1;
				count++;
			}

			if (count == 0) {
				System.out.println(-1);
				return;
			}

			days++;
		}

		System.out.println(days);
	}
}
