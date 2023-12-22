import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = in.readLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int m = Integer.parseInt(tokens[1]);
		ArrayList<Integer>[] adj = new ArrayList[n+1];
		for (int i = 1; i <= n; i++)
			adj[i] = new ArrayList<Integer>();
		int a, b;
		for (int i = 0; i < m; i++) {
			tokens = in.readLine().split(" ");
			a = Integer.parseInt(tokens[0]);
			b = Integer.parseInt(tokens[1]);
			adj[a].add(b);
			adj[b].add(a);
		}
		boolean[] v = new boolean[n+1];
		int ans = 0;
		int size;
		for (int i = 1; i <= n; i++) {
			if (!v[i]) {
				LinkedList<Integer> q = new LinkedList<Integer>();
				q.add(i);
				v[i] = true;
				size = 1;
				while (!q.isEmpty()) {
					int c = q.poll();
					for (int j : adj[c]) {
						if (!v[j]) {
							q.add(j);
							v[j] = true;
							size++;
						}
					}
				}
				ans = Math.max(size, ans);
			}
		}
		System.out.println(ans);
	}
}
