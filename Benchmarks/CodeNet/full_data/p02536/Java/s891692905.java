import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[] s = new boolean[n];
		boolean[][] c = new boolean[n][n];

		for ( int i=0; i<m; i++ ) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;

			c[a][b] = true;
			c[b][a] = true;
		}

		int k = 0;
		for ( int i=0; i<n; i++ ) {
			if ( !s[i] ) {
				dfs(s, c, i);
				k++;
			}
		}

		System.out.println(k-1);
	}

	private static void dfs(boolean[] seen, boolean[][] edge, int vertex) {
		seen[vertex] = true;
		for ( int i=0; i<seen.length; i++ ) {
			if ( edge[vertex][i] && !seen[i] ) dfs(seen, edge, i);
		}
	}
}