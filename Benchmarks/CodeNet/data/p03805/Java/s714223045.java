import java.util.*;

public class Main {
	static int ans;
	static int n;
	static int m;
	static int[][] e;
	static int[] c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		m = Integer.parseInt(sc.next());

		e = new int [n][n];
		c = new int [n];

		for(int i=0; i<m; i++){
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			e[a-1][b-1] = 1;
			e[b-1][a-1] = 1;
		}

		c[0] = 1;
		dfs(0, n);
		System.out.println(ans);
	}
	public static void dfs(int number, int q){
		if (q == 1){
			ans ++;
			return;
		}
		for (int i=1; i<n; i++){
			if (e[number][i] == 1 && c[i] != 1){
				c[i] = 1;
				dfs(i, q-1);
				c[i] = 0;
			}
		}
	}
}
