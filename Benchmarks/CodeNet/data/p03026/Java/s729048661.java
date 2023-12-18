import java.util.*;
import java.lang.*;

public class Main {
	static Graph graph;
	static int[] c;
	static int[] value;
	static int index;
	static boolean[] visited;
	static long sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		graph = new Graph(n);
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			graph.addChild(a, b);
			graph.addChild(b, a);
		}
		c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(c);
		value = new int[n];
		value[0] = c[n - 1];
		index = n - 2;
		visited = new boolean[n];
		sum = 0;
		dfs(0);
		System.out.println(sum);
		for (int i = 0; i < n - 1; i++) {
			System.out.print(value[i] + " ");
		}
		System.out.println(value[n - 1]);
	}
	static void dfs(int node) {
		visited[node] = true;
		int size = graph.child[node].size();
		for (int i = 0; i < size; i++) {
			int child = graph.child[node].get(i);
			if (!visited[child]) {
				value[child] = c[index];
				sum += c[index];
				index--;
				dfs(child);
			}
		}
	}
}

class Graph {
	ArrayList<Integer>[] child;

	Graph(int n) {
		child = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			child[i] = new ArrayList<>();
		}
	}

	void addChild(int node, int v) {
		child[node].add(v);
	}
}