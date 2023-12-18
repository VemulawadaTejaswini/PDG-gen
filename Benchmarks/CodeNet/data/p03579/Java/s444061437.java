import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<n;i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i=0;i<m;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		int[] colors = new int[n];

		if(dfs(graph,0,colors,1)) {
			long count = 0;
			for (int i=0;i<n;i++) {
				if(colors[i] == 1) {
					count++;
				}
			}

			System.out.println(count*(n-count)-m);
		} else {
			System.out.println((long)n*(n-1)/2-m);
		}
	}


	static boolean dfs(List<ArrayList<Integer>> graph, int node, int[] colors, int color) {
		if (color * colors[node] < 0) {
			return false;

		} else if (colors[node] == 0) {
			colors[node]=color;
			boolean tmp = true;
			for (Integer i : graph.get(node)) {
				tmp &= (dfs(graph, i, colors, -color));
			}
			return tmp;

		} else {
			return true;
		}
	}

}
