import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	static int totalVertex;
	static ArrayList<ArrayList<Integer>> adjList;
	static int[] distances;
	static ArrayList<Integer> undiscovered;
	
	public static void main(String[] args) {
		
		getInput();
		
		distances = new int[totalVertex];
		undiscovered = new ArrayList<Integer>();
		
		for(int i = 0; i < totalVertex; i++) {
			distances[i] = -1;
			undiscovered.add(i);
		}
		
		distances[0] = 0;
		
		
		
		traverseGraph();
		
		for(int i = 0; i < totalVertex; i++) {
			System.out.println((i + 1) + " " + distances[i]);
		}
		
	}
	
	public static void traverseGraph() {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		undiscovered.remove(undiscovered.indexOf(0));
		queue.add(0);
		
		while(queue.isEmpty() == false) {
			
			int currentNode = (int) queue.remove();
			
			for(int i = 0; i < adjList.get(currentNode).size(); i++) {
				
				int nextNode = adjList.get(currentNode).get(i);
				if(undiscovered.contains(nextNode)) {
					
					undiscovered.remove(undiscovered.indexOf(nextNode));
					
					distances[nextNode] = distances[currentNode] + 1;
					
					queue.add(nextNode);
					
				}
				
			}
			
		}
		
	}
	
	public static void getInput() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
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

}
