import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static long[] a;
	static long[] b;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			long k = sc.nextInt();

			a = new long[n + 1];
			b = new long[m + 1];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}

			for (int i = 0; i < m; i++) {
				b[i] = sc.nextLong();
			}

			Queue<Node> que = new LinkedList<>();
			Node root = new Node(0, 0, 0);
			que.add(root);

			int result = 0;
			while (que.isEmpty() == false) {
				Node temp = que.poll();

				if (temp.l < n && temp.time + a[temp.l] <= k) {
					que.add(new Node(temp.l + 1, temp.r, temp.time + a[temp.l]));
					result = Math.max(result, temp.l + 1 + temp.r);
				}

				if (temp.r < m && temp.time + b[temp.r] <= k) {
					que.add(new Node(temp.l, temp.r + 1, temp.time + b[temp.r]));
					result = Math.max(result, temp.l + 1 + temp.r);
				}

			}

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static class Node {
		int l;
		int r;
		long time;

		public Node(int l, int r, long time) {
			this.l = l;
			this.r = r;
			this.time = time;
		}
	}

}