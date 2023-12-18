import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] col = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			--a[i];
			col[a[i]]++;
		}
		PriorityQueue<Integer> pq = new PriorityQueue();
		for (int i = 0; i < n; ++i) {
			if (col[i] != 0) {
				pq.add(col[i]);
			}
		}
		int ans = 0;
		while (pq.size() > k) {
			ans += pq.poll();
		}
		System.out.println(ans);
	}
}
