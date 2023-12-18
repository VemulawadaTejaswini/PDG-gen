import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private void dfs(int c, long sum) {
		ans[c] += z[c] + sum;

		sum += z[c];

		for (int child : tree.get(c)) {
			dfs(child, sum);
		}
	}

	private void dfs2(int c, long sum) {
		Deque<List<Long>> q = new ArrayDeque<List<Long>>();
		
		q.add(Arrays.asList((long)c,sum));
		
		while(!q.isEmpty()) {
			List<Long> e = q.poll();
			int cc = (int)(long)e.get(0);
			long ss = e.get(1);
			
			ans[cc] = z[cc] + ss;
			
			ss += z[cc];
			
			for (int child : tree.get(cc)) {
				q.add(Arrays.asList((long)child, ss));
			}
		}
		
	}
	
	List<List<Integer>> tree;
	long[] ans;
	long[] z;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int Q = sc.nextInt();

		tree = new ArrayList<>();

		for (int i = 0; i <= N; i++) {
			tree.add(new ArrayList<>());
		}

		for (int i = 1; i <= N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			tree.get(a).add(b);
		}

		z = new long[N + 1];

		for (int i = 1; i <= Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();

			z[p] += x;
		}

		sc.close();

		ans = new long[N + 1];

		dfs2(1, 0);

		out.println(join(" ", ans));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, long[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}
}
