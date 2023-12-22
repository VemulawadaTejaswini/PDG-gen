import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] pk = new int[n];
		for (int i = 0; i < n; i++) pk[i] = in.nextInt();
		ArrayList<Integer>[] adj = new ArrayList[n];
		for (int i = 0; i < n; i++) adj[i] = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			adj[a].add(b);
			adj[b].add(a);
		}
		int c = 0;
		ol:
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < adj[i].size(); j++) {
				if (pk[i] <= pk[adj[i].get(j)]) continue ol;
			}
			c++;
		}
		System.out.println(c);
	}
}
