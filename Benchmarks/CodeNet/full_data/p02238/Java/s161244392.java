import java.util.*;

public class Main {
	 
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		//graph instantiation
		int[][] graph = new int[num][num];
		for(int i = 0; i < num; i++) {
			int index = in.nextInt();
			int num_of_neighbors = in.nextInt();
			for(int j = 0; j < num_of_neighbors; j++) {
				graph[index-1][in.nextInt() -1] = 1;
			}
		}
		
		in.close();
		
		
		// to keep track of visited numbers
		Boolean[] visited = new Boolean[num];
		for(int i = 0; i < num; i++) {
			visited[i] = false;
		}
		
		int[] timings = new int[num];
		int[] finish_time = new int[num];
		int curr = 0;
		for(int i = 0; i < num; i++) {
			if(!visited[i])
			curr = DFS(graph, visited, timings, finish_time, curr + 1, i);
		}
		for(int i = 0; i < num; i++) {
			System.out.print((i + 1) + " " + timings[i] + " " + finish_time[i]);
			System.out.println();
		}
	}

	
	public static int DFS(int[][] graph, Boolean[] v, int[] timings, int[] finish_time, int curr, int node) {
		v[node] = true;
		timings[node] = curr;
		for(int i = 0; i < graph.length; i++) {
			if(graph[node][i] == 1 && !v[i]) {
				curr = DFS(graph, v, timings, finish_time, curr + 1, i);
			}
		}	
		curr++;
		finish_time[node] = curr;
		return curr;
	}
	
	
}
