import java.util.Scanner;

public class Main {

	static long ans = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		int[] a = new int[Q];
		int[] b = new int[Q];
		int[] c = new int[Q];
		int[] d = new int[Q];
		for(int i = 0; i < Q; i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
			c[i] = Integer.parseInt(sc.next());
			d[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int[] e = new int [N + 1];
		dfs(1, N, 1, e, a, b, c, d, Q, M);
        System.out.println(ans);

	}

	private static void dfs(int v, int n, int num, int[] e , int[] a, int[] b, int[] c, int[] d, int q, int m) {
		if(n < v) {
			long tmp = 0;
			for(int i = 0; i < q; i++) {
				if(e[b[i]] - e[a[i]] == c[i]) {
					tmp += d[i];
				}
			}
			ans = Math.max(ans, tmp);
			return;
		}
		for (int i = num; i <= m; i++) {
            e[v] = i;
            dfs(v + 1, n, i, e, a, b, c, d, q, m);
        }
	}

}
