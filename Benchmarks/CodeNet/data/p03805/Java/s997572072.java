import java.util.*;

public class Main {

	static int c[][];
	static int e[];
	static int ans;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		c = new int[n][n];
		e = new int[n];

		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			c[a-1][b-1] = 1;
			c[b-1][a-1] = 1;
		}

		e[0] = 1;
		dfs(0, n);
		System.out.println(ans);
	}

	public static void dfs(int s, int q) {
		if (q == 1){
			ans ++;
			return;
		}

		for (int i=1; i<n; i++){
			if (c[s][i] == 1 && e [i] == 0){
				e[i] = 1;
				dfs(i, q-1);
				e[i] = 0;
			}
		}
	}
}
