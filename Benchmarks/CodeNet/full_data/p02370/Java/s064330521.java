import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	int totalVertex;
	ArrayList<LinkedList<Integer>> adjList;
	
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		int totalEdges = in.nextInt();
		adjList = new ArrayList<>();
		
		for(int i = 0; i < totalVertex; i++) {
			adjList.add(new LinkedList<Integer>());
		}
		for(int i = 0; i < totalEdges; i++) {
			int source = in.nextInt();
			int edge = in.nextInt();
			adjList.get(source).add(edge);
		}
		in.close();
	}
	
	public void topoSort() {
		Stack<Integer> stack = new Stack<>();
		boolean[] visited = new boolean[totalVertex];
		for(int i = 0; i < totalVertex; i++) {
			if(!visited[i]) { //runs DFS on all nodes (even unconnected graphs)
				DFS(i, visited, stack);
			}
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	public void DFS(int node, boolean[] visited, Stack<Integer> stack) {
		visited[node] = true;
		LinkedList<Integer> neighbors = adjList.get(node);
		for(Integer n : neighbors){ //alwasy use enhanced for loop for LL bc otherwise running n squared
			if(!visited[n]) {
				DFS(n, visited, stack); //this callse dfs on all unvisited neighbors
			}
		}
		stack.push(node); //now we are allowed to put the original node on the stack bc we finished traversing the childresn
	}
	
	public static void main(String[] args) {
		Main Graph = new Main();
		Graph.loadAdjList();
		Graph.topoSort();
	}

}

