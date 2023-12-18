import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		x--;
		y--;
		
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			int a = i;
			int b = i + 1;
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		graph.get(x).add(y);
		graph.get(y).add(x);
		
		int[] k = new int[n]; // 1~n-1
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int[] dist = new int[n];
				Arrays.fill(dist, -1);
				
				Queue<Integer> que = new ArrayDeque<>();
				
				dist[i] = 0;
				que.add(i);
				
				outer:
				while (!que.isEmpty()) {
					int v = que.poll();
					for (int nv : graph.get(v)) {
						if (dist[nv] != -1) continue;
						dist[nv] = dist[v] + 1;
						if (nv == j) {
							break outer;
						}
						que.add(nv);
					}
				}
				
				k[dist[j]]++;
			}
		}
		
		for (int i = 1; i < n; i++) {
			System.out.println(k[i]);
		}
		
		sc.close();
	}
}
