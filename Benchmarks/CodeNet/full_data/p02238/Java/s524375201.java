//template code, C343, 2019
import java.util.*;

class Graph2 {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private int[] discoverTime;
	private int[] finishTime;
	private int searchTime;
	//adjacency list of edges
	public Graph2() { totalVertex = 0; searchTime = 1;}
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		discoverTime = new int[totalVertex];
		finishTime = new int[totalVertex];
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	public void printAdjMatrix() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		Iterator<LinkedList<Integer>> it = adjList.iterator();
		int x = 0;
		while(it.hasNext()) {
			LinkedList<Integer> curr = it.next();
			Iterator<Integer> it2 = curr.iterator();
			while(it2.hasNext()) {
				adjMatrix[x][it2.next()] = 1;
			}
			x++;
		}
		for(int i = 0; i < totalVertex; i++) {
			String temp = "";
			for(int j = 0; j < totalVertex; j++) {
				if(adjMatrix[i][j] == null) {
					temp += "0 ";
				}
				else {
					temp += "1 ";
				}
			}
			System.out.println(temp.substring(0, temp.length() - 1));
		}
	}
	
	public void dfs(int n) {
		discovered(n);
		LinkedList<Integer> curr = adjList.get(n);
		for(int x: curr) {
			if(discoverTime[x] == 0) {
				dfs(x);
			}
		}
		finished(n);
	}
	
	public void discovered(int n) {
		discoverTime[n] = searchTime;
		searchTime++;
	}
	
	public void finished(int n) {
		finishTime[n] = searchTime;
		searchTime++;
	}
	
	public void searchResults() {
		for(int i = 0; i < totalVertex; i++) {
			if(discoverTime[i] == 0) {
				dfs(i);
			}
			System.out.println((i + 1) + " " + discoverTime[i] + " " + finishTime[i]);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Graph2 g = new Graph2();
		g.loadAdjList();
		g.searchResults();
	}
}

