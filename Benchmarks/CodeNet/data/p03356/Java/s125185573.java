import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] p = new int[N];
		List<Integer>[] adj = new List[N];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<>();
		}
		for (int i = 0; i < p.length; i++) {
			p[i] = sc.nextInt() - 1;
		}
		int a, b;
		for (int i = 0; i < M; i++) {
			a = sc.nextInt() - 1;
			b = sc.nextInt() - 1;
			adj[a].add(b);
			adj[b].add(a);
		}
		int ans = 0;
		int[] vis = new int[N];
		int id = 1;
		for (int i = 0; i < N; i++) if (vis[i] == 0) {
			Deque<Integer> cola = new ArrayDeque<>();
			Set<Integer> got = new HashSet<>();
			cola.addFirst(i);
			vis[i] = id;
			while (!cola.isEmpty()) {
				int cur = cola.removeFirst();
				got.add(p[cur]);
				for (int vec : adj[cur]) {
					if (vis[vec] == 0) {
						vis[vec] = id;
						cola.addLast(vec);
					}
				}
			}
			for (int val : got) {
				if (vis[val] == id) ans++;
			}
			id++;
		}
		System.out.println(ans);
	}
}
