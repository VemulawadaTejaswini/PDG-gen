
//template code, C343, 2019
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;

class Graph2 {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph2() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		
		int edges = in.nextInt();
		
		for(int i = 0; i < totalVertex; i++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			adjList.add(tmp);
		}
		
		for(int i = 0; i < edges; i++) {
			int v1 = in.nextInt();
			int v2 = in.nextInt();
			
			adjList.get(v1).add(v2);
		}
		
		in.close();
	}
	
	
	public void printAdjMatrix() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		
		for (int i = 0; i < adjMatrix.length; i++) {
			for (int j = 0; j < adjMatrix[0].length; j++) {
				adjMatrix[i][j] = 0;
			}
		}
		
		for (int i = 0; i < totalVertex; i++) {
			LinkedList<Integer> list = adjList.get(i);
			
			Iterator<Integer> itr = list.iterator();
			while(itr.hasNext()) {
				adjMatrix[i][itr.next()] = 1;
			}
		}
		
		String ans = "";
		for (int i = 0; i < adjMatrix.length; i++) {
			for (int j = 0; j < adjMatrix[0].length; j++) {
				if (j == adjMatrix[0].length - 1) {
					ans += adjMatrix[i][j];
				} else {
					ans += adjMatrix[i][j] + " ";
				}
			}
			ans += "\n";
		}
		
		System.out.print(ans);
	}
	
	public static int time = 1;
	public void dfs(int idx, int[] discover, int[] finish, int[] visited) {
			
			
			discover[idx] = time;
			time++;
			visited[idx] = 1;
			
			LinkedList<Integer> list = adjList.get(idx);
			
			for (int i = 0; i < list.size(); i++) {
				int next = list.get(i);
				
				if (visited[next] == 0) {
					dfs(next, discover, finish, visited);
				}
				
				
			}
			
			finish[idx] = time;
			time++;
		}

	
	public int getTotalVertex() {
		return totalVertex;
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph2 g = new Graph2();
		g.loadAdjList();
		
		
		int[] discover = new int[g.getTotalVertex()];
		int[] finish = new int[g.getTotalVertex()];
		int[] visited = new int[g.getTotalVertex()];
		
		g.dfs(0, discover, finish, visited);
		
//		System.out.println(Arrays.toString(visited));
		for (int i = 0; i < g.getTotalVertex(); i++) {
			if (visited[i] == 0) {
				g.dfs(i, discover, finish, visited);
			}
		}
		
		

		
		boolean[] vis = new boolean[g.getTotalVertex()];
		
		for (int i = 0; i < g.getTotalVertex(); i++) {
			int max = -1;
			int maxIdx = -1;
			
			for (int j = 0; j < g.getTotalVertex(); j++) {
				if(finish[j] > max && vis[j] == false) {
					max = finish[j];
					
//					System.out.println(Arrays.toString(vis));
					maxIdx = j;
				}
			}
			
			vis[maxIdx] = true;
			System.out.println(maxIdx);
		}
		

	}
}


