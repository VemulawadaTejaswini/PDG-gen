

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] graph = new int[n][n];
		int[] keys = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				graph[i][j] = in.nextInt();
			}
			keys[i] = 2001;
		}
		keys[0] = 0;
		TreeSet<Integer> spanSet = new TreeSet<Integer>();
		int u = 0;
		while (spanSet.size() < n) {
			u = minKey(keys, spanSet);
			spanSet.add(u);
			for (int i = 0; i < n; i++) {
				if (graph[u][i] != -1 && keys[i] > graph[u][i]) {
					keys[i] = graph[u][i];
				}
			}
		}
		int span = 0;
		for (int i = 0; i < n; i++) {
			span += keys[i];
		}
		System.out.println(span);
		in.close();
	}
	public static int minKey(int[] keys, TreeSet<Integer> spanSet) {
		int spot = 0;
		int value = 2001;
		for (int i = 0; i < keys.length; i++) {
			if (keys[i] < value && !spanSet.contains(i)) {
				spot = i;
				value = keys[i];
			}
		}
		return spot;
	}
}

