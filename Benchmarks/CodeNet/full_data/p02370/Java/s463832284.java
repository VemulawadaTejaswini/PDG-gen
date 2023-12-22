import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Queue;

class Graph01 {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	public Graph01() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		int totalH = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			adjList.add(tmp);
		}
		for(int i = 0; i < totalH; i++) {
			int input1 = in.nextInt();
			int input2 = in.nextInt();
			adjList.get(input1).add(input2);
		}
		in.close();
	}
	public void tp() {
		int[] C = new int[totalVertex];
		Queue<Integer> Q = new LinkedList<Integer>();
		
		for(int i = 0; i < totalVertex; i++) {
			LinkedList<Integer> q = adjList.get(i);
			for(Integer neighbor:q) {
				C[neighbor] = C[neighbor] + 1;
			}
		}
		for(int i = 0; i <totalVertex; i++) {
			if(C[i] == 0) {
				Q.add(i);
			}
		}
		while(!Q.isEmpty()) {
			int answer = Q.poll();
			System.out.println(answer);
			LinkedList<Integer> w = adjList.get(answer);
			for(Integer neig:w) {
				C[neig] = C[neig] - 1;
				if(C[neig] == 0) {
					Q.add(neig);
				}
			}
		}
		
		
		
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph01 g = new Graph01();
		g.loadAdjList();
		g.tp();
	}
}

