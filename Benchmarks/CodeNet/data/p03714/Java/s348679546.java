import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int n2 = 2 * n;
		int n3 = 3 * n;
		sa = br.readLine().split(" ");
		int[] a = new int[n3];
		for (int i = 0; i < n3; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long[][] sum = new long[2][n + 1];

		PriorityQueue<Integer> que1 = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			que1.add(a[i]);
			sum[0][0] += a[i];
		}
		for (int i = 0; i < n; i++) {
			que1.add(a[n + i]);
			sum[0][i + 1] = sum[0][i] + a[n + i];
			sum[0][i + 1] -= que1.poll();
		}

		PriorityQueue<Integer> que2 = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		for (int i = n2; i < n3; i++) {
			que2.add(a[i]);
			sum[1][n] += a[i];
		}
		for (int i = 1; i <= n; i++) {
			que2.add(a[n2 - i]);
			sum[1][n - i] = sum[1][n - i + 1] + a[n2 - i];
			sum[1][n - i] -= que2.poll();
		}

		long ans = Long.MIN_VALUE;
		for (int i = 0; i <= n; i++) {
			ans = Math.max(ans, sum[0][i] - sum[1][i]);
		}
		System.out.println(ans);
	}
}
