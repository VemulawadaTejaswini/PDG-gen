
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<Integer>[] arr = new ArrayList[m];

		for(int i = 0;i<m;i++) {
			arr[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;

			arr[a].add(b);
			arr[b].add(a);
		}

		Deque<Integer> q = new ArrayDeque<Integer>();
		int[] dist = new int[n];
		int[] pre = new int[n];

		for(int i = 0;i<n;i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		q.add(0);
		dist[0] = 0;

		while (!q.isEmpty()) {
			int v = q.pollFirst();

			for (int u : arr[v]) {
				if (dist[u] != Integer.MAX_VALUE)
					continue;
				q.push(u);
				dist[u] = dist[v] + 1;
				pre[u] = v;
			}
		}

		System.out.println("Yes");
		for (int i = 1; i < n; i++) {
			System.out.println(pre[i] + 1);
		}

	}

}
