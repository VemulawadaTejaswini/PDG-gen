import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		// 4 3
		// 1 2 3 4
		// 1 3
		// 2 3
		// 2 4
		Map<Integer, PriorityQueue<Integer>> graph = new HashMap<>();
		for (int i = 0; i < n; i++) {
			graph.put(i + 1, new PriorityQueue<>(m, Collections.reverseOrder()));
		}
		int[] heights = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			heights[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(heights[b]);
			graph.get(b).add(heights[a]);
		}
		int ans = 0;
		for (Map.Entry<Integer, PriorityQueue<Integer>> entry : graph.entrySet()) {
			int node = entry.getKey();
			PriorityQueue<Integer> maxHeap = entry.getValue();
			if (maxHeap.isEmpty() || maxHeap.peek() < heights[node]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}

 
 

 
 
 
 
