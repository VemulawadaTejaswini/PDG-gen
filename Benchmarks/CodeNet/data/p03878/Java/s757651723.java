import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		int mod = 1000000007;
		Arrays.sort(a);
		Arrays.sort(b);

		long ans = 1;
		int ai = 0;
		int bi = 0;
		Queue<Integer> qa = new ArrayDeque<>();
		Queue<Integer> qb = new ArrayDeque<>();
		while (ai < n || bi < n) {
			if (ai < n && (bi == n || a[ai] < b[bi])) {
				if (qb.isEmpty()) {
					qa.add(a[ai]);
				} else {
					ans *= qb.size();
					ans %= mod;
					qb.poll();
				}
				ai++;
			} else {
				if (qa.isEmpty()) {
					qb.add(b[bi]);
				} else {
					ans *= qa.size();
					ans %= mod;
					qa.poll();
				}
				bi++;
			}
		}
		System.out.println(ans);
	}
}
