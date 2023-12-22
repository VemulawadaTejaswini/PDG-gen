
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
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
		//complete the following
		for(int i = 0; i < adjList.size(); i++) {
			for(int j = 0; j < totalVertex; j++) {
				adjMatrix[i][j] = 0;
			}
		}
		for(int i = 0; i < adjList.size(); i++) {
			for(int j = 0; j < adjList.get(i).size(); j++) {
				adjMatrix[i][adjList.get(i).get(j)] = 1;				
			}
		}	
		for(int i = 0; i < adjList.size(); i++) {
			for(int j = 0; j < totalVertex; j++) {
				if(j == totalVertex - 1) {
					System.out.print(adjMatrix[i][j]);
				}
				else {
					System.out.print(adjMatrix[i][j] + " ");
				}				
			}
			System.out.println();
		}
	}
	
	public void printDFS() {
        int[] d = new int[totalVertex];
        int[] f = new int[totalVertex];
        int timestamp = 1;
        for (int i = 0; i < totalVertex; i++) {
            if (d[i] == 0) {
                timestamp = DFS(i, timestamp, d, f) + 1;
            }
        }
        for (int i = 0; i < totalVertex; i++) {
            System.out.println((i + 1) + " " + d[i] + " " + f[i]);
        }
    }
	
    public int DFS(int v, int time, int[] d, int[] f) {
        d[v] = time;
        
        LinkedList<Integer> list = adjList.get(v);
        for (Integer i : list) {
            if (d[i] == 0) {
                time++;
                time = DFS(i, time, d, f);
            }
        }
        f[v] = time + 1;
        return time + 1;
    }
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main{
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		//g.printAdjMatrix();
		g.printDFS();
	}
}
