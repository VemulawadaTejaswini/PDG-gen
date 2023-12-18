import java.util.*;

public class Main {
	
	static boolean table[][];
	static int n, m;
	static boolean memo[];
	static int cout;
	static boolean check[];
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a = new int[m],
			  b = new int[m];
		table = new boolean[n][n];
		for(int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			table[a[i] - 1][b[i] - 1] = true;
			table[b[i] - 1][a[i] - 1] = true;
		}
		memo = new boolean[n];
		check = new boolean[n];
		memo[0] = true;
		Arrays.fill(check, true);
		cout = 0;
		dfs(0);
		System.out.println(cout);
	}
	
	public static void dfs(int p) {
		if(Arrays.equals(memo, check)) {
			cout++;
			return;
		}
		for(int i = 0; i < n; i++) {
			if(table[p][i] == true && memo[i] == false) {
				memo[i] = true;
				dfs(i);
				memo[i] = false;
			}
		}
		return;
	}
}
